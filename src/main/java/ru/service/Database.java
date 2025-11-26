package ru.service;

import ru.channel.ChannelChat;
import ru.group.Group;
import ru.user.User;
import ru.user.UserChat;

public class Database {
    public static User anita = new User("Тимлид Анита", "19:12", "босс", "12.07.2019", "+7800553535", "12.12.2007"); // pppppp
    public static User alena = new User("Алёна", "14:25", "айпадкид", "08.11.2020", "+7800663535", "09.09.2007");
    public static User diana = new User("Вы", "21:52", "танцуй танцулька", "15.12.2019", "+7800773535", "12.04.2007");
    public static User kristina = new User("Кристина", "23:18", "работяга", "23.06.2020", "+7800883535", "11.10.2007");
    public static ChannelChat[] news = {new ChannelChat("Казань на Максималках", 317800), new ChannelChat("Новости ИТИС", 5720), new ChannelChat("Лучшие люди", 1230400), new ChannelChat("Секреты успешных людей", 3715678)};
    public static Group[] groups = {new Group("Инфа проект",4,  new String[]{anita.getUserName(), alena.getUserName(), diana.getUserName(), kristina.getUserName()}), new Group("рабы", 3, new String[]{alena.getUserName(), diana.getUserName(), kristina.getUserName()}), new Group( "ДУшнилы", 3, new String[]{anita.getUserName(), alena.getUserName(), diana.getUserName()})};
    public static UserChat[] chats = {new UserChat(anita), new UserChat(alena), new UserChat(diana), new UserChat(kristina)};
}
