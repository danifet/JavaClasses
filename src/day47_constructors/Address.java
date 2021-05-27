package day47_constructors;

public class Address {
private String street;
private String city;
private String state;
private String zipCode;
private String country="USA";


    public String toString() {
        return street + ", " + city + ", " + state + ", " + zipCode+ ", " + country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

}

