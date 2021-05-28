package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address newAddress = new Address();
        newAddress.setStreet("7921 Jones Branch");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address papaJohn = new Address("1231 gvdfsd st", "Fggdgf", "32142");
    }

}
