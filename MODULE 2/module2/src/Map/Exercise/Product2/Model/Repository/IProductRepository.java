package Map.Exercise.Product2.Model.Repository;

import Map.Exercise.Product2.Model.Model.Product;

public interface IProductRepository {
    void add(Product product);

    void display();

    Product findById(int id);

    void update(Product product);

    void sort();

    void search(String str);

    void remove(int id);

}
