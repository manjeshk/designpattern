package com.manjeshk.designpattern.creational.abstractfactory.advanced;

public abstract class ProductFactory {

    public static ProductFactory getProductFactory(int creditScore){
        if(creditScore > 650){
            return new NikeFactory();
        }
        else {
            return new AdidasFactory();
        }
    }

    public abstract Product getProduct(ProductType productType);

    public abstract Validator getValidator(ProductType productType);

}
