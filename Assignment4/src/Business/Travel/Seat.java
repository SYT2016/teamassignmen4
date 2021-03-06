/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

/**
 * @author 16104
 */
//用seatNumber可以推算出第几排和第几列，觉得麻烦可以改
public class Seat {

    private int row;

    /** WINDOW,MIDDLE,AISLE */
    private String column;

    private boolean isOccupy;

    private String seatNo;

    public Seat() {
        this.isOccupy = false;
    }

    public Seat(int row, String column) {
        this.row = row;
        this.column = column;
        this.isOccupy = true;
    }
    
    public Seat(int row, String column, String seatNo) {
        this.row = row;
        this.column = column;
        this.seatNo = seatNo;
        this.isOccupy = false;//false when initializing
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public boolean isIsOccupy() {
        return isOccupy;
    }

    public void setIsOccupy(boolean isOccupy) {
        this.isOccupy = isOccupy;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    
    
    @Override
    public String toString() {
        return "Seat{" +
                "row=" + row +
                ", column='" + column + '\'' +
                ", isOccupy=" + isOccupy +
                ", seatNo='" + seatNo + '\'' +
                '}';
    }
}
