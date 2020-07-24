package Hangers;

import com.company.Clothes;

public abstract class Hanger {
    public abstract boolean hang(Clothes clothe);
    public abstract void removeAll();
    public abstract void removeCloth(int id);
    public abstract boolean isRoomAvailable(Clothes clothe);
}
