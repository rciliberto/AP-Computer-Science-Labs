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
