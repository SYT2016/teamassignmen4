/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fleet;

import Business.Airliners.AirlinerDirectory;
import Business.Airplane.AirplaneDirectory;

/**
 *
 * @author 16104
 */
//存储AiplaneDirectory和AirlinerDirectory
public class Fleet {
    public static AirplaneDirectory aiplaneDirectory;
    public static AirlinerDirectory airlinerDirectory;
    
    public Fleet(){
    }
    public Fleet(AirplaneDirectory aiplaneDirectory,AirlinerDirectory airlinerDirectory){
        this.aiplaneDirectory=aiplaneDirectory;
        this.airlinerDirectory=airlinerDirectory;
    
    }
    
}
