/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airplane;

/**
 *
 * @author 16104
 */
//存储飞机的详细信息，包括飞机型号(S/M/L)，是否提供餐饮，机龄，飞机ID
public class Airplane {
    private String airplaneID;
    private String airplaneModel;
    private boolean isFood;
    private int airplaneage;
    private int numOfSeats;
    public Airplane(){
    
    }
    
    public Airplane(String airplaneID,String airplaneModel,boolean isFood,int airplaneage,int numofseats){
        this.airplaneID=airplaneID;
        this.airplaneModel=airplaneModel;
        this.isFood=isFood;
        this.airplaneage=airplaneage;
        this.numOfSeats=numofseats;
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

    public boolean isIsFood() {
        return isFood;
    }

    public void setIsFood(boolean isFood) {
        this.isFood = isFood;
    }

    public int getAirplaneage() {
        return airplaneage;
    }

    public void setAirplaneage(int airplaneage) {
        this.airplaneage = airplaneage;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
    
    
    
}
