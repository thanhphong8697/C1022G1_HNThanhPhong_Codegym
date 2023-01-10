package Inheritance.Exercise.Point2DAndPoint3DClass;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public float[] getXYZ() {
        float[] array = {this.getX(), this.getY(), this.z};
        return array;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                ", x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                ", array=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
