package ch3.trump;


public class Servant extends Trump {

    private static Servant servant;

    public Servant(final String name, Shape shape, final boolean walkable) {
        super(name, shape, walkable);
    }

    public static Servant getInstance() {
        if(servant == null) {
            servant = new Servant("신하", Shape.DIAMOND, true);
        }
        return servant;
    }

    @Override
    public void act() {
        servant.hitTheDeck();
        servant.flipOver();
        supportKingAndQueen();
    }

    private void supportKingAndQueen() {
        System.out.println(this.name + "은 왕과 왕비를 부축하고 있습니다.");
    }

    @Override
    public boolean canWalk() {
        return this.walkable;
    }
}
