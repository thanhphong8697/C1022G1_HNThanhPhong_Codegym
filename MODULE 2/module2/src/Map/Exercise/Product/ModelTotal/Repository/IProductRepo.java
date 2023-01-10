package Map.Exercise.Product.ModelTotal.Repository;

import Map.Exercise.Product.ModelTotal.Model.Product;

public interface IProductRepo {

    void extra(Product product);

    void change(int index, Product product);

    void display();

    void search(String name);

    void sort();
}
