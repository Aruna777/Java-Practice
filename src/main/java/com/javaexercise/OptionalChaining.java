package com.javaexercise;

import java.util.Optional;

public class OptionalChaining {

    static class Address {
        private Optional<String> street;

        public Address(String street) {
            this.street = Optional.ofNullable(street);
        }

        public Optional<String> getStreet() {
            return street;
        }
    }

    static class Company {
        private Optional<Address> address;

        public Company(Address address) {
            this.address = Optional.ofNullable(address);
        }

        public Optional<Address> getAddress() {
            return address;
        }
    }

    public static String getStreetName(Company company) {
        return company.getAddress()
                .flatMap(Address::getStreet)
                .orElse("Street not available");
    }
    public static void main(String[] args) {
        Company companyWithAddress = new Company(new Address("123 Main St"));
        Company companyWithoutStreet = new Company(new Address(null));
        Company companyWithoutAddress = new Company(null);

        System.out.println(getStreetName(companyWithAddress));
        System.out.println(getStreetName(companyWithoutStreet));
        System.out.println(getStreetName(companyWithoutAddress));
    }
}
