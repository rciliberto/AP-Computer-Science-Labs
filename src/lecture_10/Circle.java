/*	lecture 10 lab, AP Computer Science
 * 
 *  Copyright (C) 2017  David Shen
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
