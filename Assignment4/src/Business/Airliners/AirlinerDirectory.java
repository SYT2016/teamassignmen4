/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliners;

import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//存储里面是AirlinerProfile的arraylist，相当于全中国所有的航空空司的信息
//AirlinerProfile里面包括航空公司名字+一个航空公司的详细信息+该航空公司旗下的所有Flight的List
public class AirlinerDirectory {
    private ArrayList<AirlinerProfile> airlinerProfilelist;

    public ArrayList<AirlinerProfile> getAirlinerProfilelist() {
        return airlinerProfilelist;
    }

    public void setAirlinerProfilelist(ArrayList<AirlinerProfile> airlinerProfilelist) {
        this.airlinerProfilelist = airlinerProfilelist;
    }
    
    
    
    
    
}
