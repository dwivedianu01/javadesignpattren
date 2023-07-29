package com.learn.pattern;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<String> groupUsers = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(List<String> groupUsers) {
        this.groupUsers = groupUsers;
    }
}
