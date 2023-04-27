package ch3.trump;

import java.util.Scanner;

public class Queen extends Trump {

    private static Queen queen;
    private static final int DEFAULT_SATISFACTION_VALUE = 0;

    public Queen(final String name, Shape shape, final boolean walkable) {
        super(name, shape, walkable);
    }

    public static Queen getInstance() {
        if(queen == null) {
            queen = new Queen("여왕", Shape.HEART, true);
        }
        return queen;
    }

    @Override
    public void act() {
        queen.hitTheDeck();
        queen.flipOver();
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
