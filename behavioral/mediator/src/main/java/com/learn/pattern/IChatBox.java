package com.learn.pattern;

import java.util.ArrayList;
import java.util.List;

public interface IChatBox {
    public void addUser(User user);
    public void sendMessage(String msg, String userId);
}
