package IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.repository;

import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.model.ProductIO;

public interface IProductRepositoryIO {
    void add(ProductIO productIO);

    void display();

    void search(String str);
}
