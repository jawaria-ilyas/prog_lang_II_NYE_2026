package prog_lang_II_NYE_2026;
import java.util.Scanner;

public class week2assignment {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter current temperature: ");
    double currentTemp = input.nextDouble();

    if (currentTemp < 0) {
        System.out.println("It is below freezing");
    } else if (currentTemp < 30) {
        System.out.println("Temperature is average");
    } else {
        System.out.println("It's too hot!");
    }
    double thunderTime;
    System.out.println();
    do {
        System.out.print("Heard the thunder how many seconds after the lightning? ");
        thunderTime = input.nextDouble();

        if (thunderTime < 0) {
            System.out.println("Invalid input. Seconds cannot be negative.");
        }

    } while (thunderTime < 0);

    double lightningDistance = thunderTime * 300;
    System.out.println("The lightning struck " + lightningDistance + " meters away");

    int userAge;
    System.out.println();
    do {
        System.out.print("Please enter your age (between 1 and 20): ");
        userAge = input.nextInt();

        if (userAge < 1 || userAge > 20) {
        System.out.println("Try Again. Age must be between 1 and 20");
        }

    } while (userAge < 1 || userAge > 20);

    for (int i = 1; i <= userAge; i++) {
        System.out.print("* ");
    }
     System.out.println();

    for (int i = 1; i <= userAge; i++) {
        System.out.print("| ");
}
    System.out.println();
    for (int i = 1; i <= userAge * 2; i++) {
        System.out.print("-");
    }
    System.out.println();

    input.close();
    }
}

