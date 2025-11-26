package ru.service;

import ru.channel.ChannelMessages;
import ru.group.UserAndGroupMessage;

public class ChatHistory {
    public ChatHistory (String name) {
        final String WHITE = "\u001B[38;2;255;255;255m";
        final String PINK = "\u001B[38;2;255;182;192m";
        final String GREEN = "\u001B[38;2;152;251;152m";
        final String LIGHTBLUE = "\u001B[38;2;105;196;255m";

        for (int i = 0; i < Database.news.length; ++i) {
            if (Database.news[i].getName().equals(name)) {
                ChannelMessages[] messages = ChannelMessages.getAllNews();
                System.out.println(LIGHTBLUE);
                System.out.println('"' + name + '"' + "\nКоличество подписчиков: " + Database.news[i].getSubscribers() + "\n");
                System.out.print(WHITE);
                for (int j = 0; j < messages.length; ++j) {
                    if (name.equals(messages[j].chatName)) {
                        System.out.println(PINK + "[" + messages[j].date + " " + messages[j].time + "] : " + WHITE + messages[j].text + "\n");
                    }
                }
                break;
            }
        }
        for (int i = 0; i < Database.groups.length; ++i) {
            if (Database.groups[i].getGroupName().equals(name)) {
                UserAndGroupMessage[] messages = UserAndGroupMessage.getAllMessages();
                System.out.println(LIGHTBLUE);
                System.out.println('"' + name + '"' + "\nКоличество участников: " + Database.groups[i].getCountOfUsers() + "\nСостав участников: " + Database.groups[i].getMembers() + "\n");
                System.out.print(WHITE);
                for (int j = 0; j < messages.length; ++j) {
                    if (name.equals(messages[j].chatName)) {
                        if (messages[j].getFromWhom().equals("Вы")) {
                            System.out.println(PINK + "[" + messages[j].date + " " + messages[j].time + "] : " + GREEN + messages[j].text + "\n");
                        } else {
                            System.out.println(PINK + messages[j].getFromWhom() + " [" + messages[j].date + " " + messages[j].time + "] : " + WHITE + messages[j].text + "\n");
                        }
                    }
                }
                break;
            }
        }
        for (int i = 0; i < Database.chats.length; ++i) {
            if (Database.chats[i].getName().equals(name)) {
                UserAndGroupMessage[] messages = UserAndGroupMessage.getAllMessages();
                System.out.println(LIGHTBLUE);
                if (Database.chats[i].getInfo().equals("В сети")) {
                    System.out.println(name + LIGHTBLUE + "\n" + Database.chats[i].getInfo() + "\n");
                } else {
                    System.out.println(name + LIGHTBLUE + "\nПоследний раз в сети: " + Database.chats[i].getInfo() + "\n");
                }
                System.out.print(WHITE);
                for (int j = 0; j < messages.length; ++j) {
                    if (name.equals(messages[j].chatName)) {
                        if (messages[j].getFromWhom().equals("Вы")) {
                            System.out.println(PINK + "[" + messages[j].date + " " + messages[j].time + "] : " + GREEN + messages[j].text + "\n");
                        } else {
                            System.out.println(PINK + messages[j].getFromWhom() + " [" + messages[j].date + " " + messages[j].time + "] : " + WHITE + messages[j].text + "\n");
                        }
                    }
                }
                break;
            }
        }
    }
}
