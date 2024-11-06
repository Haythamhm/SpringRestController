package com.springhayth.tprestg5.service;

import com.springhayth.tprestg5.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        User user1 = new User(1, "John", "Doe");
        User user2 = new User(2, "Jane", "Marline");
        User user3 = new User(3, "Jack", "Pivote");
        User user4 = new User(4, "Joel", "Frank");
        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }

    public List<User> getUserList() {
        return userList;
    }

    public User updateUser(User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == user.getId()) {
                userList.set(i, user);
                return userList.get(i);
            }
        }
        userList.add(user);
        return user;
    }


    public User getUser(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }

        }return null;
    }

    public String deleteUser(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);return "User deleted";
            }
        }
        return "User not found" + id;
    }
}
