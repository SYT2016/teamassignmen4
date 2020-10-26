/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

import Business.Airliners.AirlinerDirectory;
import Business.Airplane.*;
import Business.Flight.FlightSchedule;

/**
 *
 * @author 16104
 */
//掌管AirplaneDirectory和AirlinerDirectory和FlightSchedule
public class TravelAgency {
    private String agencyName;
    private TravelOffice[] officeList;
    private AirplaneDirectory airplaneDirectory;
    private AirlinerDirectory airlinerDirectory;
    private FlightSchedule flightSchedule;
            
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public TravelOffice[] getOfficeList() {
        return officeList;
    }

    public void setOfficeList(TravelOffice[] officeList) {
        this.officeList = officeList;
    }

    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(AirplaneDirectory airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
    
    
    
}
