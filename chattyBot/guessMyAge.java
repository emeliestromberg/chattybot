package chattyBot;

import java.util.Scanner;

public class guessMyAge {
    static void guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nLet me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("\nHeyooo your age is " + age + ". That's a good time to start programming! :D");
    }

}
