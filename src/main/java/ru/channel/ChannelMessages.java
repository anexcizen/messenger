package ru.channel;
import ru.service.Message;

public class ChannelMessages extends Message{
    public ChannelMessages(String chatName, String text, String date, String time) {
        super(chatName, text, date, time);
    }

    public static ChannelMessages[] getAllNews() {
        ChannelMessages[] news = {new ChannelMessages("Казань на Максималках", "в казани умерло 5 человек", "23 ноября", "14:12"), new ChannelMessages("Казань на Максималках", "депутаты из совфеда заставляют рожать сразу после 18", "25 ноября", "13:45"),
                new ChannelMessages("Новости ИТИС", "на допку по алгему попала половина студентов", "14 января", "09:27"), new ChannelMessages("Учим питон вместе", "print(5) выведет 5", "29 ноября", "11:00"),
                new ChannelMessages("Лучшие люди", "сегодня родилась великая личность. Анита Талбиева Ильшатовна", "12.12.2007", "10:00"), new ChannelMessages("Секреты успешных людей", "Вам стоит вставать рано, чтобы ложиться поздно", "11 октября", "10:12"),
                new ChannelMessages("Секреты успешных людей", "если не погибать, то не умрешь", "19 января", "18:03"), new ChannelMessages("Секреты успешных людей", "Богатый человек тот кто имеет много денег", "16 декабря", "17:45")
        };
        return news;
    }
}

