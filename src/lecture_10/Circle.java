package lecture_10;

/**
 * Created by david on 1/19.
 *
 * @author david
 */
public class Circle {
    double x = 0;
    double y = 0;
    double radius = 1;
    String color = "black";

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean isOnCircle(double a, double b) {
        double dx = x - a;
        double dy = y - b;
        return Math.sqrt(dx * dx + dy * dy) <= radius; // Check if the distance between the point and the center of the circle is less than the radius
    }

    public void setColor(String str) {
        color = str;
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void doubleRadius() {
        radius *= 2;
    }

    // Returns the variable values (for CircleTester)
    public String toString() {
        return String.format("x: %s, y: %s, radius: %s, color: %s", x, y, radius, color);
    }
}
