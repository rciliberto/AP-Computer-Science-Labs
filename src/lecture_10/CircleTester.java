package lecture_10;

/**
 * Created by david on 1/19.
 *
 * @author david
 */
public class CircleTester {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();

        System.out.println(a); // x: 0.0, y: 0.0, radius: 1.0, color: black
        System.out.println(b); // x: 0.0, y: 0.0, radius: 1.0, color: black

        a.doubleRadius();
        a.setColor("white");
        b.translate(13, -2);
        b.setColor("red");

        System.out.println(a); // x: 0.0, y: 0.0, radius: 2.0, color: white
        System.out.println(b); // x: 13.0, y: -2.0, radius: 1.0, color: red
        System.out.println(a.getArea()); // 12.57
        System.out.println(b.isOnCircle(-15, 23)); // false
        System.out.println(b.isOnCircle(14, -2)); // true
    }
}
