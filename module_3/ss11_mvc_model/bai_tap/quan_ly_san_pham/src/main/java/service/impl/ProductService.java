package service.impl;

import model.Product;
import service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static Map<Integer, Product> productMap = new HashMap<>();
    static {
        productMap.put(1,new Product(1,"Iphone13", 20000, "64G", "Apple"));
        productMap.put(2,new Product(2,"GalaxyS10", 15000, "64G", "Samsung"));
        productMap.put(3,new Product(3,"Iphone14", 30000, "64G", "Apple"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findByID(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>(productMap.values());
        List<Product> productList2 = new ArrayList<>();
        for (Product product : productList){
            if (product.getName().contains(name)){
                productList2.add(product);
            }
        }
        return productList2;
    }
}
