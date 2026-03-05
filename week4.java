package prog_lang_II_NYE_2026;

import java.util.Scanner;
import java.util.Random;

public class week4 {

    public static void calculator(String[] args) {

        String method = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        if (method.equals("add")) {
            result = num1 + num2;
        } 
        else if (method.equals("subtract")) {
            result = num1 - num2;
        } 
        else if (method.equals("multiply")) {
            result = num1 * num2;
        } 
        else if (method.equals("divide")) {
            result = num1 / num2;
        }

        System.out.println("Result: " + result);
    }


    
    public static void guessingGame() {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("larger");
            } 
            else if (guess > secretNumber) {
                System.out.println("smaller");
            }
            else {
                System.out.println("Correct");
            }
        }

        scanner.close();
    }


   
    public static void main(String[] args) {

 
        calculator(args);

        guessingGame();
    }
}