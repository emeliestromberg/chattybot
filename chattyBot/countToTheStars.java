package chattyBot;

import java.util.Scanner;

public class countToTheStars {
    static void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNow I will prove to you that I can count to any number you want.");
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
}

