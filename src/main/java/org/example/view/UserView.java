package org.example.view;

import org.example.model.User;

import java.util.List;

public class UserView {
    public void showAddResult(User user) {
        if(user != null){
            System.out.println("\nСотрудник был добавлен: " + user);
        }
    }
    public void showChangeResult(User user) {
        if(user != null){
            System.out.println("\nСотрудник был изменен: " + user);
        }
    }
    public void showDeleteResult() {
        System.out.println("\nСотрудник был удален");
    }

    public void viewWorkers(List<User> workers) {
        if(workers.isEmpty()){
            System.out.println("Список сотрудников пуст");
            return;
        }
        System.out.println(workers);
    }

    public void mainMenu() {
        System.out.println("\nВыберите пункт меню: " +
                "\n1. Показать список сотрудников" +
                "\n2. Создать нового сотрудника" +
                "\n3. Изменить данные о сотруднике" +
                "\n4. Удалить сотрудника" +
                "\n5. Выход");
    }
}
