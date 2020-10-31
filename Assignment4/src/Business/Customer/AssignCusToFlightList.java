/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author LRQ
 */
public class AssignCusToFlightList {
    //private ArrayList<AssignCusToFlight> cusPros;
    private ArrayList<AssignCusToFlight> actfList;
    
    public AssignCusToFlightList(){
        actfList=new ArrayList<AssignCusToFlight>();
    }
    
    public AssignCusToFlight addIn(){
        AssignCusToFlight assign=new AssignCusToFlight();
        actfList.add(assign);
        return assign;
    }
    
    public void addIn(AssignCusToFlight assign){
        actfList.add(assign);
    }

    public ArrayList<AssignCusToFlight> getActfList() {
        return actfList;
    }

    public void setActfList(ArrayList<AssignCusToFlight> actfList) {
        this.actfList = actfList;
    }
    
}
