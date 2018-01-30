package com.company.addressbook;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Entry {

    @NotNull
    @Size(min = 1, max = 10)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 10)
    private String lastName;

    @NotNull
    @Size(min = 20, max = 50)
    private String address;

    @NotNull
    @Size(min = 12, max = 30)
    private String email;

    @NotNull
    @Size(min = 12, max = 12)
    private String phoneNum;

    public Entry(String f, String l, String a, String e, String p) {
        this.firstName = f;
        this.lastName = l;
        this.address = a;
        this.email = e;
        this.phoneNum = p;
    }

    public Entry(){

    }
    public Entry(String f, String l){
        this.firstName = f;
        this.lastName = l;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

