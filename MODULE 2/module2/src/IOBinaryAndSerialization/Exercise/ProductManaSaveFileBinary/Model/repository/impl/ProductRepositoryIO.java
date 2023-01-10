package IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.repository.impl;

import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.model.ProductIO;
import IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.repository.IProductRepositoryIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryIO implements IProductRepositoryIO, Serializable {
    public static void writeProductFile(List<ProductIO> productIOList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productIOList);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ProductIO> readProductFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<ProductIO> productIOList1 = (List<ProductIO>) objectInputStream.readObject();
            return productIOList1;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    static final String FILE_PATH = "D:\\MODULE 2\\module2\\src\\IOBinaryAndSerialization\\Exercise\\ProductManaSaveFileBinary\\Contoller\\product.dat";
    static List<ProductIO> productIOList = new ArrayList<>();

    static {
        productIOList.add(new ProductIO("P1", "Civic", "Honda", 100000, "No comment"));
        productIOList.add(new ProductIO("P2", "Sentafe", "Huyndai", 150000, "No comment"));
        productIOList.add(new ProductIO("P3", "C180", "Mec", 200000, "No comment"));
        writeProductFile(productIOList);
    }

    @Override
    public void add(ProductIO productIO) {
        productIOList.add(productIO);
        writeProductFile(productIOList);
    }

    @Override
    public void display() {
        for (ProductIO productIO : productIOList) {
            System.out.println(productIO);
        }
    }

    @Override
    public void search(String str) {
        for (int i = 0; i < productIOList.size(); i++) {
            if (productIOList.get(i).getName().contains(str)) {
                System.out.println(productIOList.get(i));
            }
        }
    }
}
