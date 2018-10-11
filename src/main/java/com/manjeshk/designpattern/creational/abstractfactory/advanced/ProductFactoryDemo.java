package com.manjeshk.designpattern.creational.abstractfactory.advanced;

public class ProductFactoryDemo {
    public static void main(String[] args) {
        ProductFactory productFactory = ProductFactory.getProductFactory(775);
        Product product = productFactory.getProduct(ProductType.GOLF);
        System.out.println(product.getClass());

        Validator validator = productFactory.getValidator(ProductType.GOLF);
        System.out.println(validator.getClass());

        ProductFactory anotherProductFactory = ProductFactory.getProductFactory(600);
        Product anotherProduct = anotherProductFactory.getProduct(ProductType.BLAZERS);
        System.out.println(anotherProduct.getClass());

        Validator anotherValidator = productFactory.getValidator(ProductType.BLAZERS);
        System.out.println(anotherValidator.getClass());

    }
}
