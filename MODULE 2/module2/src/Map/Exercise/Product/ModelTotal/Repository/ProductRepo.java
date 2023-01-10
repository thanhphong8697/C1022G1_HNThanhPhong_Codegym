package Map.Exercise.Product.ModelTotal.Repository;

import Map.Exercise.Product.ModelTotal.Model.Product;

import java.util.*;

public class ProductRepo implements IProductRepo {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Pen", 10000));
        productList.add(new Product(2, "Book", 20000));
        productList.add(new Product(3, "Notebook", 15000));

    }

    @Override
    public void extra(Product product) {
        productList.add(product);
    }

    @Override
    public void change(int index, Product product) {
        productList.set(index, product);
    }

    @Override
    public void display() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    @Override
    public void search(String name) {
        for (Product product : productList) {
            if (product.getNameProduct().contains(name)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getId() - o1.getId();
            }
        });
        this.display();
    }
}
