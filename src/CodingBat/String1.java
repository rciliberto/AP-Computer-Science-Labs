/*	CodingBat Java String-1, AP Computer Science
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
package CodingBat;

/**
 * Created by david on 1/20.
 *
 * @author david
 */
public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        return "sss".replace("s", str.substring(str.length() - 2)); // A cheaty way of repeating thrice, while maintaining relative readability
    }

    public String firstTwo(String str) {
        return str.substring(0, (str.length() > 2 ? 2 : str.length()));
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        return "s/l/s".replace("s", a.length() > b.length() ? b : a).replace("/l/", a.length() > b.length() ? a : b);
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        return String.valueOf(str.charAt(front ? 0 : str.length() - 1));
    }

    public String withouEnd2(String str) {
        return str.length() > 2 ? str.substring(1, str.length() - 1) : "";
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index > str.length() - 2 || index < 0) index = 0;
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        return str.replaceAll("^.?bad.*", "bad").equals("bad");
    }

    public String atFirst(String str) {
        return (str + "@@").substring(0, 2); // We can add the "@"s beforehand, because if a's length is more than 2 it will be ignored with substring
    }

    public String lastChars(String a, String b) {
        return (a + "@").substring(0, 1) + ("@" + b).substring(b.length()); // Similar to atFirst, the @'s can be placed in positions that will be ignored if not needed
    }

    public String conCat(String a, String b) {
        return (a + "/" + b).replaceAll("(.?)/\\1", "$1"); // If matches pattern "%s/%s", replace with %s. %s can be an empty string
    }

    public String lastTwo(String str) {
        return str.replaceAll("(.)(.)$", "$2$1");
    }

    public String seeColor(String str) {
        return str.replaceAll("(^(red|blue)).*$|^.*$", "$2");
    }

    public boolean frontAgain(String str) {
        return str.length() > 1 && str.endsWith(str.substring(0, 2));
    }

    public String minCat(String a, String b) {
        return (a.length() > b.length() ? a.substring(a.length() - b.length()) : a) + (b.length() > a.length() ? b.substring(b.length() - a.length()) : b);
    }

    public String extraFront(String str) {
        return "sss".replace("s", str.length() > 1 ? str.substring(0, 2) : str);
    }

    public String without2(String str) {
        return str.length() < 2 ? str : str.replaceAll("^" + str.substring(str.length() - 2), "");
    }

    public String deFront(String str) {
        return str.replaceAll("^(.)[^b]", "$1").replaceAll("^[^a]", "");
    }

    public String startWord(String str, String word) {
        return str.contains(word.substring(1)) ? str.replaceAll("^(." + word.substring(1) + ").*$", "$1") : "";
    }

    public String withoutX(String str) {
        return str.replaceAll("^x?(.*?)x?$", "$1");
    }

    public String withoutX2(String str) {
        return str.replaceAll("^(.)x", "$1").replaceAll("^x", "");
    }
}
