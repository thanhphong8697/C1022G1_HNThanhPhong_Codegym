package PracticeMVC;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        InterSer interSer = new IWorkerSer();
        do {
            System.out.println("1. Display \n" +
                    "2. Add \n" +
                    "3. search \n" +
                    "4. delete \n" +
                    "5. sort \n" +
                    "6. change \n" +
                    "7. Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                    interSer.display();
                    break;
                case 2:
                    System.out.println("Workercode");
                    String workerCode = scanner.nextLine();
                    System.out.println("name");
                    String name = scanner.nextLine();
                    System.out.println("email");
                    String email = scanner.nextLine();
                    System.out.println("address");
                    String address = scanner.nextLine();
                    Worker worker = new Worker(workerCode, name, email, address);
                    interSer.add(worker);
                    break;
                case 3:
                    System.out.println("enter name wanna search");
                    String string = scanner.nextLine();
                    interSer.search(string);
                    break;
                case 4:
                    System.out.println("enter workercode wanna delete");
                    String string1 = scanner.nextLine();
                    interSer.delete(string1);
                    break;
                case 5:
                    interSer.sort();
                    break;
                case 6:
                    System.out.println("Enter workercode to check");
                    String oldId = scanner.nextLine();
                    Worker worker1 = interSer.findId(oldId);
                    if (worker1 != null) {
                        int choiceOne = 0;
                        do {
                            System.out.println("1. workercode \n" +
                                    "2. name \n" +
                                    "3. email \n" +
                                    "4. address \n" +
                                    "5. Exit");
                            try {
                                choiceOne = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            switch (choiceOne) {
                                case 1:
                                    System.out.println("new workercode");
                                    String newWorker = scanner.nextLine();
                                    worker1.setWorkerCode(newWorker);
                                    break;
                                case 2:
                                    System.out.println("newName");
                                    String newName = scanner.nextLine();
                                    worker1.setName(newName);
                                    break;
                                case 3:
                                    System.out.println("newEmail");
                                    String newEmail = scanner.nextLine();
                                    worker1.setEmail(newEmail);
                                    break;
                                case 4:
                                    System.out.println("newAddress");
                                    String newAddress = scanner.nextLine();
                                    worker1.setAddress(newAddress);
                                    break;
                            }
                        } while (choiceOne != 5);
                        interSer.change(worker1);
                    } else {
                        System.out.println("Nhân viên ko tồn tại");
                    }
                    break;
            }
        } while (choice != 7);
    }
}
