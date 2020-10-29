/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Flight.Flight;
import Business.Travel.Ticket;

/**
 *
 * @author admin
 */
public class AssignCusToFlight {
    private CustomerProfile cusPro;
    private Flight flight;
    private Ticket ticket;

    public AssignCusToFlight(){
        
    }
    
    public AssignCusToFlight(CustomerProfile cusPro, Flight flight, Ticket ticket) {
        this.cusPro=cusPro;
        this.flight=flight;
        this.ticket=ticket;
    }

    public CustomerProfile getCusPro() {
        return cusPro;
    }

    public void setCusPro(CustomerProfile cusPro) {
        this.cusPro = cusPro;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    
    
}
