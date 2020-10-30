/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import Business.Airplane.Airplane;
import Business.Flight.Flight;

/**
 * 某一个航空公司的详细信息+该航空公司旗下的所有Flight的List
 * @author Cong
 */
public class AirlinerProfile {
    private Airliner airliner;
    private Flight flight;
    private Airplane airplane;
    //private AirlinerProfileList airplaneProfileList;
    //private ArrayList<Flight> airlinerFlightList;//该公司旗下的所有flihgt list
    //private String airlinerName;//航空公司名字
    
    public AirlinerProfile(Airliner airliner, Flight flight, Airplane airplane){
        this.airliner = airliner;
        this.flight = flight;
        this.airplane = airplane;
    }

    public String hash() {
        return String.join("_", airliner.getName() + flight.getFlightNumber() + airplane.getAirplaneID());
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    //    public AirlinerProfile(Airliner airliner){
//
//        airlinerFlightList=new ArrayList<Flight> ();
//        this.airlinerName=airliner.getName();
//        this.airliner=airliner;
//
//
//
//    }

//    public String getAirlinerName() {
//        return airlinerName;
//    }
//
//    public void setAirlinerName(String airlinerName) {
//        this.airlinerName = airlinerName;
//    }
//
//
//    public Airliner getAirliner() {
//        return airliner;
//    }
//
//    public void setAirliner(Airliner airliner) {
//        this.airliner = airliner;
//    }
//
//    public ArrayList<Flight> getAirlinerFlightList() {
//        return airlinerFlightList;
//    }
//
//    public void setAirlinerFlightList(ArrayList<Flight> airlinerFlightList) {
//        this.airlinerFlightList = airlinerFlightList;
//    }
    
}
