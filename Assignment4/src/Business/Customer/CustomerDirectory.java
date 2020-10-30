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
        Customer c1=new Customer("001","Lee",20,"Female","1111111");
        Customer c2=new Customer("002","Lu",21,"Male","1111112");
        Customer c3=new Customer("003","Liu",22,"Female","1111113");
        Customer c4=new Customer("004","Su",23,"Male","1111114");
        Customer c5=new Customer("005","Zhang",24,"Female","1111115");
        Customer c6=new Customer("006","Wang",25,"Male","1111116");
        Customer c7=new Customer("007","Sun",26,"Female","1111117");
        Customerlist.add(c1);Customerlist.add(c2);Customerlist.add(c3);Customerlist.add(c4);Customerlist.add(c5);Customerlist.add(c6);Customerlist.add(c7);
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
