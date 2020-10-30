/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 * @author 16104   1026测试
 */
public class Address {
    private String country;
    private String city;
    private String airportName;

    public Address() {
    }
    
    public Address(String Country, String City, String airportName) {//起飞，降落机场
        this.country = Country;
        this.city = City;
        this.airportName = airportName;

    }

    public Address(String Country, String City) {//公司地点
        this.country = Country;
        this.city = City;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String Country) {
        this.country = Country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        this.city = City;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return country + " " + city;
    }
}
