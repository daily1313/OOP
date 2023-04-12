package ch2;

public class Door {

    private boolean isOpen;
    private int size;

    public Door() {
        this.isOpen = false;
        this.size = 100;
    }

    public void openDoor(Elice elice) {
        if(elice.availableOpenDoor(size)) {
            isOpen = true;
        }
    }
}
