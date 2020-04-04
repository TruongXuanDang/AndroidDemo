package com.truongdx8.ss1;

public class Class5HomeworkContact {
    private String name;
    private String description;
    private int price;
    private int avatar;

    public Class5HomeworkContact(String name, String description, int price, int avatar) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.avatar = avatar;
    }

    public Class5HomeworkContact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
