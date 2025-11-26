import ru.service.*;

import ru.channel.*;

import ru.group.*;

import ru.user.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String LIGHTBLUE = "\u001B[38;2;105;196;255m";
        final String WHITE = "\u001B[38;2;255;255;255m";
        final String PINK = "\u001B[38;2;255;182;192m";
        final String GRAY = "\u001B[38;2;169;169;169m";

        Scanner scanner = new Scanner(System.in);

        System.out.println(GRAY + "\nВы - Диана" + WHITE);

        System.out.println(LIGHTBLUE + "=============================" + WHITE);
        System.out.println("Список каналов:");
        for (ChannelChat x : Database.news) {
            System.out.println(PINK + x.getName());
        }

        System.out.println(LIGHTBLUE + "=============================" + WHITE);
        System.out.println("Список групп:");
        for (Group x : Database.groups) {
            System.out.println(PINK + x.getGroupName());
        }

        System.out.println(LIGHTBLUE + "=============================" + WHITE);
        System.out.println("Список личных чатов:");
        for (UserChat x : Database.chats) {
            System.out.println(PINK + x.getName());
        }

        System.out.println(WHITE);

        boolean flag = true;
        while (flag) {
            System.out.println(LIGHTBLUE + "=============================" + WHITE);
            System.out.println(GRAY + "Введите название канала, группы или лички, куда хотите зайти. exit - выйти из программы");
            String answer = scanner.nextLine();
            if (answer.equals("exit")) {
                flag = false;
            }
            new ChatHistory(answer);
        }
    }
}
