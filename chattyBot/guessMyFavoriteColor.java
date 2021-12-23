package chattyBot;

import java.util.Scanner;

public class guessMyFavoriteColor {
    static void colorgame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAlright. Let's see how well you know me.");
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
}
