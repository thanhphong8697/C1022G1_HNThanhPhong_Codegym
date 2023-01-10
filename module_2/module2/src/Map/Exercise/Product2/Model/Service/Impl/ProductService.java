package Map.Exercise.Product2.Model.Service.Impl;

import Map.Exercise.Product2.Model.Model.Product;
import Map.Exercise.Product2.Model.Repository.IProductRepository;
import Map.Exercise.Product2.Model.Repository.Impl.ProductRepository;
import Map.Exercise.Product2.Model.Service.IProductService;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void add(Product product) {
        iProductRepository.add(product);
    }

    @Override
    public void display() {
        iProductRepository.display();
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.update(product);
    }

    @Override
    public void sort() {
        iProductRepository.sort();
    }

    @Override
    public void search(String str) {
        iProductRepository.search(str);
    }

    @Override
    public void remove(int id) {
        iProductRepository.remove(id);
    }
}

