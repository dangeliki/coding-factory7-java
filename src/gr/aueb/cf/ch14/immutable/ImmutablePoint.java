package gr.aueb.cf.ch14.immutable;

public class ImmutablePoint {

//    Final πεδια -> δεν εχουμε setters γιατι δεν μπορουν να αλλαξουν!
    private final int x;
    private final int y;

//    Constructors
    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
//    Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
