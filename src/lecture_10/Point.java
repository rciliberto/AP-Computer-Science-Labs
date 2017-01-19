package lecture_10;

public class Point {
    int x = 0;
    int y = 0;

    // Sets the values of x and y
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Adds dx and dy to x and y, respectively
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Returns the distance between the current point and another point
    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Returns the distance from the origin (0, 0)
    public double distanceFromOrigin() {
        return distance(new Point());
    }

    public void printPoint() {
        System.out.println(x + ", " + y);
    }
}
