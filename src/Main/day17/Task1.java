package Main.day17;
/*
Используя созданный enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных
ладьи. Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.
 */

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = new ChessPiece[8];
        for (int i = 0; i < pieces.length; i++) {
            pieces[i] = (i < 4) ? ChessPiece.PAWN_WHITE : ChessPiece.ROOK_BLACK;
        }
        for (ChessPiece piece : pieces) {
            System.out.print(piece.getDescription() + " ");
        }
    }
}
