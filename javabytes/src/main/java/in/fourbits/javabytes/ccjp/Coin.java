/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *  Output is Side Object Tail Side
 *
 * @author Suraj
 */

interface Side { String getSide(); }
class Head implements Side {
public String getSide() { return "Head "; }
}
class Tail implements Side {
    public String getSide() { return "Tail "; }
}

class Coin {
public static void overload(Head side) { System.out.print(side.getSide()); }
public static void overload(Tail side) { System.out.print(side.getSide()); }
public static void overload(Side side) { System.out.print("Side "); }
public static void overload(Object side) { System.out.print("Object "); }
public static void main(String []args) {
Side firstAttempt = new Head();
Tail secondAttempt = new Tail();
overload(firstAttempt);
overload((Object)firstAttempt);
overload(secondAttempt);
overload((Side)secondAttempt);
}
}
