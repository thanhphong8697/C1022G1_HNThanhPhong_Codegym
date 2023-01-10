package IOBinaryAndSerialization.Exercise.ProductManaSaveFileBinary.Model.model;

import java.io.Serializable;

public class ProductIO implements Serializable {
    private String productCode;
    private String name;
    private String manufacturer;
    private double price;
    private String otherDescription;

    public ProductIO(String productCode, String name, String manufacturer, double price, String otherDescription) {
        this.productCode = productCode;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", otherDescription='" + otherDescription + '\'' +
                '}';
    }
}
