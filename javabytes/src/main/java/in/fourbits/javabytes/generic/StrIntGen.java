/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.generic;

import java.util.List;

/**
 *
 * @author hp
 */
public class StrIntGen<T> {
    
    public boolean elementExists(List<T> list, T pattern) {
        return list.contains(pattern);
    }
    
}
