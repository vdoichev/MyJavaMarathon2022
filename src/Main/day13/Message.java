package Main.day13;
/*
Поля:
- Поле типа User “отправитель” (англ. sender) - отправитель сообщения
- Поле типа User “получатель” (англ. receiver) - получатель сообщения
- Строковое поле “текст” (англ. text) - текст сообщения
- Поле типа Date “дата” (англ. date) - дата отправки сообщения
Конструктор:
- Конструктор должен принимать 3 аргумента - отправителя, получателя и текст
сообщения. Также, конструктор должен назначать полю date текущее время (то есть время создания объекта
Message).
Методы:
- Геттеры на все поля
- Метод toString(), который возвращает строковое представление сообщения
 */

import java.util.Date;

public class Message {
    private final User sender;
    private final User receiver;
    private final String text;
    private final Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "FROM: " + sender.getUsername() + "\n" +
                "TO: " + receiver.getUsername() + "\n" +
                "ON: " + date + "\n" +
                text;
    }
}
