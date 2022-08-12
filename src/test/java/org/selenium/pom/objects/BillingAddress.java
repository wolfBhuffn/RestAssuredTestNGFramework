package org.selenium.pom.objects;

public class BillingAddress {
    private String firstName;
    private String lastName;
    private String addressLineOne;
    private String city;
    private String postalCode;
    private String email;
    private String country;
    private String state;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public BillingAddress(){
    }
//^^the default BillingAddress constructor for the builder pattern error.
    public BillingAddress(String firstName, String lastName, String addressLineOne,
                          String city, String postalCode, String email) {
        this.firstName = firstName; //setting the value for the class level variable, using the parameter.
        this.lastName = lastName;   //setting the value for the class level variable, using the parameter.
        this.addressLineOne = addressLineOne;   //setting the value for the class level variable, using the parameter.
        this.city = city;   //setting the value for the class level variable, using the parameter.
        this.postalCode = postalCode;   //setting the value for the class level variable, using the parameter.
        this.email = email;
    }
//^^^ parameterized the billing address inside of of the billing address constructor^^^
    public String getFirstName() {
        return firstName;
    }

    public BillingAddress setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public BillingAddress setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public String getAddressLineOne() {
        return addressLineOne;
    }

    public BillingAddress setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
        return this;
    }

    public String getCity() {
        return city;
    }

    public BillingAddress setCity(String city) {
        this.city = city;
        return this;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public BillingAddress setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }


    public String getEmail() {
        return email;
    }

    public BillingAddress setEmail(String email) {
        this.email = email;
        return this;
    }

}
