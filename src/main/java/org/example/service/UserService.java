package org.example.service;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    List<User> workerList = new ArrayList<>();

    @Override
    public User create(int ID, String name, int age, String position, String phoneNum) {
        User worker = new User(ID, name, age, position, phoneNum);
        workerList.add(worker);
        return worker;
    }

    @Override
    public List<User> read() {
        return workerList;
    }

    @Override
    public List<User> delete(int ID) {
        workerList.remove(ID - 1);
        return workerList;
    }

    @Override
    public List<User> change(int ID, User worker) {
        workerList.remove(workerList.size() - 1);
        workerList.set(ID - 1, worker);
        return workerList;
    }
}
