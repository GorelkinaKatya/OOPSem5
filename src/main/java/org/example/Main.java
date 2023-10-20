package org.example;

import org.example.controller.Controller;
import org.example.model.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        controller.sendRequest(1, "Иван", 25, "Менеджер по продажам", "8-943-345-66-34");
        controller.sendRequest(2, "Василий", 45, "Генеральный директор", "8-967-123-55-78");
        controller.sendRequest(3, "Анастасия", 27, "Менеджер по персоналу", "8-909-789-46-98");


        boolean flag = true;
        while (flag) {
            controller.menu();
            int choice = scanner.nextInt();
            if (choice == 1) {
                controller.sendRequest();
            } else if (choice == 2) {
                boolean flagEnter = true;
                while (flagEnter) {
                    System.out.print("Введите ID: ");
                    int ID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите должность: ");
                    String position = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phoneNum = scanner.nextLine();

                    controller.sendRequest(ID, name, age, position, phoneNum);

                    System.out.print("\nХотите закончить ввод? (Enter)");
                    if (scanner.nextLine().isEmpty()) {
                        flagEnter = false;
                    }
                }
            } else if (choice == 3) {
                System.out.print("Введите порядковый номер сотрудника, которого хотите изменить: ");
                int oldID = scanner.nextInt();
                int newID = oldID;
                scanner.nextLine();
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введите должность: ");
                String position = scanner.nextLine();
                System.out.print("Введите номер телефона: ");
                String phoneNum = scanner.nextLine();

                controller.sendRequest(oldID,newID,name, age, position, phoneNum);
            } else if (choice == 4) {
                System.out.print("Введите порядковый номер сотрудника, которого хотите удалить: ");
                int ID = scanner.nextInt();
                controller.sendRequest(ID);
            } else if (choice == 5) {
                    flag = false;
            }
        }
    }
}