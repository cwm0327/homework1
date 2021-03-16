public class Vector {
    private double x1;
    private double y1;
    private double z1;

    public Vector(double x, double y, double z) {
        this.x1 = x;
        this.y1 = y;
        this.z1 = z;
    }

    public void printVector() {
        System.out.println(this.x1 + " " + this.y1 + " " + this.z1);
    }

    public double getMod() {
        return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
    }

    public Vector addVector(Vector v1, Vector v2) {
        return new Vector(v1.x1 + v2.x1, v2.y1 + v1.y1, v1.z1 + v2.z1);
    }

    public Vector subVector(Vector v1, Vector v2) {
        return new Vector(v1.x1 - v2.x1, v1.y1 - v2.y1, v1.z1 - v2.z1);
    }

    public double dotMult(Vector v1, Vector v2) {
        return v1.x1 * v2.x1 + v1.y1 * v2.y1 + v1.z1 * v2.z1;
    }

    public Vector crossMult(Vector v1, Vector v2) {
        return new Vector(v1.y1 * v2.z1 - v1.z1 * v2.y1,
                v1.z1 * v2.x1 - v1.x1 * v2.z1, v1.x1 * v2.y1 - v1.y1 * v2.x1);

    }
}
