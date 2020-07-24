package Hangers;

import com.company.Clothes;

public class DoubleHanger extends Hanger {
    private Clothes topCloth;
    private Clothes bottomCloth;


    @Override
    public boolean hang(Clothes clothe) {
        if (topCloth == null) {
            if (clothe.getType().equals(Clothes.ClothType.BLOUSE) || clothe.getType().equals(Clothes.ClothType.SHIRT)) {
                this.topCloth = clothe;
                System.out.println("You hanged a " + clothe.getType() + " from " + clothe.getBrand() + " on the top side of the hanger!");
                return true;
            } else if (bottomCloth == null) {
                this.bottomCloth = clothe;
                System.out.println("You hanged a " + clothe.getType() + " from " + clothe.getBrand() + " on the bottom side of the hanger!");
                return true;
            }
        } else if (bottomCloth == null) {
            if (clothe.getType().equals(Clothes.ClothType.SKIRT) || clothe.getType().equals(Clothes.ClothType.TROUSERS)) {
                this.bottomCloth = clothe;
                System.out.println("You hanged a " + clothe.getType() + " from " + clothe.getBrand() + " on the bottom side of the hanger!");
                return true;
            }
        }
        System.out.println("You can't hang this here!");
        return false;
    }


    @Override
    public void removeAll() {
        this.topCloth = null;
        this.bottomCloth = null;
        System.out.println("You removed all clothes from this double hanger!");
    }

    @Override
    public void removeCloth(int id) {
        if (this.topCloth.getId() == id) {
            this.topCloth = null;
            System.out.println("You removed the cloth with ID:" + id + " from the top side of the double hanger!");
        } else if (this.bottomCloth.getId() == id) {
            this.bottomCloth = null;
            System.out.println("You removed the cloth with ID:" + id + " from the bottom side of the double hanger!");
        }
    }

    @Override
    public boolean isRoomAvailable(Clothes clothe) {
        if (this.topCloth == null & this.bottomCloth == null) {
            System.out.println("There is room available on both sides on this double hanger!");
            return true;
        } else if (this.topCloth == null & this.bottomCloth != null) {
            if (clothe.getType().equals(Clothes.ClothType.SHIRT) || clothe.getType().equals(Clothes.ClothType.BLOUSE)) {
                System.out.println("There is room available on the top side of this double hanger!");
                return true;
            } else if (this.topCloth != null & this.bottomCloth == null) {
                if (clothe.getType().equals(Clothes.ClothType.SKIRT) || clothe.getType().equals(Clothes.ClothType.TROUSERS)) {
                    System.out.println("There is room available on the bottom side of this double hanger!");
                    return true;
                }
            }
        } else if (this.topCloth != null & this.bottomCloth == null) {
            if (clothe.getType().equals(Clothes.ClothType.SKIRT) || clothe.getType().equals(Clothes.ClothType.TROUSERS)) {
                System.out.println("There is room available on the bottom side of this double hanger!");
                return true;
            }
            System.out.println("There is no room available on this double hanger for that cloth");
            return false;
        }
        System.out.println("There is no room available on this double hanger for that cloth");
        return false;
    }
}
