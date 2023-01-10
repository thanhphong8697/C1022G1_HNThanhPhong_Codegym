package CaseStudy.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(
                    "Your choice \n" +
                            "1. Employee Management. \n" +
                            "2. Customer Management. \n" +
                            "3. Facility Management. \n" +
                            "4. Booking Management. \n" +
                            "5. Promotion Management. \n" +
                            "6. Exit.");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                    /**
                     * MENU EMPLOYEE
                     */
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.employeeDisplayMainMenu();
                    break;
                case 2:
                    /**
                     *  MENU CUSTOMER
                     */
                    CustomerController customerController = new CustomerController();
                    customerController.customerDisplayMainMenu();
                    break;
                case 3:
                    /**
                     *  MENU FACILITY
                     */
                    FacilityController facilityController = new FacilityController();
                    facilityController.facilityDisplayMainMenu();
                    break;
                case 4:
                    /**
                     *  MENU BOOKING
                     */
                    BookingController bookingController = new BookingController();
                    bookingController.bookingDisplayMainMenu();
                    break;
                case 5:
                    /**
                     *  MENU PROMOTION
                     */
                    PromotionController promotionController = new PromotionController();
                    promotionController.promotionDisplayMainMenu();
                    break;
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}

