package chattyBot;

import java.util.Scanner;

public class askMyName {
    static void greet() {
        Scanner input = new Scanner(System.in);
        String assistantName = "WALL-E";
        String birthYear = "2021";
        System.out.println("\nHello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("\nWhat a great name you have, " + name + "!");
    }
}
