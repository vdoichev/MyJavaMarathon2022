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
//            player.refreshOwnMarineBoard();
//            player.getOwnBoard().print();
            //System.out.println(player.ships);
        }
    }

    private static void AddShipsForPlayer(Player player, Scanner scanner) {
        System.out.println("Почнемо розкладати кораблі на полі гравця " + player.getName() +
                "! Іншій гравець не дивиться!");
        player.getOwnBoard().print();


        for (Ship ship : player.ships) {
            boolean isCheckShip = false;
            do {
                System.out.println("Введи координати " + ship.getSizeStr() +
                        " корабля (формат: " + ship.getFormat() + ")");
                String[] shipCoordinates = scanner.nextLine().split(";");
                if (shipCoordinates.length == ship.getSize()) {
                    for (int i = 0; i < shipCoordinates.length; i++) {
                        String[] cellCoordinates = shipCoordinates[i].split(",");
                        if (cellCoordinates.length == 2) {
                            int x = Integer.parseInt(cellCoordinates[0]);
                            int y = Integer.parseInt(cellCoordinates[1]);
                            if (x >= 0 && x < 10 && y >= 0 && y < 10) {
                                ship.addCell(i, x, y);
                                isCheckShip = true;
                            } else System.out.println("Не вірно вказані координати! " +
                                    "Допустимий діапазон числа: 0-9");
                        } else System.out.println("Не вірно вказані коордінати!");
                    }
                } else System.out.println("Не вірно вказані коордінати! " +
                        "Не відповідність розміру корабля");
            } while (!isCheckShip);
            player.refreshOwnMarineBoard();
            player.getOwnBoard().print();
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
