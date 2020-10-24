/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author 16104
 */
public class CustomerDirectory {
    private ArrayList<Customer> Customerlist;
    
    public CustomerDirectory(){
        Customerlist=new ArrayList<Customer>();
    }
    
    public void deleteCustomer(Customer c){
        Customerlist.remove(c);
    }
    public Customer addCustomer(){
        Customer customer=new Customer();
        Customerlist.add(customer);
        
        return customer;
    
    }

    public ArrayList<Customer> getCustomerlist() {
        return Customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> Customerlist) {
        this.Customerlist = Customerlist;
    }
    
    
}
