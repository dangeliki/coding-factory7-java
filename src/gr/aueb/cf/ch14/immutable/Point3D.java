package gr.aueb.cf.ch14.immutable;

/**
 * Point3D should be immutable
 */
public class Point3D {

    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

}
