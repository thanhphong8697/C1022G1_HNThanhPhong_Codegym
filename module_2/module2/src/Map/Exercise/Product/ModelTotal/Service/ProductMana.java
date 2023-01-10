package Map.Exercise.Product.ModelTotal.Service;

import Map.Exercise.Product.ModelTotal.Model.Product;
import Map.Exercise.Product.ModelTotal.Repository.IProductRepo;
import Map.Exercise.Product.ModelTotal.Repository.ProductRepo;

public class ProductMana extends Product implements IProductMana {
    private IProductRepo repo = new ProductRepo();

    @Override
    public void extra(Product product) {
        repo.extra(product);
    }

    @Override
    public void change(int index, Product product) {
        repo.change(index, product);
    }

    @Override
    public void display() {
        repo.display();
    }

    @Override
    public void search(String name) {
        repo.search(name);
    }

    @Override
    public void sort() {
        repo.sort();
    }
}
