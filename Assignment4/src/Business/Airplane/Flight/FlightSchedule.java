/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airplane.Flight;

import Util.Address;
import Business.Airplane.Airplane;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//存储
public class FlightSchedule {
    private ArrayList<Flight> FlightList;
    
    public FlightSchedule(){
        FlightList=new ArrayList<Flight>();
    
    }
    public Flight addFlight(String airlinerName,Airplane airplane,String takeoffTime,String arriveTime, Address takeoffPlace,Address arrivePlace){
        Flight flight=new Flight(airlinerName, airplane, takeoffTime, arriveTime,  takeoffPlace, arrivePlace);
        FlightList.add(flight);
        return flight;
    
    }
    public void deleteFlight(Flight flight){
        FlightList.remove(flight);
        
    }
    //返回某个航空公司的所有flightlist
    public ArrayList<Flight> getAirlinerFlightList(String name){
         ArrayList<Flight> airlinerflightlist=new ArrayList<Flight> ();
        for(Flight flight:FlightList)
        {
            if(flight.getAirlinerName().equals(name))
               airlinerflightlist.add(flight);
        
        }
        return airlinerflightlist;
    
    }

    public ArrayList<Flight> getFlightList() {
        return FlightList;
    }

    public void setFlightList(ArrayList<Flight> FlightList) {
        this.FlightList = FlightList;
    }
    
    
    
}
