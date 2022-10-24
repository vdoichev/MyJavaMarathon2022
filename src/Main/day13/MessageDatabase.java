package Main.day13;
/*
Поля:
- Статическое поле “сообщения” (англ. messages), которое будет хранить список
из сообщений (объектов класса Message). Это поле должно инициализироваться пустым списком.
Этот список и есть наша условная “база данных”, которая хранит все сообщения в соц. сети.
Конструктор:
Нет конструктора. Объекты класса MessageDatabase создаваться не будут (все методы и поля статические).
Методы:
- public static void sendMessage(User u1, User u2, String text)
- этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text. Отправка в
нашем контексте означает добавление сообщения в нашу “базу данных”.
- public static List<Message> getMessages() - возвращает список всех сообщений в “базе данных”.
- public static void showDialog(User u1, User u2) - этот метод должен вывести цепочку сообщений (диалог)
пользователей u1 и u2.
 */

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User user1, User user2, String text) {
        addNewMessage(user1, user2, text);
    }

    public static void addNewMessage(User user1, User user2, String text) {
        Message message = new Message(user1, user2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender().equals(u1) && message.getReceiver().equals(u2)) {
                System.out.println(message.getSender().getUsername() + ": " + message.getText());
            }
            if (message.getSender().equals(u2) && message.getReceiver().equals(u1)) {
                System.out.println(message.getSender().getUsername() + ": " + message.getText());
            }
        }
    }
}
