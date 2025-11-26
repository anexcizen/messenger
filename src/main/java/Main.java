import ru.service.*;

import ru.channel.*;

import ru.group.*;

import ru.user.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы - Диана");

        System.out.println("=============================");
        System.out.println("Список каналов:");
        for (ChannelChat x : Database.news) {
            System.out.println(x.getName());
        }

        System.out.println("=============================");
        System.out.println("Список групп:");
        for (Group x : Database.groups) {
            System.out.println(x.getGroupName());
        }

        System.out.println("=============================");
        System.out.println("Список личных чатов:");
        for (UserChat x : Database.chats) {
            System.out.println(x.getName());
        }

        System.out.println();

        boolean flag = true;
        while (flag) {
            System.out.println("=============================");
            System.out.println("Введите название канала, группы или лички, куда хотите зайти. exit - выйти из программы");
            String answer = scanner.nextLine();
            if (answer.equals("exit")) {
                flag = false;
            }
            new ChatHistory(answer);
        }
    }
}
