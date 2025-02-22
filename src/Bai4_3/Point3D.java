package Bai4_3;

public class Point3D extends Point2D {
    private float z = 0.0f;

    // Constructors
    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // Getters and Setters
    public float getZ() { return z; }
    public void setZ(float z) { this.z = z; }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    // Override toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

