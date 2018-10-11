package com.manjeshk.designpattern.creational.abstractfactory.advanced;

public class AdidasFactory extends ProductFactory {

    @Override
    public Product getProduct(ProductType productType) {
        switch (productType) {
            case GOLF:
                return new AdidasStar();
            case PRO:
                return new AdidasPod();
            case BLAZERS:
                return new AdidasUltraBoost();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(ProductType productType) {
        switch (productType) {
            case GOLF:
                return new AdidasStarValidator();
            case PRO:
                return new AdidasPodValidator();
            case BLAZERS:
                return new AdidasUltraBoostValidator();
            default:
                return null;
        }
    }
}
