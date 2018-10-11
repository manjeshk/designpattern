package com.manjeshk.designpattern.creational.abstractfactory.advanced;

public class NikeFactory extends ProductFactory {
    @Override
    public Product getProduct(ProductType productType) {

        switch (productType) {
            case GOLF:
                return new NikeGolf();
            case PRO:
                return new NikePro();
            case BLAZERS:
                return new NikeBlazers();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(ProductType productType) {
        switch (productType) {
            case GOLF:
                return new NikeGolfValidator();
            case PRO:
                return new NikeProValidator();
            case BLAZERS:
                return new NikeBlazersValidator();
            default:
                return null;
        }
    }

}
