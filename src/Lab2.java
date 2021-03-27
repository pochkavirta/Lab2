public class Lab2 {

    public static void main(String[] args) {
        double x1, y1, z1, x2, y2, z2, x3, y3, z3;
        try {
            x1 = Double.parseDouble(args[0]);
            y1 = Double.parseDouble(args[1]);
            z1 = Double.parseDouble(args[2]);
            x2 = Double.parseDouble(args[3]);
            y2 = Double.parseDouble(args[4]);
            z2 = Double.parseDouble(args[5]);
            x3 = Double.parseDouble(args[6]);
            y3 = Double.parseDouble(args[7]);
            z3 = Double.parseDouble(args[8]);
        } catch (Exception e) {
            System.out.println("Введено неверное значение");
            return;
        }
        Point3d point3d_1 = new Point3d(x1, y1, z1);
        Point3d point3d_2 = new Point3d(x2, y2, z2);
        Point3d point3d_3 = new Point3d(x3, y3, z3);

        System.out.println(computeArea(point3d_1, point3d_2, point3d_3));
    }

    private static double computeArea(Point3d point3d_1, Point3d point3d_2, Point3d point3d_3) {
        double a = point3d_1.distanceTo(point3d_2);
        double b = point3d_2.distanceTo(point3d_3);
        double c = point3d_1.distanceTo(point3d_3);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
