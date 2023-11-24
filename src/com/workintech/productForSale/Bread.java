package com.workintech.productForSale;

public class Bread extends ProductForSale{
    double gram;

    public Bread(double price, String description, double gram) {
        super(ProductTypes.BREAD, price, description);
        this.gram = gram;
    }

    public double getGram() {
        return gram;
    }

    @Override
    public void showDetails() {
        System.out.println("This bread is "+getGram()+" grams.");
    }
}
