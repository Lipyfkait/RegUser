package com.example.demo.services;

import org.apache.catalina.User;

import java.util.List;

public class UserService {
    private List<User> users;

    public List<User> getUsers(int index) {
        return (List<User>) users.get(index);
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
