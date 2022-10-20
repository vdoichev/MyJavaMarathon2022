package Main.day7;
/*
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player),
содержит следующие поля:
    - поле “выносливость” (англ. stamina), разное для каждого экземпляра
    - константы “максимальная выносливость” (англ. MAX_STAMINA) со значением
    100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0,
    единые для всех экземпляров
    - статическое поле countPlayers, которое считает количество игроков на
    футбольном поле (изначально их 0, выходом на поле считается создание
    экземпляра класса, уходом - когда игрок устал).
    - геттер для поля “выносливость”
и следующие методы:
run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость на 1
при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
info() - выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6,
то выводит сообщение: “Команды неполные. На поле еще есть ... свободных мест”,
иначе: “На поле нет свободных мест”. Грамматикой русского языка пренебречь,
т.е. фраза “еще есть 1 свободных мест” допустима.
 */

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return this.stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        this.stamina--;
        if (this.stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers > 0 && countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
