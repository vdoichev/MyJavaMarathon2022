package Main.day7;
/*
2. Дворовый футбол.
Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при создании должен
иметь значение выносливости от 90 до 100 (генерировать внутри конструктора). Создать 6 игроков,
вызвать метод info(). При попытке создать 7,8 ... n игрока, количество игроков на поле
меняться не должно, проверить это.
Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости
не допускается). Вывести количество игроков на поле.
*По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика русского языка
учитывалась.
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player(90 + rand.nextInt(10));
        Player player2 = new Player(90 + rand.nextInt(10));
        Player player3 = new Player(90 + rand.nextInt(10));
        Player player4 = new Player(90 + rand.nextInt(10));
        Player player5 = new Player(90 + rand.nextInt(10));
        Player player6 = new Player(90 + rand.nextInt(10));
        Player.info();
        Player player7 = new Player(90 + rand.nextInt(10));
        Player player8 = new Player(90 + rand.nextInt(10));
        System.out.println(Player.getCountPlayers());
        int playerStamina = player2.getStamina();
        System.out.println(playerStamina);
        for (int i = -1; i<playerStamina-1;i++){
            player2.run();
        }
        System.out.println(player2.getStamina());
        Player.info();
    }
}
