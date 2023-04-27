package ch3.trump;

import static java.lang.System.exit;

import java.util.Scanner;

public class Gardener extends Trump {

    private static Gardener gardener;

    public Gardener(final String name, Shape shape, final boolean walkable) {
        super(name, shape, walkable);
    }

    public static Gardener getInstance() {
        if (gardener == null) {
            gardener = new Gardener("정원사", Shape.SPADE, true);
        }
        return gardener;
    }

    @Override
    public void act() {
        gardener.hitTheDeck();
        gardener.flipOver();
        paintFlower();
    }

    private void paintFlower() {
        System.out.println(this.name + "이 꽃에 물감을 칠하는 중입니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
