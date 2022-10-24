package Main.day13;
/*
В методе main() этого класса необходимо создать трех пользователей. Затем необходимо:
- Отправить 2 сообщения от пользователя 1 пользователю 2
- Отправить 3 сообщения от пользователя 2 пользователю 1
Сообщения могут быть любыми.
После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
 */

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Slava");
        User user2 = new User("Ivan");
        user1.sendMessage(user2, "Hi, Ivan!");
        user2.sendMessage(user1, "Hi, Slava!");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "All fine!");
        user2.sendMessage(user1, "At you?");
        MessageDatabase.showDialog(user1, user2);
        System.out.println(MessageDatabase.getMessages().get(0).toString());
    }
}
