package com.workintech.productForSale;

import com.workintech.productForSale.ProductForSale;
import com.workintech.productForSale.ProductTypes;

public class Chocolate extends ProductForSale {
    private double rateChocolate;
    public Chocolate(double price, String description, double rateChocolate) {
        super(ProductTypes.CHOCOLATE, price, description);
        this.rateChocolate = rateChocolate;
    }

    public double getRateChocolate() {
        return rateChocolate;
    }

    @Override
    public void showDetails() {
        System.out.println("This chocolate is very delicious. Chocolate rate is "+ getRateChocolate());
    }
}
