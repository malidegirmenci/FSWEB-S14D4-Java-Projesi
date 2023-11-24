package com.workintech.productForSale;

public abstract class ProductForSale {
    private ProductTypes type;
    private double price;
    private String description;

    public ProductForSale(ProductTypes type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public ProductTypes getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity){
        return price * quantity;
    }

    public abstract void showDetails();
}
