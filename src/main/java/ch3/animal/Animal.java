package ch3.animal;

public abstract class Animal {

    protected String name;
    protected int distance;

    public Animal(final String name, final int distance) {
        this.name = name;
        this.distance = distance;
    }
    public abstract void act();
    public abstract void cry();

    public void eat() {
        System.out.println(name +"이 당근을 먹었습니다.");
    }
}
