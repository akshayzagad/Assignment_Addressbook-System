package com.bridglabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zip;
    private String state;
    private String phoneNo;
    private String email;

    public Contact() {
        // TODO Auto-generated constructor stub
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String firstName, String lastName, String address, String city, String zip, String state,
                   String phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", zip=" + zip + ", state=" + state + ", phoneNo=" + phoneNo + ", email=" + email + "]";
    }
}
