package com.workintech.productForSale;

import com.workintech.productForSale.*;

public class Store {
    public static void main(String[] args) {

        ProductForSale coke = new Coke(10, "The coke very well", CokeTypes.ORIGINAL);
        ProductForSale chocolate = new Chocolate(20,"Switzerland chocolate",35);
        ProductForSale bread = new Bread(12,"Bread is important for us",250);

        ProductForSale[] products = new ProductForSale[]{coke,chocolate,bread};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
             product.showDetails();
        }
    }
}