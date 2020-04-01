package com.truongdx8.ss1;

public class Contact {
    private String name;
    private String phone;
    private int avater;

    public Contact(String name, String phone, int avater) {
        this.name = name;
        this.phone = phone;
        this.avater = avater;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAvater() {
        return avater;
    }

    public void setAvater(int avater) {
        this.avater = avater;
    }
}
