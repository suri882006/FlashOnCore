/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.staticUsage;

/**
 *
 * @author Suraj
 */
public class Hotel {
    private int roomNr;
    
    public Hotel()
    {
        
    }
    
    public Hotel(int roomNr) {
        this.roomNr = roomNr;
    }
    
    public int getRoomNr() {
        return this.roomNr;
    }
    
    static Hotel doStuff(Hotel hotel) {
        hotel = new Hotel(1);
        return hotel;
    }
    
    public void book() throws Exception {
        throw new Exception();
    }
    
    public static void main(String args[]) {
        Hotel h1 = new Hotel(100);
        System.out.print(h1.getRoomNr() + " ");
        Hotel h2 = doStuff(h1);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        h1 = doStuff(h2);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
    }
}
