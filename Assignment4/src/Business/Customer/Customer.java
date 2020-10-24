/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Travel.Ticket;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//顾客基本信息，名字+年龄+身份证号码+性别
public class Customer {
    private String customerID;
    private String name;
    private int age;
    private String gender;
    private ArrayList<Ticket> customerTicketList;//该用户购买的所有ticket list
    
    public Customer(){
    }
    public Customer(String customerID,String name,int age,String gender){
        this.age=age;
        this.customerID=customerID;
        this.gender=gender;
        this.name=name;
        customerTicketList=new ArrayList<Ticket>();
        
    
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
