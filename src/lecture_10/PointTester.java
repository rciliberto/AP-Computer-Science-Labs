package lecture_10;

public class PointTester {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();

        a.printPoint(); // 0, 0
        b.printPoint(); // 0, 0

        a.setLocation(3, -5);
        a.translate(-5, 2);
        b.setLocation(5, 7);

        a.printPoint(); // -2, -3
        b.printPoint(); // 5, 7

        System.out.println(a.distance(b)); // 12.2
        System.out.println(b.distanceFromOrigin()); // 8.6
    }
}
