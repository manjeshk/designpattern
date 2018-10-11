package com.manjeshk.designpattern.creational.builder;

public class BuilderTester {

    public static void main(String[] args) {

        Name name = new Name.Builder().firstName("Manjesh").middleName("Kumar").surName("Savita").build();
        Address address = new Address.Builder().houseNumber(19645).street("31st Ave").city("Phoenix").zipCode("85027").build();
        Account account = new Account.Builder().id(101).email("manjesh.iitb@gmail.com").name(name).address(address).build();

        Name name1 = account.getName();
        System.out.println("name1 = " + name1);

    }

}
