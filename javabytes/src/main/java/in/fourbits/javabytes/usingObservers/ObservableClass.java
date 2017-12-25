/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.usingObservers;

import java.util.Observable;

/**
 *
 * @author hp
 */
public class ObservableClass extends Observable {
    
    private int n = 0;
   public ObservableClass(int n)
   {
      this.n = n;
   }
   public void setValue(int n)
   {
      this.n = n;
      setChanged();
      notifyObservers();
   }
   public int getValue()
   {
      return n;
   }
    
}
