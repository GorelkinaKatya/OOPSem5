package org.example.service;

import org.example.model.User;

import java.util.List;

public interface DataService {
    User create(int ID, String name, int age, String position, String phoneNum);
    List<User> read();
    List<User> delete(int ID);
    List<User> change(int ID, User worker);

}
