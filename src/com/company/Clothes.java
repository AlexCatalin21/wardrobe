package com.company;

public class Clothes {
    private int id;
    private static int counter=0;
    private String brand;
    private ClothType type;

    public Clothes(String brand,ClothType type){
        this.brand=brand;
        this.type=type;
        id=++counter;
    }


    public int getId() {
        return this.id;
    }

    public String getBrand() {
        return this.brand;
    }

    public ClothType getType() {
        return this.type;
    }

    public enum ClothType {
        SHIRT,
        BLOUSE,
        SKIRT,
        TROUSERS
    }


}
