package com.learn.pattern;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUser extends User{
    public RegisteredUser(IChatBox chatBox, String userId, String name) {
        super(chatBox, userId, name);
    }
    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }
/*
    @Override
    public void registerUser(String user) {
        if(!users.stream().findAny().equals(user)){
            users.add(user);
        }
    }

    @Override
    public void sendMessage(String user, String msg) {
        System.out.println(user+" : "+msg);
    }

    @Override
    public void receiveMessage(String sender,String msg,String groupMembers) {
        System.out.println(sender+" : "+msg+" : "+ groupMembers);
    }

    @Override
    public void sendGroupMessage(String groupName, String msg, String sender) {
        for(Group group : IChatBox.groups){
            for(String user : group.getGroupUsers()){
                if(!sender.equalsIgnoreCase(user)){
                    receiveMessage(sender,msg,user);
                }

            }

        }
    }*/
}
