package ru.user;

public class User {
    private String userName;
    private String description;
    private String birthday;
    private String dataOfRegistration;
    private String phoneNumber;
    private String lastSeen;
    public User(String userName, String lastSeen, String description, String dataOfRegistration, String phoneNumber, String birthday) {
        this.userName = userName;
        this.lastSeen = lastSeen;
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

    public String getUserName() {
        return userName;
    }

    public String getLastSeen() {
        return lastSeen;
    }
}
