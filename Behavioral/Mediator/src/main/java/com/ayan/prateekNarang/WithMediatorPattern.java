package com.ayan.prateekNarang;

import java.util.*;

interface ChatMediator {
    void sendMessage(String msg, ChatUser sender);

    void addUser(ChatUser user);
}

class ChatRoom implements ChatMediator {

    private List<ChatUser> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, ChatUser sender) {
        for (ChatUser user : users) {
            if (user != sender) {
                user.receiveMessage(msg, sender);
            }
        }
    }

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }
}

class ChatUser {
    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg) {
        System.out.println(this.name + " Sending a msg " + msg);
        chatMediator.sendMessage(msg, this);
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String msg, ChatUser sender) {
        System.out.println(this.name + " received message: " + msg + " from " + sender.getName());
    }
}

public class WithMediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        ChatUser rahul = new ChatUser("Rahul", chatRoom);
        ChatUser amit = new ChatUser("Amit", chatRoom);
        ChatUser neha = new ChatUser("Neha", chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(amit);
        chatRoom.addUser(neha);

        amit.sendMessage("Hi everyone");
    }
}
