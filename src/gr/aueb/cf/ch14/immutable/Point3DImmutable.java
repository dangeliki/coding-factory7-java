package gr.aueb.cf.ch14.immutable;

//Για να γινει strictly immutable θα πρεπει να γινει final

public class Point3DImmutable extends ImmutablePoint {

    private ImmutablePoint immutablePoint;
    private int z;

//    Constructors
    public  Point3DImmutable() {
        immutablePoint = new ImmutablePoint();
    }

    public Point3DImmutable(ImmutablePoint immutablePoint, int z) {
        this.immutablePoint = immutablePoint;
        this.z = z;
    }

//    Getters
    public ImmutablePoint getImmutablePoint() {
        return immutablePoint;
    }

    public int getZ() {
        return z;
    }

//    Setters

    public void setImmutablePoint(ImmutablePoint immutablePoint) {
        this.immutablePoint = immutablePoint;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
