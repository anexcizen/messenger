package ru.user;

public class User {
    String userName;
    String description;
    String birthday;
    String dataOfRegistration;
    String phoneNumber;
    String lastseen;
    public User(String userName, String lastseen, String description, String dataOfRegistration, String phoneNumber, String birthday) {
        this.userName = userName;
        this.lastseen = lastseen;
        this.description = description;
        this.dataOfRegistration = dataOfRegistration;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }
    public void ViewUser() {
        System.out.println("Профиль пользователя " + userName + ":\n");
        System.out.println("Описание: " + description + "\nДата регистрации" + dataOfRegistration
                + "\nНомер телефона" + phoneNumber + "\nДата рождения" + birthday);
    }
}
