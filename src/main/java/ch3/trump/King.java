package ch3.trump;



import java.util.Scanner;

public class King extends Trump {

    private static King king;

    public King(final String name, Shape shape, final boolean walkable) {
        super(name, shape, walkable);
    }

    public static King getInstance() {
        if(king == null) {
            king = new King("왕", Shape.HEART, false);
        }
        return king;
    }

    @Override
    public void act() {
        king.hitTheDeck();
        king.flipOver();
        enjoyParty();
    }

    private void enjoyParty() {
        System.out.println(this.name + "은 파티를 즐기고 있습니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
