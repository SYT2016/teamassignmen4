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
        initSeats(this.airplane.getNumOfSeats());

        //seatList.forEach(System.out::println);

    }

    private void initSeats(int seatNumber) {
        for (int i = 0; i < seatNumber; i++) {
            int row = i / 6;
            String column = null;
            String no = null;
            if (i % 6 == 0) {
                column = "window";
                no = "A";

            }
            if (i % 6 == 5) {
                column = "window";
                no = "F";
            }
            if (i % 6 == 1) {
                column = "middle";
                no = "B";
            }
            if (i % 6 == 4) {
                column = "middle";
                no = "E";
            }
            if (i % 6 == 2) {
                column = "aisle";
                no = "C";
            }

            if ( i % 6 == 3) {
                column = "aisle";
                no = "D";
            }
            seatList.add(new Seat(row + 1, column, (row + 1) + no));
        }
    }
    
    //该航班剩余可用座位
    public int getAvailSeats(){
        int num=0;
        for(Seat s:seatList){
            if(!s.isOccupy()) num++;
        }
        return num;
    }
    
    @Override
    public String toString(){
        return this.flightNumber;
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

    @Override
    public String toString() {
        return getFlightNumber();
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
