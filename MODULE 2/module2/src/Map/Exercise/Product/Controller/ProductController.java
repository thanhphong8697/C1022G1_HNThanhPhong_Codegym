package Map.Exercise.Product.Controller;

import Map.Exercise.Product.ModelTotal.Model.Product;
import Map.Exercise.Product.ModelTotal.Service.ProductMana;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ProductMana productMana = new ProductMana();
        do {
            System.out.println("Your choice: \n" +
                    "1. Extra Product.\n" +
                    "2. Change Product.\n" +
                    "3. Display Product.\n" +
                    "4. Search Product.\n" +
                    "5. Sort Product.\n" +
                    "6. Exit.\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Your product want to extra.");
                    System.out.println("Id: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Product's name: ");
                    String nameProduct1 = scanner.nextLine();
                    System.out.println("Price: ");
                    int price1 = Integer.parseInt(scanner.nextLine());
                    Product product1 = new Product(id1, nameProduct1, price1);
                    productMana.extra(product1);
                    break;
                case 2:
                    System.out.println("Enter your product wanna change.");
                    System.out.println("Id: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Product's name: ");
                    String nameProduct2 = scanner.nextLine();
                    System.out.println("Price: ");
                    int price2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("The index you wanna change");
                    int index = Integer.parseInt(scanner.nextLine());
                    Product product2 = new Product(id2, nameProduct2, price2);
                    productMana.change(index, product2);
                    break;
                case 3:
                    productMana.display();
                    break;
                case 4:
                    System.out.println("Enter the product you wanna search. ");
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct3 = scanner.nextLine();
                    productMana.search(nameProduct3);
                    break;
                case 5:
                    productMana.sort();
                    break;
            }
        } while (choice < 6);
    }
}
