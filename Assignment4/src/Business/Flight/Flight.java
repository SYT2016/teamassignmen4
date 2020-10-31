/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import Business.Airliners.Airliner;
import Business.Airplane.Airplane;
import Business.Travel.Seat;
import Util.Address;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author 16104
 */
//一个航班的信息，包括飞机的详细信息，所属航空公司，航班出发时间和抵达时间，出发机场和抵达机场
public class Flight {
    private String flightNumber;//航班编号，如：HN123456
    private Airliner airliner;
    private Airplane airplane;
    private Date takeOffTime;
    private Date landingTime;
    /**
     * 起飞的国家，城市，机场
     */
    private Address takeOffPlace;
    /**
     * 到达的国家，城市，机场
     */
    private Address landingPlace;
    private int remainAvailSeat;
    private List<Seat> seatList = new ArrayList<>();

    public Flight() {
    }

    public Flight(String flightNumber, Airliner airliner, Airplane airplane, Date takeOffTime, Date landingTime, Address takeOffPlace, Address landingPlace) {
        this.flightNumber = flightNumber;
        this.airliner = airliner;
        this.airplane = airplane;
        this.takeOffTime = takeOffTime;
        this.landingTime = landingTime;
        this.takeOffPlace = takeOffPlace;
        this.landingPlace = landingPlace;
        this.remainAvailSeat=getAvailSeats();
        initSeats(this.airplane.getNumOfSeats());
    }

    public void remove() {
        this.airliner.removeFlight(this);
    }

    private void initSeats(int seatNumber) {
        for (int i = 0; i < seatNumber; i++) {
            int row = i / 6;
            String column = null;
            String no = null;
            if (i % 6 == 0) {
                column = "WINDOW";
                no = "A";
            }
            if (i % 6 == 5) {
                column = "WINDOW";
                no = "F";
            }
            if (i % 6 == 1) {
                column = "MIDDLE";
                no = "B";
            }
            if (i % 6 == 4) {
                column = "MIDDLE";
                no = "E";
            }
            if (i % 6 == 2) {
                column = "AISLE";
                no = "C";
            }
            if ( i % 6 == 3) {
                column = "AISLE";
                no = "D";
            }
            seatList.add(new Seat(row + 1, column, (row + 1) + no));
        }
    }
    
    //该航班剩余可用座位
    public int getAvailSeats(){
        int num=0;
        for(Seat s:seatList){
            if(!s.isIsOccupy()) num++;
        }
        return num;
    }
    
    //预订航班后座位信息的变化。输入(1,A)这种
    public boolean checkSeatCondition(int row,String seatNo){
        for(Seat s:seatList){
            if((row+""+seatNo).equals(s.getSeatNo())){
                if(s.isIsOccupy()){
                    //JOptionPane.showMessageDialog(null, "The seat has been occupied. Please select another one");
                    return false;
                }
            }          
        }
        return true;
    }
    
    public void changeSeatCondition(int row,String seatNo){
        for(Seat s:seatList){
            if((row+""+seatNo).equals(s.getSeatNo())){
                s.setIsOccupy(true);
            }          
        }
    }
    
    @Override
    public String toString(){
        return this.flightNumber;
    }

    public int getRemainAvailSeat() {
        return remainAvailSeat;
    }

    public void setRemainAvailSeat(int remainAvailSeat) {
        this.remainAvailSeat = remainAvailSeat;
    }    
    

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
        initSeats(airplane.getNumOfSeats());
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Address getTakeOffPlace() {
        return takeOffPlace;
    }

    public void setTakeOffPlace(Address takeOffPlace) {
        this.takeOffPlace = takeOffPlace;
    }

    public Address getLandingPlace() {
        return landingPlace;
    }

    public void setLandingPlace(Address landingPlace) {
        this.landingPlace = landingPlace;
    }

    public Date getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(Date takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public Date getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(Date landingTime) {
        this.landingTime = landingTime;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }
}
