/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
//游客的所有行程
public class CustomeProfileList {
    private ArrayList<CustomerProfile> customerProfileList;

    public ArrayList<CustomerProfile> getCustomerProfileList() {
        return customerProfileList;
    }

    public void setCustomerProfileList(ArrayList<CustomerProfile> customerProfileList) {
        this.customerProfileList = customerProfileList;
    }
    
}
