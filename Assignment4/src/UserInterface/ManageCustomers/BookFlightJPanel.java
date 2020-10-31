/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Customer.AssignCusToFlight;
import Business.Customer.AssignCusToFlightList;
import Business.Customer.CustomerProfile;
import Business.Flight.Flight;
import Business.Travel.Seat;
import Business.Travel.Ticket;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class BookFlightJPanel extends javax.swing.JPanel {

    private JPanel cardSequence;
    private Flight flight;
    private CustomerProfile cusPro;
    private AssignCusToFlightList assignList;
    public BookFlightJPanel(JPanel cardSequence,Flight flight,CustomerProfile cusPro,AssignCusToFlightList assignList) {
        initComponents();
        this.cardSequence=cardSequence;
        this.flight=flight;
        this.cusPro=cusPro;
        this.assignList=assignList;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        txtAirlinerName.setText(flight.getAirliner().getName());
        txtDepartTime.setText(sdf.format(flight.getTakeOffTime()));
        txtDepartAirport.setText(flight.getTakeOffPlace().toString());
        txtArrivalTime.setText(sdf.format(flight.getLandingTime()));
        txtArrivalAirport.setText(flight.getLandingPlace().toString());
        txtNumOfSeats.setText(flight.getAvailSeats()+"");
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
        txtDepartAirport = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtArrivalTime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtArrivalAirport = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumOfSeats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAirlinerName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDepartTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        comboRow = new javax.swing.JComboBox<>();
        comboColumn = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Departion Airport:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        txtDepartAirport.setEnabled(false);
        add(txtDepartAirport, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 220, 30));

        jLabel2.setText("Arrival Time:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        txtArrivalTime.setEnabled(false);
        add(txtArrivalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 220, 30));

        jLabel3.setText("Arriavl Airport:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        txtArrivalAirport.setEnabled(false);
        add(txtArrivalAirport, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 220, 30));

        jLabel4.setText("Remain Seats:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        txtNumOfSeats.setEnabled(false);
        add(txtNumOfSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 220, 30));

        jLabel6.setText("Airliner Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        txtAirlinerName.setEnabled(false);
        add(txtAirlinerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 220, 30));

        jLabel7.setText("Departion Time:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        txtDepartTime.setEnabled(false);
        add(txtDepartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Book A Flight");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 240, 40));

        BtnBack.setText("<< Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        add(BtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel11.setText("Select Seat:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        comboRow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        add(comboRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        comboColumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A(WINDOW)", "B(MIDDLE)", "C(AISLE)", "D(AISLE)", "E(MIDDLE)", "F(WINDOW)" }));
        add(comboColumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        cardSequence.remove(this);
        Component[] components=cardSequence.getComponents();
        Component c=components[components.length-1];
        SearchFlightsJPanel jp=(SearchFlightsJPanel)c;
        jp.populate(jp.getFlightSche().getFlightList());
        CardLayout layout=(CardLayout)cardSequence.getLayout();
        layout.previous(cardSequence);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       //座位行列
        int row=comboRow.getSelectedIndex()+1;
        String seatNo=comboColumn.getSelectedItem().toString().substring(0,1);//ABCDEF
        String column=comboColumn.getSelectedItem().toString().substring(1);//WINDOW,MIDDLE,AISLE
        
        if(flight.checkSeatCondition(row,seatNo)){
            flight.changeSeatCondition(row, seatNo);
            int before=flight.getRemainAvailSeat();
            flight.setRemainAvailSeat(before-1);
            Seat seat=new Seat(row,column,seatNo);
            seat.setIsOccupy(true);
            Ticket ticket=new Ticket(seat,flight);
            AssignCusToFlight cusToFli=new AssignCusToFlight(cusPro,flight,ticket);
            assignList.addIn(cusToFli);
            cusPro.setIsBookFlight(true);      
            JOptionPane.showMessageDialog(null, "Book A Flight Successfully");
        }else{
            JOptionPane.showMessageDialog(null, "The seat has been occupied. Please select another one");
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboColumn;
    private javax.swing.JComboBox<String> comboRow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtArrivalAirport;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtDepartAirport;
    private javax.swing.JTextField txtDepartTime;
    private javax.swing.JTextField txtNumOfSeats;
    // End of variables declaration//GEN-END:variables
}
