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
    private int row;
    private String column;//window,middle,aisle
    private boolean isOccupy;
      
    public Seat(){
        this.isOccupy=false;
    }
    
    public Seat(int row,String column){
        this.row=row;
        this.column=column;
        this.isOccupy=true;
    }
    
}