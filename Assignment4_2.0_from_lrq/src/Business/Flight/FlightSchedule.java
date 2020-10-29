/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import Business.Airliners.AirlinerProfile;
import Util.Address;
import Business.Airplane.Airplane;
import Business.Fleet.Fleet;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//存储所有航班信息（包括所有航空公司航班）
public class FlightSchedule {
    private ArrayList<Flight> FlightList;
    
    public FlightSchedule(){
        FlightList=new ArrayList<Flight>();
    
    }
    //在FlightSchedule里面加入一个flight
    public Flight addFlight(String airlinerName,Airplane airplane,String takeoffTime,String arriveTime, Address takeoffPlace,Address arrivePlace){
        Flight flight=new Flight(airlinerName, airplane, takeoffTime, arriveTime,  takeoffPlace, arrivePlace);
        
        FlightList.add(flight);
        addFlightToAirlinerList(flight);
        
        return flight;
    
    }
      //新增flight的时候，把这个flight加入到对应Airliner中的flight list里（把这个航班加入到对应公司旗下）
    
    private void addFlightToAirlinerList(Flight flight){
         for(AirlinerProfile fp:Fleet.airlinerDirectory.getAirlinerProfilelist())
        {
            if(flight.getAirlinerName().equals(fp.getAirlinerName()))
               fp.getAirlinerFlightList().add(flight);
        
        }
    
    }
    public void deleteFlight(Flight flight){
        FlightList.remove(flight);
        deleteFlightFromAirlinerList(flight);
        
    }
   //删除flight的时候，把这个flight从对应Airliner中的flight list里删除（把这个航班从对应公司旗下删除）
    
    private void deleteFlightFromAirlinerList(Flight flight){
         for(AirlinerProfile fp:Fleet.airlinerDirectory.getAirlinerProfilelist())
        {
            if(flight.getAirlinerName().equals(fp.getAirlinerName()))
               fp.getAirlinerFlightList().remove(flight);
        
        }
    
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