package com.manjeshk.designpattern.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        System.out.println("--------------Blog Page-------------------");
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());
        website.getPages().forEach(page -> page.write());

        System.out.println("--------------Shop Page-------------------");
        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());
        website.getPages().forEach(page -> page.write());
    }
}
