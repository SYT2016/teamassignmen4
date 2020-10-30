/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;


import Business.Airliners.Airliner;
import Business.Airliners.AirlinerDirectory;
import Business.Airliners.AirlinerProfile;
import Business.Airliners.AirlinerProfileList;
import Business.Airplane.Airplane;
import Business.Flight.Flight;
import Util.Address;
import Business.Customer.AssignCusToFlightList;
import Business.Customer.CustomeProfileList;
import Business.Customer.CustomerDirectory;
import Business.Flight.FlightSchedule;


import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

/**
 *
 * @author admin
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    private CustomerDirectory customerDirectory;
    private CustomeProfileList cusPros;
    private FlightSchedule flightSchedule;
    private AssignCusToFlightList assignList;
    public TravelAgencyMain() {
        initComponents();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        CardSequenceJPanel = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCusIssues = new javax.swing.JButton();
        btnAirlinerIssue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(CardSequenceJPanel);

        jPanel.setLayout(new java.awt.CardLayout());

        btnCusIssues.setText("Customer Issues");
        btnCusIssues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusIssuesActionPerformed(evt);
            }
        });

        btnAirlinerIssue.setText("Airliner Issues");
        btnAirlinerIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlinerIssueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAirlinerIssue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCusIssues, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(btnAirlinerIssue)
                .addGap(118, 118, 118)
                .addComponent(btnCusIssues)
                .addContainerGap(618, Short.MAX_VALUE))
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



    private void btnCusIssuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusIssuesActionPerformed
        CusIssueWorkAreaJPanel jp = new CusIssueWorkAreaJPanel(this.CardSequenceJPanel, customerDirectory, cusPros, flightSchedule, assignList);
        this.CardSequenceJPanel.add("CusIssueWorkAreaJPanel", jp);
        CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
        layout.next(this.CardSequenceJPanel);
    }//GEN-LAST:event_btnCusIssuesActionPerformed

    private void btnAirlinerIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlinerIssueActionPerformed
        AirlinerIssueWorkAreaJPanel jp = new AirlinerIssueWorkAreaJPanel(this.CardSequenceJPanel);
        this.CardSequenceJPanel.add("AirlinerIssueWorkAreaJPanel", jp);
        CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
        layout.next(this.CardSequenceJPanel);
    }//GEN-LAST:event_btnAirlinerIssueActionPerformed


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
                initTest();
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    private static void initTest() {
        Airliner airliner = new Airliner("China", "China", "Beijing", "123");
        AirlinerDirectory.addAirliner(airliner);

        Airplane airplane = new Airplane("000001", "S", 1, 120);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2020, Calendar.OCTOBER, 30, 10, 20);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2020, Calendar.OCTOBER, 30, 13, 40);
        Flight flight = new Flight("CA8688",
                new Airliner("China", "China", "Beijing", "123"), airplane,
                calendar1.getTime(), calendar2.getTime(),
                new Address("China", "Shanghai"), new Address("China", "Shangzhi"));
        airliner.addFlight(flight);

        AirlinerProfileList.addAirlinerProfile(new AirlinerProfile(airliner, flight, airplane));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JButton btnAirlinerIssue;
    private javax.swing.JButton btnCusIssues;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables


    public JPanel getCardSequenceJPanel() {
        return CardSequenceJPanel;
    }
}
