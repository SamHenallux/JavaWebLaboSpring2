package com.spring.henallux.JavaWebLaboSpring2.model;

public class MagicKeyForm {
    private String magicKey;
    private Integer zipCode;

    public MagicKeyForm() {

    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getMagicKey() {
        return magicKey;
    }

    public void setMagicKey(String magicKey) {
        this.magicKey = magicKey;
    }
}
