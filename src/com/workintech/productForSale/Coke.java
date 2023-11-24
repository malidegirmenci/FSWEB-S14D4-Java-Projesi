package com.workintech.productForSale;

public class Coke extends ProductForSale{
    private CokeTypes cokeType;

    public Coke(double price, String description, CokeTypes cokeType) {
        super(ProductTypes.COKE, price, description);
        this.cokeType = cokeType;
    }

    public CokeTypes getCokeType() {
        return cokeType;
    }

    @Override
    public void showDetails() {
        System.out.println("This coke is "+ getCokeType());
    }
}
