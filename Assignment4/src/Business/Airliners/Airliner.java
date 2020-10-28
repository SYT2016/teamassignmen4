/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import Business.Flight.Flight;
import Util.Address;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 16104
 */
//一个航空公司的详细信息，例如公司名字，公司创建年份。公司所在地点,公司旗下飞机总数
public class Airliner {
    private String name;
    private Address address;
    private int airplaneNumber;
    private String password;
    private List<Flight> flightList = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public Airliner(String name, String country, String city, String password){
        this.name = name;
        Address address = new Address(country, city);
        this.address = address;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAirplaneNumber() {
        return airplaneNumber;
    }

    public void setAirplaneNumber(int airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
