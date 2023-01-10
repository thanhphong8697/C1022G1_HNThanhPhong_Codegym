package IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.service.impl;

import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.model.ProductIO;
import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.repository.IProductRepositoryIO;
import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.repository.impl.ProductRepositoryIO;
import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.service.IProductServiceIO;

import java.io.Serializable;

public class ProductServiceIO implements IProductServiceIO, Serializable {
    private IProductRepositoryIO iProductRepositoryIO = new ProductRepositoryIO();

    @Override
    public void add(ProductIO productIO) {
        iProductRepositoryIO.add(productIO);
    }

    @Override
    public void display() {
        iProductRepositoryIO.display();
    }

    @Override
    public void search(String str) {
        iProductRepositoryIO.search(str);
    }
}
