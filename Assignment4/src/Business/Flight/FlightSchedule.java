/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import Business.Airliners.Airliner;
import Business.Airplane.Airplane;
import Util.Address;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 16104
 */
//存储所有航班信息（包括所有航空公司航班）
public class FlightSchedule {
    private static ArrayList<Flight> FlightList;

    public FlightSchedule() {
        FlightList = new ArrayList<>();

    }

    //在FlightSchedule里面加入一个flight
    public Flight addFlight(String flightNumber, Airliner airliner, Airplane airplane, Date takeOffTime, Date landingTime, Address takeoffPlace, Address arrivePlace) {
        Flight flight = new Flight(flightNumber, airliner, airplane, takeOffTime, landingTime, takeoffPlace, arrivePlace);

        FlightList.add(flight);
        addFlightToAirlinerList(flight);

        return flight;

    }
    
    public Flight addFlight(){
        Flight flight=new Flight();
        FlightList.add(flight);
        return flight;
    }

    /**
     * 新增flight的时候，把这个flight加入到对应Airliner中的flight list里（把这个航班加入到对应公司旗下）
     */
    private void addFlightToAirlinerList(Flight flight) {
//        for (AirlinerProfile fp : Fleet.airlinerDirectory.getAirlinerList()) {
//            if (flight.getAirlinerName().equals(fp.getAirlinerName()))
//                fp.getAirlinerFlightList().add(flight);
//
//        }

    }

    public void deleteFlight(Flight flight) {
        FlightList.remove(flight);
        deleteFlightFromAirlinerList(flight);

    }

    /**
     * 删除flight的时候，把这个flight从对应Airliner中的flight list里删除（把这个航班从对应公司旗下删除）
     */
    private void deleteFlightFromAirlinerList(Flight flight) {
//        for (AirlinerProfile fp : Fleet.airlinerDirectory.getArrayList()) {
//            if (flight.getAirlinerName().equals(fp.getAirlinerName()))
//                fp.getAirlinerFlightList().remove(flight);
//
//        }

    }

    /**
     * 返回某个航空公司的所有flightlist
     */
    public ArrayList<Flight> getAirlinerFlightList(String name) {
        ArrayList<Flight> airlinerflightlist = new ArrayList<Flight>();
        for (Flight flight : FlightList) {
            if (flight.getAirliner().getName().equals(name))
                airlinerflightlist.add(flight);

        }
        return airlinerflightlist;

    }
    
    //根据日期找航班
    public ArrayList<Flight> getFlightListThroughDate(Date d,ArrayList<Flight> arr){
        ArrayList<Flight> l=new ArrayList<Flight>();
        for(Flight f:arr){
            if(f.getTakeOffTime().before(d)){
                l.add(f);
            }
        }
        return l;
    }
    
    //根据地点找航班
    public ArrayList<Flight> getFlightThroughAddress(Address from,Address to){
        ArrayList<Flight> l=new ArrayList<Flight>();
        for(Flight f:FlightList){
            if(f.getTakeOffPlace().toString().equals(from.toString()) && f.getLandingPlace().toString().equals(to.toString())){
                l.add(f);
            }
        }
        return l;
    }
    
    //查找还有空余座位的航班
    public ArrayList<Flight> getFlightThroughAvailSeats(){
        ArrayList<Flight> l=new ArrayList<Flight>();
        for(Flight f:FlightList){
            if(f.getAvailSeats()>0){
                l.add(f);
            }
        }
        return l;
    }

    public ArrayList<Flight> getFlightList() {
        return FlightList;
    }

    public void setFlightList(ArrayList<Flight> FlightList) {
        this.FlightList = FlightList;
    }
}
