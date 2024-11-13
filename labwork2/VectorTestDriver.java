package labwork2;

public class VectorTestDriver {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        v1.setXY(1,2);
        v2.setXY(2, 1);
        v1.add(v2);
        v1.subtract(v2);
        v1.dot_product(v2);
    }
}
