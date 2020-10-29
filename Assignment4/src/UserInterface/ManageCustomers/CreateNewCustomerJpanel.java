/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CreateNewCustomerJpanel extends javax.swing.JPanel {

    private CustomerDirectory customerDirectory;
    private JPanel cardSequence;
    public CreateNewCustomerJpanel(JPanel cardSequence) {
        initComponents();
        this.cardSequence=cardSequence;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Age:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 210, 30));

        jLabel3.setText("Gender:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 210, 30));

        jLabel4.setText("ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 210, 30));

        jLabel5.setText("Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        radioBtnMale.setText("Male");
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });
        add(radioBtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        radioBtnFemale.setText("Female");
        add(radioBtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setText("Phone:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Customer c=customerDirectory.addCustomer();
        c.setName(txtName.getText());
        c.setAge(Integer.parseInt(txtAge.getText()));
        c.setCustomerID(txtID.getText());
        if(radioBtnMale.isSelected()) c.setGender(radioBtnMale.getText());
        else c.setGender(radioBtnFemale.getText());
        c.setPhone(txtPhone.getText());
        JOptionPane.showMessageDialog(null, "Save Successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        cardSequence.remove(this);
        CardLayout layout=(CardLayout)cardSequence.getLayout();
        layout.previous(cardSequence);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
