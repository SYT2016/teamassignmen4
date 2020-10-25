/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import Util.Address;
import Business.Airplane.Airplane;
import Business.Travel.Seat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 16104
 */
//一个航班的信息，包括飞机的详细信息，所属航空公司，航班出发时间和抵达时间，出发机场和抵达机场
public class Flight {
    private String flightCode;//航班编号，如：HN123456
    private String airlinerName;
    private Airplane airplane;
    private String takeoffTime;//飞机起飞时间
    private String arriveTime;
    private Date takeoffDate;
    private Date arriveDate;
    private Address takeoffPlace;//起飞的国家，城市，机场
    private Address arrivePlace;//到达的国家，城市，机场
    private ArrayList<Seat> seatlist;
    
    public Flight(){
    
    }
    public Flight(String airlinerName,Airplane airplane,String takeoffTime,String arriveTime, Address takeoffPlace,Address arrivePlace){
        this.airlinerName=airlinerName;
        this.airplane=airplane;
        this.takeoffTime=takeoffTime;
        this.takeoffPlace=takeoffPlace;
        this.arriveTime=arriveTime;
        this.arrivePlace=arrivePlace;
        //往seatlist里面加座椅
        seatlist=new ArrayList<Seat>();
        for(int i=0;i<this.airplane.getNumOfSeats();i++){
            seatlist.add(new Seat());       
        }  
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }
    
    
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String getTakeoffTime() {
        return takeoffTime;
    }

    public void setTakeoffTime(String takeoffTime) {
        this.takeoffTime = takeoffTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Address getTakeoffPlace() {
        return takeoffPlace;
    }

    public void setTakeoffPlace(Address takeoffPlace) {
        this.takeoffPlace = takeoffPlace;
    }

    public Address getArrivePlace() {
        return arrivePlace;
    }

    public void setArrivePlace(Address arrivePlace) {
        this.arrivePlace = arrivePlace;
    }

    public Date getTakeoffDate() {
        return takeoffDate;
    }

    public void setTakeoffDate(Date takeoffDate) {
        this.takeoffDate = takeoffDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }
    
    
    
    
}
