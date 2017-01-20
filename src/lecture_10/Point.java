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
