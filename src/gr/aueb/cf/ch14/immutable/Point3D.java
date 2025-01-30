package gr.aueb.cf.ch14.immutable;

/**
 * Point3D should be immutable
 * Θα πρεπει τα πεδια να ειναι final και
 * θα πρεπει να ερχονται και να φευγουν deep copies και οχι αναφορες
 */
public class Point3D {

    private final Point point;
    private final int z;

//    Constructors
    public Point3D() {
        point = new Point();
        z = 0;
    }


    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(),point.getY());
        this.z = z;
    }

//    Getters
    public Point getPoint() {
        return new Point(point.getX(),point.getY());
    }

    public int getZ() {
        return z;
    }

}
