/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Business.Flight.Flight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author LRQ
 */
public class Sort {
    //sort according to time
    public static void sortInTime(ArrayList<Flight> l){
        Collections.sort(l, new Comparator<Flight>(){
            @Override
            public int compare(Flight f1,Flight f2){
                if(f1.getTakeOffTime().before(f2.getTakeOffTime())){
                    return 1;
                }
                return 0;
            }
        });
    }
}
