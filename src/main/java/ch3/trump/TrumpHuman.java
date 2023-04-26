package ch3.trump;

public class TrumpHuman extends Trump {

    private static TrumpHuman trumpHuman;

    public TrumpHuman(final String name, Shape shape, final boolean walkable) {
        super(name, shape, walkable);
    }

    public static TrumpHuman getInstance() {
        if(trumpHuman == null) {
            trumpHuman = new TrumpHuman("트럼프인간", Shape.TRUMP_HUMAN, true);
        }
        return trumpHuman;
    }

    public void hitTheDeck() {
        trumpHuman.hitTheDeck();
    }

    public void flipOver() {
        trumpHuman.flipOver();
    }

    @Override
    public void act() {
        walk();
        flutterFromSideToSide();
    }

    private void flutterFromSideToSide() {
        System.out.println(trumpHuman.name + "이 좌우로 펄럭입니다.");
    }

    private void walk() {
        if(canWalk()) {
            System.out.println(trumpHuman.name + "이 걸었습니다.");
        }
        throw new IllegalStateException(trumpHuman.name + "은 걸을 수 없습니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
