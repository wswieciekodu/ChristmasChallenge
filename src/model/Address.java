package model;

import java.util.Objects;

public class Address {
    private String street;
    private String number;
    private int flatNumber;
    private String city;
    private String zipCode;

    public Address(String street, String number, int flatNumber, String city, String zipCode) {
        this.street = street;
        this.number = number;
        this.flatNumber = flatNumber;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", flatNumber=" + flatNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Address address = (Address) o;
        return flatNumber == address.flatNumber && Objects.equals(street, address.street) && Objects.equals(number, address.number)
                && Objects.equals(city, address.city) && Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, flatNumber, city, zipCode);
    }
}

