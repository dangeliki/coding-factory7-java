package gr.aueb.cf.ch14.immutable;

public class Point {

    private int x;
    private int y;

//    Constructors
    public Point() {

    }

    public Point(int x, int y) {
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
//    Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

//    ToString
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
