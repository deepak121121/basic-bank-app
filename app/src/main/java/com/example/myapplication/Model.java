package com.example.myapplication;




public class Model {
    private String name;
    private String balance;
    private String accountNumber;
    private String ifscCode;
    private String email;

    public Model(String name, String balance, String accountNumber, String ifscCode, String email) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.email = email;
    }

    public Model() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}


