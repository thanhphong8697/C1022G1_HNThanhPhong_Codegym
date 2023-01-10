package CaseStudy.controllers;

import java.util.Scanner;

public class BookingController {
    void bookingDisplayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choiceFour;
        do {
            System.out.println(
                    "Your option booking \n" +
                            "1. Add new booking. \n" +
                            "2. Display list booking. \n" +
                            "3. Return main menu");
            choiceFour = Integer.parseInt(scanner.nextLine());
            switch (choiceFour) {
                case 1:
                    System.out.println("a");
                    break;
                case 2:
                    System.out.println("b");
                    break;
            }
        } while (choiceFour != 3);
    }
}
