/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import Business.Airplane.Flight.Flight;
import Business.Airplane.Flight.FlightSchedule;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//某一个航空公司的详细信息+该航空公司旗下的所有Flight的List
public class AirlinerProfile {
    private Airliner airliner;
    private ArrayList<Flight> airlinerFlightList;//该公司旗下的所有flihgt list
    private String airlinerName;//航空公司名字
    
    public AirlinerProfile(){
    
    }
    public AirlinerProfile(Airliner airliner,FlightSchedule flightSchedule){
        airlinerFlightList=new ArrayList<Flight> ();
        this.airlinerName=airliner.getAirlinerName();
        this.airliner=airliner;
        //利用公司名字搜索出所有属于该公司的flight list
        this.airlinerFlightList=flightSchedule.getAirlinerFlightList(airlinerName);

    
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public ArrayList<Flight> getAirlinerFlightList() {
        return airlinerFlightList;
    }

    public void setAirlinerFlightList(ArrayList<Flight> airlinerFlightList) {
        this.airlinerFlightList = airlinerFlightList;
    }
    
}
