package Main.day16;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        createFile1(fileName1);
        createFile2(fileName1, fileName2);
        printResult(fileName2);
    }

    public static void printResult(String fileName) {
        try (RandomAccessFile fileRead = new RandomAccessFile(fileName, "r")) {
            FileChannel channel = fileRead.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            StringBuilder sb = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                buffer.flip();

                while (buffer.hasRemaining()) {
                    sb.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(sb);
            String[] numbersArray = sb.toString().split(" ");
            int summa = 0;
            for (String numbers : numbersArray) {
                summa += (Double.parseDouble(numbers));
            }
            System.out.println(summa);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void createFile1(String fileName) {
        Random rand = new Random();
        try {
            PrintWriter pw = new PrintWriter(fileName);
            for (int i = 0; i < 1000; i++) {
                pw.print(rand.nextInt(1000) + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFile2(String fileNameRead, String fileNameWrite) {
        try (RandomAccessFile fileRead = new RandomAccessFile(fileNameRead, "r");
             RandomAccessFile fileWrite = new RandomAccessFile(fileNameWrite, "rw")
        ) {
            String line = fileRead.readLine();
            System.out.println(line);
            String[] numbersArray = line.split(" ");
            int summa = 0;
            for (int i = 0; numbersArray.length > i; i++) {
                summa += Integer.parseInt(numbersArray[i]);
                if ((i + 1) % 4 == 0) {
                    double avg = (double) summa / 4;
                    fileWrite.writeBytes(avg + " ");
                    summa = 0;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
