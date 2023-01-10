package Map.Exercise.Product2.Model.Repository.Impl;

import Map.Exercise.Product2.Model.Model.Product;
import Map.Exercise.Product2.Model.Repository.IProductRepository;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Pen", 10000));
        productList.add(new Product(2, "Notebook", 15000));
        productList.add(new Product(3, "Book", 20000));
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                break;
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

    @Override
    public void search(String str) {
        for (Product product : productList) {
            if (product.getName().contains(str)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }
}
