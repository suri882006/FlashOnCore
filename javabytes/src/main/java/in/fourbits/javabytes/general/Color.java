/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *  You cannot call a constructor explicitly you can use this(1,2,3); instead    
 * @author Suraj
 */
class Color {
int red, green, blue;
Color() {
//Color(10, 10, 10);    You cannot call a constructFor explicitly you can use this(1,2,3); instead    
}
public Color(int r, int g, int b) {
red = r;
green = g;
blue = b;
}
void printColor() {
System.out.println("red: " + red + " green: " + green + " blue: " +
blue);
}
public static void main(String [] args) {
Color color = new Color();
color.printColor();
}
}
