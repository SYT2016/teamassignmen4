/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author 16104
 */
public class Address {
    private String Country;
    private String City;
    private String airportname;
    public Address(){
    }
    public Address(String Country,String City,String airportname){//起飞，降落机场
        this.Country=Country;
        this.City=City;
        this.airportname=airportname;
    
    }
     public Address(String Country,String City){//公司地点
        this.Country=Country;
        this.City=City;
       
    
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname;
    }
    
}
