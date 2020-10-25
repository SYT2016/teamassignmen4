/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airplane;

import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//用airplanelist存储所有飞机详细的
public class AirplaneDirectory {
    private ArrayList<Airplane> airplanelist;
    
    public AirplaneDirectory(){
        airplanelist=new ArrayList<Airplane> ();
    
    }
    public Airplane addAirplane(String airplaneID,String airplaneModel,boolean isFood,int airplaneage,int numofseats){
        
        Airplane airplane=new Airplane(airplaneID,airplaneModel,isFood,airplaneage,numofseats);
        airplanelist.add(airplane);
        return airplane;
    
    }

    public ArrayList<Airplane> getAirplanelist() {
        return airplanelist;
    }

    public void setAirplanelist(ArrayList<Airplane> airplanelist) {
        this.airplanelist = airplanelist;
    }
    
    
    
    
}
