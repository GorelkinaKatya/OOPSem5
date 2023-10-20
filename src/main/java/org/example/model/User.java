package org.example.model;

public class User {
    int ID;
    String name;
    int age;
    String position; //должность
    String phoneNum;

    public User(int ID, String name, int age, String position, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.position = position;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "\n\nСотрудник №" + ID +
                "\nИмя: " + name +
                "\nВозраст: " + age +
                "\nДолжность: " + position +
                "\nНомер телефона: " + phoneNum ;
    }
}
