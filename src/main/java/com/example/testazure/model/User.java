package com.example.testazure.model;

public class User {
    private String name;
    private String address;
    private String phone;
    private String password;

    public User(String name, String address, String phone, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }
}