/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

/**
 *
 * @author 16104
 */
//用seatNumber可以推算出第几排和第几列，觉得麻烦可以改
public class Seat {
    private  static int number=0;
    private boolean isOccupy;
    private int seatNumber;
    
    public Seat(){
        this.isOccupy=false;
        number++;
        this.seatNumber=number;
    }
    
}
