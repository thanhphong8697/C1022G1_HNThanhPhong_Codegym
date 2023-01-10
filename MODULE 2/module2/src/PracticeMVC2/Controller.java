package PracticeMVC2;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        InterSe interSe = new ISe();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1 display\n" +
                    "2. add \n" +
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
                    interSe.display();
                    break;
                case 2:
                    System.out.println("name");
                    String name = scanner.nextLine();
                    System.out.println("id");
                    String id = scanner.nextLine();
                    System.out.println("phone");
                    String phone = scanner.nextLine();
                    System.out.println("email");
                    String email = scanner.nextLine();
                    Model model = new Model(name, id, phone, email);
                    interSe.add(model);
                    break;
                case 3:
                    System.out.println("Enter name to search");
                    String string = scanner.nextLine();
                    interSe.search(string);
                    break;
                case 4:
                    System.out.println("Enter id to delete");
                    String string1 = scanner.nextLine();
                    interSe.delete(string1);
                    break;
                case 5:
                    interSe.sort();
                    break;
                case 6:
                    System.out.println("enter id to check");
                    String idCheck = scanner.nextLine();
                    Model model1 = interSe.findId(idCheck);
                    if (model1 != null) {
                        int choiceUpdate = 0;
                        do {
                            System.out.println("1 name \n" +
                                    "2 phone \n" +
                                    "3 email \n" +
                                    "4 exit");
                            try {
                                choiceUpdate = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            switch (choiceUpdate) {
                                case 1:
                                    System.out.println(" new name");
                                    String newName = scanner.nextLine();
                                    model1.setName(newName);
                                    break;
                                case 2:
                                    System.out.println(" new phone");
                                    String newPhone = scanner.nextLine();
                                    model1.setPhone(newPhone);
                                    break;
                                case 3:
                                    System.out.println(" new email");
                                    String newEmail = scanner.nextLine();
                                    model1.setEmail(newEmail);
                                    break;
                            }
                            interSe.update(model1);
                        } while (choiceUpdate != 4);
                    } else {
                        System.out.println("not have id");
                    }
                    break;
            }
        } while (choice != 7);
    }
}
