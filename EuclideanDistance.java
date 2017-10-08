public class EuclideanDistance {
    public static void main(String[] args) {
        // Tests if sqrt((x2-x1)^2 + (y2-y1)^2)
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(distance);
    }
}
