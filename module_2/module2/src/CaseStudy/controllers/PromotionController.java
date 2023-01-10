package CaseStudy.controllers;

import java.util.Scanner;

public class PromotionController {
    void promotionDisplayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choiceFine;
        do {
            System.out.println("Your option promotion \n" +
                    "1. Display list customers use service. \n" +
                    "2. Display list customers get voucher. \n" +
                    "3. Return main menu");
            choiceFine = Integer.parseInt(scanner.nextLine());
            switch (choiceFine) {
                case 1:
                    System.out.println("a");
                    break;
                case 2:
                    System.out.println("b");
                    break;
            }
        } while (choiceFine != 3);
    }
}
