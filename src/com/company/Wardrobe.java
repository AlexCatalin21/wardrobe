package com.company;

import Hangers.Hanger;
import Hangers.SimpleHanger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Wardrobe {
    private int limit;
    private static int currentHangers=0;
    private List<Hanger> hangers=new ArrayList<>();
    public Wardrobe(int limit){
        this.limit=limit;
    }

    public void addHanger(Hanger hanger){
        if(currentHangers<limit){
            hangers.add(hanger);
            currentHangers++;
        }
        else System.out.println("Wardrobe is full!");
    }

    public List<Hanger> getAllHangers(){
        return this.hangers;
    }

    public boolean isRoomAvailable(){
        if(currentHangers<limit){
            int slotsAvailable=limit-currentHangers;
            System.out.println("There is "+ slotsAvailable+" slots available");
            return true;
        }
        else{
            System.out.println("No space available in the wardrobe");
            return false;
        }
    }

    public void getClothById(int id){

    }
}
