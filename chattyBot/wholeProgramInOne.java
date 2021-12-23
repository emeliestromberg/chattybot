package chattyBot;

import java.util.Scanner;

public class wholeProgramInOne {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Mors lilla Olle", "2010"); 
        remindName();
        guessAge();
        count();
        test();
        end();
    }

static void greet(String assistantName, String birthYear) {
    System.out.println("\nHello! My name is " + assistantName + ".");
    System.out.println("I was created in " + birthYear + ".");
    System.out.println("Please, remind me your name.");
}

static void remindName() {
    String name = scanner.nextLine();
    System.out.println("\nWhat a great name you have, " + name + "!");
}

static void guessAge() {
    System.out.println("\nLet me guess your age.");
    System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
    int rem3 = scanner.nextInt();
    int rem5 = scanner.nextInt();
    int rem7 = scanner.nextInt();
    int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
    System.out.println("\nHeyooo your age is " + age + ". That's a good time to start programming! :D");
}

static void count() {
    System.out.println("\nNow I will prove to you that I can count to any number you want.");
    System.out.println("Please enter a number");
    int num = scanner.nextInt();
    for (int i = 0; i <= num; i++) {
        System.out.printf("%d!\n", i);
    }
}

static void test() {
    System.out.println("\n" + "Let's see how well you know me.");
    boolean question = true;
    System.out.println("What is my favorite color?");
    System.out.println("1. Yellow");
    System.out.println("2. Baby blue");
    System.out.println("3. Green");
    System.out.println("4. Pink");
    
    while (question) {   
        int answer = scanner.nextInt();
    
        if (answer == 3) {
            question = false;
            System.out.println("\nCongratulations, you are correct!");
        } else {
            System.out.println("\nSorry, that is not right. Please try again.");
        }
    }  
}

static void end() {
    System.out.println("\nThank you for chatting! Bye <3"); 
}
}
