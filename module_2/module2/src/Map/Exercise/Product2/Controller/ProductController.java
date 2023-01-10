package Map.Exercise.Product2.Controller;

import Map.Exercise.Product2.Model.Model.Product;
import Map.Exercise.Product2.Model.Service.IProductService;
import Map.Exercise.Product2.Model.Service.Impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Your choice: \n" +
                    "1. Display product\n" +
                    "2. Add product\n" +
                    "3. Update product\n" +
                    "4. Sort list product\n" +
                    "5. Search product\n" +
                    "6. Remove product\n" +
                    "7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.display();
                    break;
                case 2:
                    System.out.println("Enter id you wanna add.");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter name you wanna add.");
                    String name = scanner.nextLine();
                    System.out.println("Enter Price you wanna add.");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, name, price);
                    iProductService.add(product);
                    break;
                case 3:
                    System.out.println("Enter id to check.");
                    int oldId = Integer.parseInt(scanner.nextLine());
                    Product product1 = iProductService.findById(oldId);
                    if (product1 != null) {
                        System.out.println("Enter name product.");
                        String newNameProduct = scanner.nextLine();
                        System.out.println("Enter price product.");
                        int newPrice = Integer.parseInt(scanner.nextLine());
                        product1.setName(newNameProduct);
                        product1.setPrice(newPrice);
                        iProductService.update(product1);
                    } else {
                        System.out.println("Id not found.");
                    }
                    break;
                case 4:
                    iProductService.sort();
                case 5:
                    System.out.println("Enter product name wanna search.");
                    String str = scanner.nextLine();
                    iProductService.search(str);
                case 6:
                    System.out.println("Enter id to check.");
                    int idRemove = Integer.parseInt(scanner.nextLine());
                    iProductService.remove(idRemove);
                    break;
                case 7:
                    System.exit(1);
            }

        } while (true);

    }
}
