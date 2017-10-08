public class TriangleTest {
    public static void main(String[] args) {
        // Tests if a^2 + b^2 > c^2
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        boolean results = a*a + b*b > c*c;
        System.out.println(results);
    }
}
