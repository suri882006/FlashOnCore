package in.fourbits.javabytes.usingObservers;

import java.util.Observer;
import java.util.Observable;
public class ObserverClass implements Observer
{
   private ObservableClass ov = null;
   public ObserverClass(ObservableClass ov)
   {
      this.ov = ov;
   }
   public void update(Observable obs, Object obj)
   {
      if (obs == ov)
      {
         System.out.println(ov.getValue());
      }
   }
}