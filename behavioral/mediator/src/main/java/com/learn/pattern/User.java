package com.learn.pattern;

public abstract class User {
   private IChatBox mediator;
   private String userId;
   private String name;

    public User(IChatBox chatBox, String userId, String name) {
        this.mediator = chatBox;
        this.userId = userId;
        this.name = name;
    }

    public IChatBox getMediator() {
        return mediator;
    }

    public void setMediator(IChatBox mediator) {
        this.mediator = mediator;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void send(String msg, String userId);

    public abstract void receive(String msg);
}
