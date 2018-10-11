package com.manjeshk.designpattern.creational.builder;


public class Name {

    private String firstName;
    private String middleName;
    private String surName;

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.surName = builder.surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Name{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", surName='").append(surName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {
        private String firstName;
        private String middleName;
        private String surName;

        public Builder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(final String middleName) {
            this.middleName = middleName;
            return this;
        }


        public Builder surName(final String surName) {
            this.surName = surName;
            return this;
        }

        public Name build() {
            return new Name(this);
        }
    }


}
