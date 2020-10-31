/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Customer.AssignCusToFlightList;
import Business.Customer.CustomeProfileList;
import Business.Customer.CustomerProfile;
import Business.Flight.FlightSchedule;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewCusProfilesJPanel extends javax.swing.JPanel {

    private JPanel cardSequence;
    private CustomeProfileList cusPros;
    private FlightSchedule flightSchedule;
    private AssignCusToFlightList assignList;
    public ViewCusProfilesJPanel(JPanel cardSequence,CustomeProfileList cusPros,FlightSchedule flightSchedule,AssignCusToFlightList assignList) {
        initComponents();
        this.cardSequence=cardSequence;
        this.cusPros=cusPros;
        this.flightSchedule= flightSchedule;
        this.assignList=assignList;
        populate(cusPros.getCustomerProfileList());
    }
    
    public void populate(ArrayList<CustomerProfile> l){
        DefaultTableModel dtm=(DefaultTableModel)tblCusPro.getModel();
        dtm.setRowCount(0);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        for(CustomerProfile cp:cusPros.getCustomerProfileList()){
            Object[] row=new Object[6];
            row[0]=cp;
            row[1]=cp.getCustomer().getPhone();
            row[2]=cp.getFrom().toString();
            row[3]=cp.getTo().toString();
            row[4]=sdf.format(cp.getDepartTime());
            row[5]=sdf.format(cp.getBackTime());
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCusPro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSearchFlights = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCusPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "From", "To", "Depart Time", "Back Time"
            }
        ));
        jScrollPane1.setViewportView(tblCusPro);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 620, 190));

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Customers' Travel Info ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        btnSearchFlights.setText("Search Flights");
        btnSearchFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightsActionPerformed(evt);
            }
        });
        add(btnSearchFlights, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightsActionPerformed
        int selectedRow=tblCusPro.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        else{
            CustomerProfile cp=(CustomerProfile)tblCusPro.getValueAt(selectedRow, 0);
            SearchFlightsJPanel jp=new SearchFlightsJPanel(cardSequence, flightSchedule,cp,assignList);
            cardSequence.add("SearchFlightsJPanel",jp);
            CardLayout l=(CardLayout)cardSequence.getLayout();
            l.next(cardSequence);
        }
        
    }//GEN-LAST:event_btnSearchFlightsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        cardSequence.remove(this);
        CardLayout layout=(CardLayout)cardSequence.getLayout();
        layout.previous(cardSequence);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchFlights;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCusPro;
    // End of variables declaration//GEN-END:variables
}
