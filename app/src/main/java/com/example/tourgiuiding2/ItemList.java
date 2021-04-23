package com.example.tourgiuiding2;

public class ItemList {
    private int img_rcs;
    private String name;

    public ItemList(int img_rcs, String name) {
        this.img_rcs = img_rcs;
        this.name = name;
    }

    public ItemList(String name) {
        this.name = name;
    }

    public int getImg_rcs() {
        return img_rcs;
    }

    public void setImg_rcs(int img_rcs) {
        this.img_rcs = img_rcs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
