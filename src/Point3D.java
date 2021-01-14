public class Point3D extends  Point2D{
    private float z = 0.0f;
    Point3D(){}
    Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float arr[] = new float[3];
        arr[0] = this.getX();
        arr[1] = this.getY();
        arr[2] = this.z;
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + "x=" + getX() + "y=" + getY() +
                '}';
    }

    public static void main(String[] args) {
        Point2D p2 = new Point2D();
        p2.setXY(1.0f,2.0f);
        System.out.println(p2.toString());
        Point3D p3 = new Point3D();
        p3.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println(p3.toString());
    }
}
