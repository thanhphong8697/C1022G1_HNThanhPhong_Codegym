package IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Contoller;

import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.model.ProductIO;
import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.service.IProductServiceIO;
import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.service.impl.ProductServiceIO;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ProductControllerIO {
    public static void main(String[] args) {
        IProductServiceIO iProductServiceIO = new ProductServiceIO();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Your choice: \n" +
                    "1. Add product. \n" +
                    "2. Display product. \n" +
                    "3. Search product \n" +
                    "4. Exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter code product");
                    String productCode = scanner.nextLine();
                    System.out.println("Enter name product ");
                    String productName = scanner.nextLine();
                    System.out.println("Enter name manufacturer");
                    String manufacture = scanner.nextLine();
                    System.out.println("Enter price product");
                    int price = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter other");
                    String other = scanner.nextLine();
                    ProductIO productIO = new ProductIO(productCode, productName, manufacture, price, other);
                    iProductServiceIO.add(productIO);
                    break;
                case 2:
                    iProductServiceIO.display();
                    break;
                case 3:
                    System.out.println("Enter name product to search");
                    String strSearch = scanner.nextLine();
                    iProductServiceIO.search(strSearch);
                    break;
                case 4:
                    System.exit(1);
            }
        } while (true);
    }

}
