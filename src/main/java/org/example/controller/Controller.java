package org.example.controller;

import org.example.service.DataService;
import org.example.service.UserService;
import org.example.view.UserView;
import org.example.model.User;

import java.util.List;

public class Controller {
    DataService dataService;
    UserView userView;

    public Controller() {
        this.dataService = new UserService();
        this.userView = new UserView();
    }

    public void menu() {
        userView.mainMenu();
    }
    public void sendRequest(int ID, String name, int age, String position, String phoneNum) {
        User worker =  dataService.create(ID, name, age, position, phoneNum);
        userView.showAddResult(worker);
    }
    public void sendRequest() {
        List<User> workers = dataService.read();
        userView.viewWorkers(workers);
    }

    public void sendRequest(int ID) {
        List<User> workers = dataService.delete(ID);
        userView.showDeleteResult();
    }
    public void sendRequest(int oldID, int newID, String name, int age, String position, String phoneNum) {
        User worker =  dataService.create(newID, name, age, position, phoneNum);
        List<User> workers = dataService.change(oldID, worker);
        userView.showChangeResult(worker);
    }
}