package ru.service;

import ru.channel.ChannelMessages;
import ru.group.UserAndGroupMessage;

public class ChatHistory {
    public ChatHistory (String name) {
        for (int i = 0; i < Database.news.length; ++i) {
            if (Database.news[i].getName().equals(name)) {
                ChannelMessages[] messages = ChannelMessages.getAllNews();
                System.out.println(name + "\n");
                for (int j = 0; j < messages.length; ++j) {
                    if (name.equals(messages[j].chatName)) {
                        System.out.println(messages[j].date + " " + messages[j].time + ": " + messages[j].text + "\n");
                    }
                }
                break;
            }
        }
        for (int i = 0; i < Database.groups.length + Database.chats.length; ++i) {
            if (Database.groups[i].getGroupName().equals(name) || Database.chats[i].getName().equals(name)) {
                UserAndGroupMessage[] messages = UserAndGroupMessage.getAllMessages();
                System.out.println(name + "\n");
                for (int j = 0; j < messages.length; ++j) {
                    if (name.equals(messages[j].chatName)) {
                        System.out.println(messages[j].getFromWhom() + " " + messages[j].date + " " + messages[j].time + ": " + messages[j].text + "\n");
                    }
                }
                break;
            }
        }
    }
}
