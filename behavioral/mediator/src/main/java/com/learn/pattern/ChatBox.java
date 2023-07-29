package com.learn.pattern;

import java.util.HashMap;
import java.util.Map;

public class ChatBox implements IChatBox {
    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void addUser(User user) {
        usersMap.put(user.getUserId(),user);
    }

    @Override
    public void sendMessage(String msg, String userId) {
        User u = usersMap.get(userId);
        u.receive(msg);
    }
}
