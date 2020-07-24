package com.company;

import Hangers.DoubleHanger;
import Hangers.Hanger;
import Hangers.SimpleHanger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Clothes cloth1=new Clothes("ZARA", Clothes.ClothType.SHIRT);
        Clothes cloth2=new Clothes("ZARA", Clothes.ClothType.BLOUSE);
        Clothes cloth3= new Clothes("ZARA", Clothes.ClothType.SKIRT);
        Clothes cloth4= new Clothes("ZARA", Clothes.ClothType.TROUSERS);
        Hanger doubleHanger1=new DoubleHanger();
        Hanger simpleHanger1=new SimpleHanger();
    }
}
