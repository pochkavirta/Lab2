import java.util.Objects;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }


    private void setX(double val) {
        xCoord = val;
    }

    private void setY(double val) {
        yCoord = val;
    }

    private void setZ(double val) {
        zCoord = val;
    }

    @Override //создал через Alt+Insert
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return Double.compare(point3d.xCoord, xCoord) == 0 &&
                Double.compare(point3d.yCoord, yCoord) == 0 &&
                Double.compare(point3d.zCoord, zCoord) == 0;
    }

    public double distanceTo(Point3d other_point) {
        return Math.sqrt(Math.pow(xCoord - other_point.getX(), 2) +
                Math.pow(yCoord - other_point.getY(), 2) +
                Math.pow(zCoord - other_point.getZ(), 2));
    }
}
