/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 10/01/20
 *   Time: 7:29 PM
 */

package main;

import checker.EvenOddChecker;

public class Main {
    public static void main(String[] args) {
        EvenOddChecker checker = new EvenOddChecker();
        checker.checkEvenOddInStringArray(new String[]{"0", "1", "2"});
    }
}
