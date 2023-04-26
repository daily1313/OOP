package ch3.trump;

public abstract class Trump {

    protected String name;
    protected Shape shape;
    protected boolean walkable;

    public Trump(final String name, Shape shape, final boolean walkable) {
        this.name = name;
        this.shape = shape;
        this.walkable = false;
    }
    public void hitTheDeck() {
        System.out.println("해당 인물 " + name + "가 납작 엎드립니다.");
    }
    public void flipOver() {
        System.out.println("해당 인물 " + name + "가 뒤집혔습니다. ");
    }
    public abstract void act();
    public abstract boolean canWalk();
}
