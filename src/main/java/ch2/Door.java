package ch2;

public class Door {

    private int size;

    public Door() {
        this.size = 200;
    }

    public boolean availableOpenDoor(int aliceHeight) {
        return aliceHeight < this.size;
    }

    public int getSize() {
        return size;
    }
}
