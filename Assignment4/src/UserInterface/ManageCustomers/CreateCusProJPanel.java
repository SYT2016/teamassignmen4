/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Customer.CustomeProfileList;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Customer.CustomerProfile;
import Business.Flight.FlightSchedule;
import Util.Address;
import Util.DateUtil;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CreateCusProJPanel extends javax.swing.JPanel {

    private JPanel cardSequence;
    private CustomerDirectory customerDirectory;
    private CustomeProfileList cusPros;
    public CreateCusProJPanel(JPanel cardSequence,CustomerDirectory customerDirectory,CustomeProfileList cusPros) {
        initComponents();
        this.cardSequence=cardSequence;
        this.customerDirectory=customerDirectory;
        this.cusPros=cusPros;
        populate(cusPros.getCusWithoutProfile());
    }
    
    public void populate(ArrayList<Customer> l){
        DefaultTableModel dtm=(DefaultTableModel)tblCus.getModel();
        dtm.setRowCount(0);
        for(Customer c:l){
            Object[] row=new Object[4];
            row[0]=c;
            row[1]=c.getAge()+"";
            row[2]=c.getGender();
            row[3]=c.getPhone()+"";
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
        tblCus = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDepartCountry = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtToCountry = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDepartDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBackDate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtDepartCity = new javax.swing.JTextField();
        txtToCity = new javax.swing.JTextField();

        tblCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCus);
        if (tblCus.getColumnModel().getColumnCount() > 0) {
            tblCus.getColumnModel().getColumn(0).setResizable(false);
            tblCus.getColumnModel().getColumn(1).setResizable(false);
            tblCus.getColumnModel().getColumn(2).setResizable(false);
            tblCus.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("From:");

        jLabel4.setText("To:");

        jLabel1.setText("Depart Date:");

        jLabel2.setText("Back Date:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtToCountry, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDepartCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDepartCity, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(txtToCity)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDepartDate)
                                        .addComponent(txtBackDate, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDepartCity)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDepartCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtToCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtToCity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtDepartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBackDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        cardSequence.remove(this);
        CardLayout layout=(CardLayout)cardSequence.getLayout();
        layout.previous(cardSequence);
    }//GEN-LAST:event_btnBackActionPerformed

    public boolean check(){
        if(txtDepartCountry.getText().equals("")||txtDepartCity.getText().equals("")||
                txtToCountry.getText().equals("")||txtToCity.getText().equals("")||
                txtDepartDate.getText().equals("")||txtBackDate.getText().equals("")){
            return false;
        }
        return true;
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(tblCus.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Please select a customer");
        }
        else{
            if(check()){
                CustomerProfile cp=cusPros.addCusPro();
                cp.setCustomer((Customer)tblCus.getValueAt(tblCus.getSelectedRow(), 0));      
                cp.setFrom(new Address(txtDepartCountry.getText(),txtDepartCity.getText()));
                cp.setTo(new Address(txtToCountry.getText(),txtToCity.getText()));
                cp.setIsBookFlight(false);
                try {
                    cp.setDepartTime(DateUtil.strToDate(txtDepartDate.getText()));
                    cp.setBackTime(DateUtil.strToDate(txtBackDate.getText()));
                } catch (ParseException ex) {
                    Logger.getLogger(CreateCusProJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }       
                JOptionPane.showMessageDialog(null, "Save Successfully!");
                populate(cusPros.getCusWithoutProfile());
            }else{
                JOptionPane.showMessageDialog(null, "Please fill in all blanks.");
            }          
        }       
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCus;
    private javax.swing.JTextField txtBackDate;
    private javax.swing.JTextField txtDepartCity;
    private javax.swing.JTextField txtDepartCountry;
    private javax.swing.JTextField txtDepartDate;
    private javax.swing.JTextField txtToCity;
    private javax.swing.JTextField txtToCountry;
    // End of variables declaration//GEN-END:variables
}
