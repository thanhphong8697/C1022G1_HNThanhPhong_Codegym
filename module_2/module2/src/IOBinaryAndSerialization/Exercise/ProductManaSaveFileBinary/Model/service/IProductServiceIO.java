package IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.service;

import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.model.ProductIO;

public interface IProductServiceIO {
    void add(ProductIO productIO);

    void display();

    void search(String str);
}
