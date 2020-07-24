package Hangers;

import com.company.Clothes;

public class SimpleHanger extends Hanger {
    private Clothes topClothe;

    @Override
    public boolean hang(Clothes clothe) {
        if(topClothe == null){
            if(clothe.getType().equals(Clothes.ClothType.SHIRT) || clothe.getType().equals(Clothes.ClothType.BLOUSE)){
                this.topClothe=clothe;
                System.out.println("You hanged a "+clothe.getType()+" from "+clothe.getBrand()+" on a simple hanger!");
                return true;
            }
            else {
                System.out.println("You can't hang this type of cloth on a simple hanger!");
                return false;
            }
        }
        else{
            System.out.println("A cloth is already hanging on this simple hanger!");
            return false;
        }
    }

    @Override
    public void removeAll() {
        if(topClothe != null){
            this.topClothe=null;
            System.out.println("Cloth removed from simple hanger");
        }
        else System.out.println("Simple hanger already empty");
    }

    @Override
    public void removeCloth(int id) {
        if(topClothe != null){
            if(topClothe.getId()== id){
                this.topClothe=null;
                System.out.println("The cloth with ID:" +id+" removed from simple hanger");
            }
            else System.out.println("That cloth with ID:"+id + "is not here!");
        }
        else System.out.println("Simple hanger already empty");

    }

    @Override
    public boolean isRoomAvailable(Clothes clothe) {
        if(topClothe==null){
            if(clothe.getType().equals(Clothes.ClothType.BLOUSE) || clothe.getType().equals(Clothes.ClothType.SHIRT)){
                System.out.println("There is a slot available!");
                return true;
            }else{
                System.out.println("You can't hang this type of cloth on a simple hanger!");
                return false;
            }
        }else {
            System.out.println("There is no space available on this simple hanger!");
            return false;
        }
    }
}
