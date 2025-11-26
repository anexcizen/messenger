package ru.group;

import ru.service.Message;

public class UserAndGroupMessage extends Message {
    private String fromWhom;
    public UserAndGroupMessage(String chatName, String name, String date, String time, String fromWhom) {
        super(chatName, name, date, time);
        this.fromWhom = fromWhom;
    }

    public String getFromWhom() {
        return fromWhom;
    }

    public static UserAndGroupMessage[] getAllMessages() {
        UserAndGroupMessage[] messages = {new UserAndGroupMessage("Тимлид Анита", "анита, когда зарплата", "25 ноября", "18:01", "Вы"),
                //добавление сообщений
                new UserAndGroupMessage("Тимлид Анита", "не заслужила", "25 ноября", "18:03", "Анита"),
                new UserAndGroupMessage("Тимлид Анита", "да я в полицию пойду", "25 ноября", "18:04", "Вы"),
                new UserAndGroupMessage("Тимлид Анита", "Да дааа", "25 ноября", "18:06", "Анита"),
                new UserAndGroupMessage("Алёна", "Привет!", "27 ноября", "13:06", "Алёна"),
                new UserAndGroupMessage("Алёна", "Привет привет)))", "27 ноября", "13:06", "Вы"),
                new UserAndGroupMessage("Алёна", "Хочешь сходить на каток со мной,Дианой и Кристиной?)", "25 ноября", "18:06", "Алёна"),
                new UserAndGroupMessage("Алёна", "Конечно,хочу!", "27 ноября", "13:07", "Вы"),
                new UserAndGroupMessage("Алёна", "Тогла встретимся завтра у катка в 18:00", "27 ноября", "13:08", "Алёна"),
                new UserAndGroupMessage("Алёна", "Отлично!До встречи", "27 ноября", "13:08", "Вы"),
                new UserAndGroupMessage("Кристина", "Ты помнишь, что мы завтра сдаем проект по ОРГ?", "25 ноября", "19:11", "Кристина"),
                new UserAndGroupMessage("Кристина", "Как о таком забудешь(Ты выучила свои слова?", "25 ноября", "19:11", "Вы"),
                new UserAndGroupMessage("Кристина", "Выучила.А ты?", "25 ноября", "19:12", "Кристина"),
                new UserAndGroupMessage("Кристина", "Тоже.Надеюсь нам поставят по 10 баллов", "25 ноября", "19:13", "Вы"),
                new UserAndGroupMessage("Кристина", "Я тоже)))", "25 ноября", "19:25", "Кристина"),
                new UserAndGroupMessage("Инфа проект", "Ну что, как делить будем?", "25 ноября", "18:14", "Алёна"),
                new UserAndGroupMessage("Инфа проект", "Завтра останемся после пар и будем решать", "25 ноября", "18:15", "Вы"),
                new UserAndGroupMessage("Инфа проект", "Да вы че, давайте не будем оставаться...Просто созвонимся вечером)", "25 ноября", "18:15", "Кристина"),
                new UserAndGroupMessage("Инфа проект", "Нет", "25 ноября", "18:15", "Тимлид Анита"),
                new UserAndGroupMessage("Инфа проект", "ЗАВТРА ОСТАЕМСЯ ПОСЛЕ ПАР!НЕ ЗАБУДЬТЕ ВЗЯТЬ С СОБОЙ НОУТЫ!!!!", "25 ноября", "18:15", "Тимлид Анита"),
                new UserAndGroupMessage("Инфа проект", "ахахахха", "25 ноября", "18:15", "Вы"),
                new UserAndGroupMessage("Инфа проект", "Будет сделано, Тимлид Анита!)", "25 ноября", "18:15", "Алёна"),
                new UserAndGroupMessage("рабы", "Всем привет! Вам тоже Анита зарплату не выплатила???)", "25 ноября", "18:15", "Алёна"),
                new UserAndGroupMessage("рабы", "ДАААА!Как так можно я не понимаю", "25 ноября", "18:15", "Кристина"),
                new UserAndGroupMessage("рабы", "Предлагаю завтра с ней лично разобраться", "25 ноября", "18:15", "Вы"),
                new UserAndGroupMessage("рабы", "Поддерживаю", "25 ноября", "18:15", "Алёна"),
                new UserAndGroupMessage("рабы", "И я поддерживаю)", "25 ноября", "18:15", "Вы"),
                new UserAndGroupMessage("ДУшнилы", "Всем привет,я иду в магазин,кому-нибудь что-то нужно???", "23 ноября", "17:35", "Вы"),
                new UserAndGroupMessage("ДУшнилы", "Да,купи,пожалуйста,шоколадку милку и чай зеленый любой)))", "23 ноября", "17:35", "Тимлид Анита"),
                new UserAndGroupMessage("ДУшнилы", "И мне тоже шоколадку можно,пожалуйста", "23 ноября", "17:35", "Алёнка"),
                new UserAndGroupMessage("ДУшнилы", "Окей,все куплю!", "23 ноября", "17:36", "Вы"),
                new UserAndGroupMessage("ДУшнилы", "Спасибооо", "23 ноября", "17:37", "Тимлид Анита"),
                new UserAndGroupMessage("ДУшнилы", "Большое спасибо)))", "23 ноября", "17:38", "Алёнка"),

        };

        return messages;
    }
}
