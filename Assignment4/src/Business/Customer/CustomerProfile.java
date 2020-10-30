/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Travel.Ticket;
import Util.Address;
import java.util.Date;

/**
 *
 * @author 16104
 */
//存储某个customer的基本信息+游客一次飞行行程
public class CustomerProfile {
    private Customer customer;
    private Address from;
    private Address to;
    private Date departTime;
    private Date backTime;
    private boolean isBookFlight;
    
    @Override
    public String toString(){
        return customer.getName();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getFrom() {
        return from;
    }

    public void setFrom(Address from) {
        this.from = from;
    }

    public Address getTo() {
        return to;
    }

    public void setTo(Address to) {
        this.to = to;
    }

    public Date getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public boolean getIsBookFlight() {
        return isBookFlight;
    }

    public void setIsBookFlight(boolean isBookFlight) {
        this.isBookFlight = isBookFlight;
    }
    
    
    
}
