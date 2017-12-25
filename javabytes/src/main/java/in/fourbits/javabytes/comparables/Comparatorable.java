/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Suraj
 */
public class Comparatorable {

    public static class clsCountry implements Comparable<clsCountry> {
    
        private int iCountryId;
        private String CountryName;
        
        public clsCountry()
        {
            
        }
        
        public clsCountry(int iniCountryId,String inCountryName)
        {
            this.iCountryId=iniCountryId;
            this.CountryName=inCountryName;
        }

        public int getiCountryId() {
            return iCountryId;
        }

        public void setiCountryId(int iCountryId) {
            this.iCountryId = iCountryId;
        }

        public String getCountryName() {
            return CountryName;
        }

        public void setCountryName(String CountryName) {
            this.CountryName = CountryName;
        }

        @Override
        public int compareTo(clsCountry o) {
            return(this.iCountryId<o.getiCountryId()?-1:(this.iCountryId>o.getiCountryId()?1:0));
        }
        
    }
    
    public static void main(String[] args) {
//        ArrayList<Integer> IntList=new ArrayList<Integer>();
//        IntList.add(5);
//        IntList.add(1);
//        IntList.add(4);
//        IntList.add(3);
//        IntList.add(2);
//    
//        System.out.println(" initiall===>"+IntList.toString());
//        Collections.sort(IntList);
//        System.out.println(" afterrr ===>"+IntList.toString());
        
        List<clsCountry> list ;
        ArrayList<clsCountry> CntList=new ArrayList<clsCountry>();
        LinkedList linkedList=new LinkedList<clsCountry>();
        list = CntList;
        list = linkedList;
        CntList.add(new clsCountry(5,"india"));
        CntList.add(new clsCountry(1,"Africa"));
        CntList.add(new clsCountry(4,"india444"));
        CntList.add(new clsCountry(6,"Bangladesh"));
        
        System.out.println(" initiall===>"+CntList.toString());
        Collections.sort(CntList);  // sorting based on country id
//        Collections.sort(CntList,new Comparator<clsCountry>(){
//
//            @Override
//            public int compare(clsCountry o1, clsCountry o2) {
//                 return o1.getCountryName().compareTo(o2.getCountryName());
//            }
//            
//        });
        for(clsCountry Obj:CntList)
        {
            System.out.println(" id ==> "+Obj.getiCountryId()+" name ==> "+Obj.getCountryName());
        }
        
        
        
    }
}

