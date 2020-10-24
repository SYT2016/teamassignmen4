/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import Util.Address;

/**
 *
 * @author 16104
 */
//一个航空公司的详细信息，例如公司名字，公司创建年份。公司所在地点,公司旗下飞机总数
public class Airliner {
    private String airlinerName;
    private Address airlinerPlace;
    private int airplanenumber;
    
    public Airliner(){
    
    }
    
    public Airliner(String airlinerName,Address airlinerPlace,int airplanenumber){
        this.airlinerName=airlinerName;
        this.airlinerPlace=airlinerPlace;
        this.airplanenumber=airplanenumber;
        
    
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Address getAirlinerPlace() {
        return airlinerPlace;
    }

    public void setAirlinerPlace(Address airlinerPlace) {
        this.airlinerPlace = airlinerPlace;
    }

    public int getAirplanenumber() {
        return airplanenumber;
    }

    public void setAirplanenumber(int airplanenumber) {
        this.airplanenumber = airplanenumber;
    }
    
}
