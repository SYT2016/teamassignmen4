/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;


import Business.Customer.CustomeProfileList;
import Business.Customer.CustomerDirectory;
import Business.Flight.FlightSchedule;
import UserInterface.ManageCustomers.CreateNewCustomerJpanel;
import UserInterface.ManageCustomers.ViewCusProfilesJPanel;
import UserInterface.ManagerAirliners.CreateAirlinerJPanel;
import UserInterface.ManagerAirliners.ManageAirlinersJPanel;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author admin
 */
public class TravelAgencyMain extends javax.swing.JFrame {


    private CustomerDirectory customerDirectory;
    private JPanel cardSequence;
    private CustomeProfileList cusPros;
    private FlightSchedule flightSchedule;
    public TravelAgencyMain() {
        initComponents();
        this.customerDirectory=new CustomerDirectory();
        this.cardSequence=cardSequence;
        this.flightSchedule=flightSchedule;
        this.cusPros=cusPros;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();

        CardSequenceJPanel = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnAddAirliner = new javax.swing.JButton();
        btnManageAirliner = new javax.swing.JButton();
        btnAddCus = new javax.swing.JButton();
        btnManageCus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(CardSequenceJPanel);

        jPanel.setLayout(new java.awt.CardLayout());

        btnAddAirliner.setText("Create Airliner");
        btnAddAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAirlinerActionPerformed(evt);
            }
        });

        btnManageAirliner.setText("Manager Airliners");
        btnManageAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAirlinerActionPerformed(evt);
            }
        });

        btnAddCus.setText("Create Customer");
        btnAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCusActionPerformed(evt);
            }
        });

        btnManageCus.setText("Manager Customers");
        btnManageCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCusActionPerformed(evt);


            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)

                .addComponent(btnAddAirliner)
                .addGap(32, 32, 32)
                .addComponent(btnManageAirliner)
                .addGap(39, 39, 39)
                .addComponent(btnAddCus)
                .addGap(39, 39, 39)
                .addComponent(btnManageCus)
                .addContainerGap(266, Short.MAX_VALUE))

        );

        jPanel.add(jPanel1, "card2");

        jSplitPane1.setLeftComponent(jPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAddAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAirlinerActionPerformed
        CreateAirlinerJPanel createAirlinerJPanel = new CreateAirlinerJPanel(this.CardSequenceJPanel);
        this.CardSequenceJPanel.add("CreateAirlinerJPanel", createAirlinerJPanel);
        CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
        layout.next(this.CardSequenceJPanel);
    }//GEN-LAST:event_btnAddAirlinerActionPerformed

    private void btnManageAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAirlinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageAirlinerActionPerformed

    private void btnAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCusActionPerformed
        CreateNewCustomerJpanel createCustomerJPanel = new CreateNewCustomerJpanel(CardSequenceJPanel);
        this.CardSequenceJPanel.add("CreateNewCustomerJPanel", createCustomerJPanel);
        CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
        layout.next(this.CardSequenceJPanel);
    }//GEN-LAST:event_btnAddCusActionPerformed

    private void btnManageCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCusActionPerformed
        ViewCusProfilesJPanel jp=new ViewCusProfilesJPanel(cardSequence, cusPros, flightSchedule);
        cardSequence.add("ViewCusProfilesJPanel",jp);
        CardLayout l=(CardLayout)cardSequence.getLayout();
        l.next(cardSequence);
    }//GEN-LAST:event_btnManageCusActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JButton btnAddAirliner;
    private javax.swing.JButton btnAddCus;
    private javax.swing.JButton btnManageAirliner;
    private javax.swing.JButton btnManageCus;

    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables


    public JPanel getCardSequenceJPanel() {

        return CardSequenceJPanel;

    }
}
