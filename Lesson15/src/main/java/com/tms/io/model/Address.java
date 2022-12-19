package com.tms.io.model;


import java.io.Serializable;
import java.util.Objects;

public class Address implements Cloneable, Serializable {
    private String country;
    private String city;

    public Address() {
    }

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return country + ", " + city;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return country.equals(address.country) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }
}
