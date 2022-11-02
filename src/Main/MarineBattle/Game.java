package Main.MarineBattle;

import Main.MarineBattle.Ships.Ship;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        System.out.println("---------------Вітаємо у грі \"Морський бій\"---------------");
        Scanner scanner = new Scanner(System.in);
        Deque<Player> players = addPlayersToGame(scanner);
        for (Player player : players) {
            AddShipsForPlayer(player, scanner);
        }


    }

    private static void AddShipsForPlayer(Player player, Scanner scanner) {
        System.out.println("Почнемо розкладати кораблі на полі гравця " + player.getName() +
                "! Іншій гравець не дивиться!");
        player.getOwnBoard().print();
        System.out.println(player.ships);
        for (Ship ship: player.ships) {

//            String countStr;
//            switch (ship.getCount()){
//                case 4:{
//                    countStr = "";
//                    break;
//                }
//            }

            System.out.println("Введи координати "+ship.getSizeStr()+" корабля (формат: "+
                    ship.getFormat()+")");
            scanner.nextLine();//.split(";");


        }


    }

    /**
     * Додаємо гравців до гри
     *
     * @param scanner - через командну строку
     * @return - повертаємо чергу з двох гравців
     */
    private static Deque<Player> addPlayersToGame(Scanner scanner) {
        Deque<Player> players = new LinkedList<>();
        System.out.println("Введіть і'мя першого гравця:");
        players.addFirst(new Player(scanner.nextLine()));
        System.out.println("Введіть і'мя другого гравця:");
        players.addLast(new Player(scanner.nextLine()));
        return players;
    }
}
