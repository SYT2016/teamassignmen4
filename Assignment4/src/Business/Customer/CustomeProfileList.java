/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Util.Address;
import Util.DateUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
//游客的所有行程
public class CustomeProfileList {
    private CustomerDirectory customerList;
    private ArrayList<CustomerProfile> customerProfileList;
    public CustomeProfileList(CustomerDirectory customerList){
        this.customerList=customerList;
        customerProfileList=new ArrayList<>();       
        for(int i=0;i<5;i++){
            CustomerProfile cp;
            try {
                cp=new CustomerProfile(customerList.getCustomerlist().get(i),new Address("US","NY"),new Address("US","Seattle"),DateUtil.strToDate("2020-10-30"),DateUtil.strToDate("2020-11-4"));
                customerProfileList.add(cp);
            } catch (ParseException ex) {
                Logger.getLogger(CustomeProfileList.class.getName()).log(Level.SEVERE, null, ex);
            }          
        }
    }

    public ArrayList<CustomerProfile> getCustomerProfileList() {
        return customerProfileList;
    }

    public void setCustomerProfileList(ArrayList<CustomerProfile> customerProfileList) {
        this.customerProfileList = customerProfileList;
    }
    
    public ArrayList<CustomerProfile> getNotBookList(){
        ArrayList<CustomerProfile> l=new ArrayList<>();
        for(CustomerProfile cp:customerProfileList){
            if(!cp.getIsBookFlight()) l.add(cp);
        }
        return l;
    }
    
    public CustomerProfile addCusPro(){
        CustomerProfile cp=new CustomerProfile();
        customerProfileList.add(cp);
        return cp;
    }
    
    //找到所有未登记行程的游客
    public ArrayList<Customer> getCusWithoutProfile(){
        ArrayList<Customer> l=new ArrayList<>();
        for(Customer c:customerList.getCustomerlist()){
            if(!customerProfileList.contains(c)){
                l.add(c);
            }
        }
        return l;
    }
    
}
