/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Customer.AssignCusToFlightList;
import Business.Customer.CustomeProfileList;
import Business.Customer.CustomerDirectory;
import Business.Flight.FlightSchedule;
import UserInterface.ManageCustomers.CreateCusProJPanel;
import UserInterface.ManageCustomers.CreateNewCustomerJpanel;
import UserInterface.ManageCustomers.ViewCusProfilesJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CusIssueWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel cardSequence;
    private CustomerDirectory customerDirectory;
    private CustomeProfileList cusPros;
    private FlightSchedule flightSchedule;
    private AssignCusToFlightList assignList;
    public CusIssueWorkAreaJPanel(JPanel cardSequence,CustomerDirectory customerDirectory,CustomeProfileList cusPros,FlightSchedule flightSchedule,AssignCusToFlightList assignList) {
        initComponents();
        this.cardSequence=cardSequence;
        this.customerDirectory=new CustomerDirectory();
        this.flightSchedule=new FlightSchedule();
        this.cusPros=new CustomeProfileList(this.customerDirectory);
        this.assignList=new AssignCusToFlightList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddCus = new javax.swing.JButton();
        btnManageCus = new javax.swing.JButton();
        btnCreateCusPro = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddCus.setText("Create Customer");
        btnAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCusActionPerformed(evt);
            }
        });
        add(btnAddCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 180, -1));

        btnManageCus.setText("Manager Customers");
        btnManageCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCusActionPerformed(evt);
            }
        });
        add(btnManageCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, 30));

        btnCreateCusPro.setText("Create Cus Profile");
        btnCreateCusPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCusProActionPerformed(evt);
            }
        });
        add(btnCreateCusPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCusActionPerformed
        CreateNewCustomerJpanel createCustomerJPanel = new CreateNewCustomerJpanel(cardSequence,customerDirectory);
        cardSequence.add("CreateNewCustomerJPanel", createCustomerJPanel);
        CardLayout layout = (CardLayout) cardSequence.getLayout();
        layout.next(cardSequence);
    }//GEN-LAST:event_btnAddCusActionPerformed

    private void btnManageCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCusActionPerformed
        ViewCusProfilesJPanel jp=new ViewCusProfilesJPanel(cardSequence, cusPros, flightSchedule,assignList);
        cardSequence.add("ViewCusProfilesJPanel",jp);
        CardLayout l=(CardLayout)cardSequence.getLayout();
        l.next(cardSequence);
    }//GEN-LAST:event_btnManageCusActionPerformed

    private void btnCreateCusProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCusProActionPerformed
        CreateCusProJPanel jp=new CreateCusProJPanel(cardSequence,customerDirectory, cusPros);
        cardSequence.add("CreateCusProJPanel",jp);
        CardLayout l=(CardLayout)cardSequence.getLayout();
        l.next(cardSequence);
    }//GEN-LAST:event_btnCreateCusProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCus;
    private javax.swing.JButton btnCreateCusPro;
    private javax.swing.JButton btnManageCus;
    // End of variables declaration//GEN-END:variables
}
