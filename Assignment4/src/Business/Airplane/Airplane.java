/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airplane;

import Business.Flight.Flight;

/**
 * @author 16104
 */
//存储飞机的详细信息，包括飞机型号(S/M/L)，是否提供餐饮，机龄，飞机ID
public class Airplane {
    private String airplaneID;
    private String airplaneModel;
    private int airplaneAge;
    private int numOfSeats;
    private Flight flight;

    public Airplane(String airplaneID, String airplaneModel, int airplaneAge, int numOfSeats) {
        this.airplaneID = airplaneID;
        this.airplaneModel = airplaneModel;
        this.airplaneAge = airplaneAge;
        this.numOfSeats = numOfSeats;
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public void setAirplaneID(String airplaneID) {
        this.airplaneID = airplaneID;
    }

    public String getAirplaneModel() {
        return airplaneModel;
    }

    public void setAirplaneModel(String airplaneModel) {
        this.airplaneModel = airplaneModel;
    }

//    public boolean isIsFood() {
//        return isFood;
//    }
//
//    public void setIsFood(boolean isFood) {
//        this.isFood = isFood;
//    }

    public int getAirplaneAge() {
        return airplaneAge;
    }

    public void setAirplaneAge(int airplaneAge) {
        this.airplaneAge = airplaneAge;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }


    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
