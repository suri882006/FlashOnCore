/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.usingObservers;

/**
 *
 * @author Suraj
 */
public class ObservableMain {
    
    public ObservableMain()
   {
      ObservableClass ov = new ObservableClass(0);
      ObserverClass to = new ObserverClass(ov);
      ov.addObserver(to);
      ov.setValue(23);
   }
   public static void main(String [] args)
   {
      ObservableMain m = new ObservableMain();
   }
    
}
