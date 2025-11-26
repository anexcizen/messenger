package ru.channel;
import ru.service.Message;

public class ChannelChat {
    String name;
    int subscribers;

    public ChannelChat(String name, int subscribers) {
        this.name = name;
        this.subscribers = subscribers;
    }
}
