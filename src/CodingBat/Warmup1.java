/*	CodingBat Java Warmup-1, AP Computer Science
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
 * Created by david on 1/19.
 *
 * Most of these are solved in 1 line if possible, 2 if necessary. This
 * was meant as a challenge for me, but you should try to understand
 * what I'm doing rather than just copy and paste it into CodingBat.
 *
 * @author david
 */
public class Warmup1 {
    public static void main(String[] args) {
        new Warmup1().nearHundred(109);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday) || (vacation); // Not weekday or vacation
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile; // True if both are smiling or not smiling
    }

    public int sumDouble(int a, int b) {
        return (a == b ? 2 : 1) * (a + b); // expression ? true : false. If a == b, multiply (a + b) by 2. If not, multiply by 1 (no change)
    }

    public int diff21(int n) {
        return (n > 21 ? -2 : 1) * (21 - n); // If n is more than 21, double the difference and negate it so it will be positive
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return (!negative && a * b < 0) || (negative && a < 0 && b < 0); // Only way a * b can be less than 0 would be if it is one is positive and the other negative.
    }

    public String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public String front3(String str) {
        if (str.length() > 3) str = str.substring(0, 3);
        return str + str + str;
    }

    public String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

    public boolean or35(int n) {
        return n % 3 * n % 5 == 0; // If either n is divisible by 3 (n % 3 == 0) or 5, the multiplication of the 2 will be 0
    }

    public String front22(String str) {
        String sub = str.substring(0, str.length() >= 2 ? 2 : str.length()); // If the string length is less than 2, use whatever chars are there.
        return sub + str + sub;
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int a, int b) {
        return (a < 0 && b > 100) || (b < 0 && a > 100);
    }

    public boolean in1020(int a, int b) {
        return a >= 10 && a <= 20 || b >= 10 && b <= 20;
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13);
    }

    public boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) != (b >= 13 && b <= 19);
    }

    public String delDel(String str) {
        return str.replaceAll("^(.)del", "$1"); // Uses regex here. ^ denotes the start of the string, (.) takes any character and saves it as $1, and "del" is included to match it
    }

    public boolean mixStart(String str) {
        return !str.equals(str.replaceAll("^.ix", "")); // Similar use of regex as delDel, but no need to save the character here. Compare the original string with the replaced one to see if anything was changed after attempting to replace
    }

    public String startOz(String str) {
        return str.replaceAll("((o)|.)((z)|.).*", "$2$4"); // More regex! For a breakdown, go to http://regexr.com/3f3ss
    }

    public int intMax(int a, int b, int c) {
        return (a > b && a > c ? a : (b > c ? b : c)); // If a is larger than b and c, return a. If not, return the larger between b and c
    }

    public int close10(int a, int b) {
        return Math.abs(a - 10) == Math.abs(b - 10) ? 0 : Math.abs(a - 10) < Math.abs(b - 10) ? a : b; // If equal distance from 10, return 0. If not, return the one with a smaller distance from 10
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public int max1020(int a, int b) {
        int larger = a > b ? a : b, smaller = a > b ? b : a;
        return larger <= 20 && larger >= 10 ? larger : smaller <= 20 && smaller >= 10 ? smaller : 0;
    }

    public boolean stringE(String str) {
        return str.contains("e") && str.length() - str.replace("e","").length() <= 3; // Compares lengths to count the number of e's
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public String endUp(String str) {
        return str.replaceAll("^(.*?)(.{0,3})$", "$1") + str.replaceAll("^(.*?)(.{0,3})$", "$2").toUpperCase(); // http://regexr.com/3f3t5
    }

    public String everyNth(String str, int n) {
        return str.replaceAll("(.)(.{0," + --n + "})", "$1");
    }
}
