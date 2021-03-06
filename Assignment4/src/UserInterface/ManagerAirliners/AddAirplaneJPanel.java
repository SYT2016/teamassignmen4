/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagerAirliners;

import Business.Airliners.Airliner;
import Business.Airliners.AirlinerDirectory;
import Business.Airliners.AirlinerProfile;
import Business.Airliners.AirlinerProfileList;
import Business.Airplane.Airplane;
import Business.Flight.Flight;
import Util.Address;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author wangcong
 */
public class AddAirplaneJPanel extends JPanel {

    private  JPanel cardSequenceJPanel;

    private final Airliner airliner;

    /**
     * Creates new form AddAirplaneJPanel
     */
    public AddAirplaneJPanel(JPanel cardSequenceJPanel, Airliner airliner) {
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.airliner = airliner;
        initComponents();
        datePickerLanding.setLocale(Locale.US);
        datePickerTakeOff.setLocale(Locale.US);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        lblAirplaneId = new javax.swing.JLabel();
        txtAirPlaneId = new javax.swing.JTextField();
        lblAirplaneModel = new javax.swing.JLabel();
        lblAirplaneAge = new javax.swing.JLabel();
        txtAirPlaneAge = new javax.swing.JTextField();
        lblAirplaneSeats = new javax.swing.JLabel();
        txtAirPlaneSeats = new javax.swing.JTextField();
        comboBoxAirplaneModel = new javax.swing.JComboBox<>();
        btnAddPlane = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datePickerTakeOff = new com.eltima.components.ui.DatePicker();
        txtFlightNumber = new javax.swing.JTextField();
        txtTakeOffCountry = new javax.swing.JTextField();
        txtTakeOffHour = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTakeOffMin = new javax.swing.JTextField();
        lblLandingTime = new javax.swing.JLabel();
        datePickerLanding = new com.eltima.components.ui.DatePicker();
        txtLandingHour = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtLandingMin = new javax.swing.JTextField();
        txtTakeOffCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAirliner = new javax.swing.JTextField();
        txtLandingCountry = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLandingCity = new javax.swing.JTextField();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Add Your Flight");

        lblAirplaneId.setText("Airplane ID:");

        lblAirplaneModel.setText("Airplane Model:");

        lblAirplaneAge.setText("Airplane Age:");

        lblAirplaneSeats.setText("Airplane Seats:");

        comboBoxAirplaneModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L" }));

        btnAddPlane.setText("Add Plane");
        btnAddPlane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPlaneMouseClicked(evt);
            }
        });
        btnAddPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlaneActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Take Off Country:");

        jLabel3.setText("Take Off City:");

        jLabel4.setText("Flight Number:");

        jLabel5.setText("Take off time:");

        datePickerTakeOff.setPreferredSize(new java.awt.Dimension(160, 30));

        txtFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightNumberActionPerformed(evt);
            }
        });

        txtTakeOffHour.setPreferredSize(new java.awt.Dimension(30, 30));
        txtTakeOffHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTakeOffHourActionPerformed(evt);
            }
        });

        jLabel6.setText(":");

        txtTakeOffMin.setPreferredSize(new java.awt.Dimension(30, 30));

        lblLandingTime.setText("Landing Time:");

        datePickerLanding.setPreferredSize(new java.awt.Dimension(160, 30));

        txtLandingHour.setPreferredSize(new java.awt.Dimension(30, 30));
        txtLandingHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLandingHourActionPerformed(evt);
            }
        });

        jLabel26.setText(":");

        txtLandingMin.setPreferredSize(new java.awt.Dimension(30, 30));
        txtLandingMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLandingMinActionPerformed(evt);
            }
        });

        jLabel7.setText("Airliner:");

        txtAirliner.setText(airliner.getName());
        txtAirliner.setEditable(false);

        jLabel8.setText("Landing City:");

        jLabel9.setText("Landing Country:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnBack)
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddPlane))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAirplaneModel)
                                    .addComponent(lblAirplaneId)))
                            .addComponent(lblAirplaneSeats)
                            .addComponent(lblAirplaneAge)
                            .addComponent(jLabel5)
                            .addComponent(lblLandingTime))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAirPlaneId)
                                .addComponent(comboBoxAirplaneModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAirPlaneAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAirPlaneSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(datePickerTakeOff, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(datePickerLanding, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtTakeOffHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtLandingHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTakeOffMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLandingMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtTakeOffCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTakeOffCountry, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLandingCity)
                                    .addComponent(txtLandingCountry)
                                    .addComponent(txtAirliner))))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAirplaneId)
                                .addGap(122, 122, 122)
                                .addComponent(lblAirplaneSeats)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datePickerTakeOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datePickerLanding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLandingTime)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(txtAirPlaneSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(164, 164, 164)
                        .addComponent(btnAddPlane))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAirPlaneId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTakeOffCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxAirplaneModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAirplaneModel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTakeOffCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAirPlaneAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAirplaneAge))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtLandingCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtLandingCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTakeOffMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTakeOffHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtLandingMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLandingHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightNumberActionPerformed

    private void txtTakeOffHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTakeOffHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTakeOffHourActionPerformed

    private void txtLandingHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLandingHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLandingHourActionPerformed

    private void btnAddPlaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPlaneMouseClicked
        String planeId = getPlaneId();
        if (planeId == null) {
            return;
        }
        String planeModel = String.valueOf(comboBoxAirplaneModel.getSelectedItem());
        int planeAge = getPlaneAge();
        if (planeAge < 0) {
            return;
        }
        int planeSeats = getPlaneSeats();
        if (planeSeats < 0) {
            return;
        }
        // Take off time
        Calendar takeOffTime = getTakeOffDate();
        if (takeOffTime == null) {
            return;
        }
        int takeOffHour = getTakeOffHour();
        if (takeOffHour < 0) {
            return;
        }
        takeOffTime.set(Calendar.HOUR_OF_DAY, takeOffHour);
        int takeOffMin = getTakeOffMin();
        if (takeOffMin < 0) {
            return;
        }
        takeOffTime.set(Calendar.MINUTE, takeOffMin);
        // Landing time
        Calendar landingTime = getLandingDate();
        if (landingTime == null) {
            return;
        }
        int landingHour = getLandingHour();
        if (landingHour < 0) {
            return;
        }
        landingTime.set(Calendar.HOUR_OF_DAY, landingHour);
        int landingMin = getLandingMin();
        if (landingMin < 0) {
            return;
        }
        landingTime.set(Calendar.MINUTE, landingMin);
        if (landingTime.compareTo(takeOffTime) <= 0) {
            JOptionPane.showMessageDialog(this, "Landing time must be later than take off time!","Error", JOptionPane.ERROR_MESSAGE) ;
            return;
        }
        String flightNumber = getFlightNumber();
        if (flightNumber == null) {
            return;
        }
        String takeOffCountry = getTakeOffCountry();
        if (takeOffCountry == null) {
            return;
        }
        String takeOffCity = getTakeOffCity();
        if (takeOffCity == null) {
            return;
        }
        Address takeOffAdd = new Address(takeOffCountry, takeOffCity);
        String landingCountry = getLandingCountry();
        if (landingCountry == null) {
            return;
        }
        String landingCity = getLandingCity();
        if (landingCity == null) {
            return;
        }
        Address landingAdd = new Address(landingCountry, landingCity);

        Airplane airplane = new Airplane(planeId, planeModel, planeAge, planeSeats);
        Flight flight = new Flight(flightNumber, airliner, airplane, takeOffTime.getTime(), landingTime.getTime(), takeOffAdd, landingAdd);
        airplane.setFlight(flight);
        airliner.addFlight(flight);

        AirlinerDirectory.addAirliner(airliner);
        AirlinerProfileList.addAirlinerProfile(new AirlinerProfile(airliner, flight, airplane));
        //airliner1.addFlight(flight13);
        //AirlinerProfileList.addAirlinerProfile(new AirlinerProfile(airliner1, flight13, airplane1));
        cardSequenceJPanel.remove(this);
        Component[] components=cardSequenceJPanel.getComponents();
        Component c=components[components.length-1];
        ManageAirlinersJPanel m=(ManageAirlinersJPanel)c;
        m.refreshTable(airliner);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
        
        //ManageAirlinersJPanel.show(this.cardSequenceJPanel, this.airliner);
    }//GEN-LAST:event_btnAddPlaneMouseClicked

    private void txtLandingMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLandingMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLandingMinActionPerformed

    private static Calendar getToday() {
        Calendar today = Calendar.getInstance();
        Calendar cal=Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        today.set(year, month, day, 0, 0, 0);
        return today;
    }

    private int compareCalendar(Calendar cal1, Calendar cal2) {
        int year1 = cal1.get(Calendar.YEAR);
        int month1 = cal1.get(Calendar.MONTH);
        int day1 = cal1.get(Calendar.DATE);
        int year2 = cal2.get(Calendar.YEAR);
        int month2 = cal2.get(Calendar.MONTH);
        int day2 = cal2.get(Calendar.DATE);
        if (year1 > year2) {
            return 1;
        }
        if (year1 < year2) {
            return -1;
        }
        if (month1 > month2) {
            return 1;
        }
        if (month1 < month2) {
            return -1;
        }
        return Integer.compare(day1, day2);
    }

    private Calendar getTakeOffDate() {
        Date takeOffDate = (Date) datePickerTakeOff.getValue();
        if (takeOffDate == null) {
            JOptionPane.showMessageDialog(this , "Please select take off date!" ,"Error" , JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Calendar takeOffDateCal = Calendar.getInstance();
        takeOffDateCal.setTime(takeOffDate);
        if (compareCalendar(takeOffDateCal, getToday()) < 0) {
            JOptionPane.showMessageDialog(this , "Take off date should not be earlier than today!" ,"Error" , JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return takeOffDateCal;
    }

    private int getTakeOffHour() {
        if (StringUtils.isBlank(txtTakeOffHour.getText())) {
            JOptionPane.showMessageDialog(this, "Please input take off hour!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        try {
            int takeOffHourValue = Integer.parseInt(txtTakeOffHour.getText());
            if (takeOffHourValue < 0 || takeOffHourValue > 23) {
                JOptionPane.showMessageDialog(this, "Take off hour must be in [0, 23]!","Error", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
            return takeOffHourValue;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Take off hour must be a integer!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    private int getTakeOffMin() {
        if (StringUtils.isBlank(txtTakeOffMin.getText())) {
            JOptionPane.showMessageDialog(this, "Please input take off minute!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        try {
            int takeOffMinValue = Integer.parseInt(txtTakeOffMin.getText());
            if (takeOffMinValue < 0 || takeOffMinValue > 59) {
                JOptionPane.showMessageDialog(this, "Take off minute must be in [0, 59]!","Error", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
            return takeOffMinValue;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Take off minute must be a integer!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }
    private Calendar getLandingDate() {
        Date landingDate = (Date) datePickerLanding.getValue();
        if (landingDate == null) {
            JOptionPane.showMessageDialog(this , "Please select landing date!" ,"Error" , JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(landingDate);
        if (compareCalendar(calendar, getToday()) < 0) {
            JOptionPane.showMessageDialog(this , "Landing date should not be earlier than today!" ,"Error" , JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return calendar;
    }

    private int getLandingHour() {
        if (StringUtils.isBlank(txtLandingHour.getText())) {
            JOptionPane.showMessageDialog(this, "Please input landing hour!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        try {
            int landingHourValue = Integer.parseInt(txtLandingHour.getText());
            if (landingHourValue < 0 || landingHourValue > 23) {
                JOptionPane.showMessageDialog(this, "landing hour must be in [0, 23]!","Error", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
            return landingHourValue;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Landing hour must be a integer!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    private int getLandingMin() {
        if (StringUtils.isBlank(txtLandingMin.getText())) {
            JOptionPane.showMessageDialog(this, "Please input landing minute!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        try {
            int landingMinValue = Integer.parseInt(txtLandingMin.getText());
            if (landingMinValue < 0 || landingMinValue > 59) {
                JOptionPane.showMessageDialog(this, "landing minute must be in [0, 59]!","Error", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
            return landingMinValue;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Landing minute must be a integer!","Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    private String getPlaneId() {
        String planeId = txtAirPlaneId.getText();
        if (StringUtils.isBlank(planeId)) {
            JOptionPane.showMessageDialog(this, "Please input plane id!","Error", JOptionPane.ERROR_MESSAGE) ;
            return null;
        }
        return planeId;
    }

    private String getFlightNumber() {
        String flightNumber = txtFlightNumber.getText();
        if (StringUtils.isBlank(flightNumber)) {
            JOptionPane.showMessageDialog(this, "Please input flight number!","Error", JOptionPane.ERROR_MESSAGE) ;
            return null;
        }
        return flightNumber;
    }

    private String getTakeOffCountry() {
        String takeOffCountry = this.txtTakeOffCountry.getText();
        if (StringUtils.isBlank(takeOffCountry)) {
            JOptionPane.showMessageDialog(this, "Please input take off country","Error", JOptionPane.ERROR_MESSAGE) ;
            return null;
        }
        return takeOffCountry;
    }

    private String getTakeOffCity() {
        String takeOffCity = txtTakeOffCity.getText();
        if (StringUtils.isBlank(takeOffCity)) {
            JOptionPane.showMessageDialog(this, "Please input take off city","Error", JOptionPane.ERROR_MESSAGE) ;
            return null;
        }
        return takeOffCity;
    }

    private String getLandingCountry() {
        String landingCountry = txtLandingCountry.getText();
        if (StringUtils.isBlank(landingCountry)) {
            JOptionPane.showMessageDialog(this, "Please input landing country","Error", JOptionPane.ERROR_MESSAGE) ;
            return null;
        }
        return landingCountry;
    }

    private String getLandingCity() {
        String landingCity = txtLandingCity.getText();
        if (StringUtils.isBlank(landingCity)) {
            JOptionPane.showMessageDialog(this, "Please input landing city","Error", JOptionPane.ERROR_MESSAGE) ;
            return null;
        }
        return landingCity;
    }

    private int getPlaneAge() {
        if (StringUtils.isBlank(txtAirPlaneAge.getText())) {
            JOptionPane.showMessageDialog(this, "Please input plane age!","Error", JOptionPane.ERROR_MESSAGE) ;
            return -1;
        }
        try {
            int planeAge = Integer.parseInt(txtAirPlaneAge.getText());
            if (planeAge < 0) {
                JOptionPane.showMessageDialog(this , "Plane age must be a nonnegative number!" ,"Error" , JOptionPane.ERROR_MESSAGE);
                return -1;
            }
            return planeAge;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this , "Plane age must be a integer!" ,"Error" , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    private int getPlaneSeats() {
        if (StringUtils.isBlank(txtAirPlaneSeats.getText())) {
            JOptionPane.showMessageDialog(this , "Please input plane seats!" ,"Error" , JOptionPane.ERROR_MESSAGE) ;
            return -1;
        }
        try {
            int planeSeats = Integer.parseInt(txtAirPlaneSeats.getText());
            if (planeSeats <= 0) {
                JOptionPane.showMessageDialog(this , "Plane seats must be a positive number!" ,"Error" , JOptionPane.ERROR_MESSAGE);
                return -1;
            }
            if (planeSeats % 6 != 0) {
                JOptionPane.showMessageDialog(this , "Plane seats must be multiple of 6!" ,"Error" , JOptionPane.ERROR_MESSAGE);
                return -1;
            }
            return planeSeats;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this , "Plane seats must be a integer!" ,"Error" , JOptionPane.ERROR_MESSAGE) ;
            return -1;
        }
    }

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
       // cardSequenceJPanel.remove(this);
       // Component[] componentArray = cardSequenceJPanel.getComponents();
       // Component component = componentArray[componentArray.length - 1];
       // ManageAirlinersJPanel manageProductCatalogJPanel = (ManageAirlinersJPanel) component;
        //manageProductCatalogJPanel.refreshTable(airliner);
       // CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
       // layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnAddPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPlaneActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         cardSequenceJPanel.remove(this);
        Component[] componentArray = cardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersJPanel manageProductCatalogJPanel = (ManageAirlinersJPanel) component;
        manageProductCatalogJPanel.refreshTable(airliner);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlane;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> comboBoxAirplaneModel;
    private com.eltima.components.ui.DatePicker datePickerLanding;
    private com.eltima.components.ui.DatePicker datePickerTakeOff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAirplaneAge;
    private javax.swing.JLabel lblAirplaneId;
    private javax.swing.JLabel lblAirplaneModel;
    private javax.swing.JLabel lblAirplaneSeats;
    private javax.swing.JLabel lblLandingTime;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JTextField txtAirPlaneAge;
    private javax.swing.JTextField txtAirPlaneId;
    private javax.swing.JTextField txtAirPlaneSeats;
    private javax.swing.JTextField txtAirliner;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtLandingCity;
    private javax.swing.JTextField txtLandingCountry;
    private javax.swing.JTextField txtLandingHour;
    private javax.swing.JTextField txtLandingMin;
    private javax.swing.JTextField txtTakeOffCity;
    private javax.swing.JTextField txtTakeOffCountry;
    private javax.swing.JTextField txtTakeOffHour;
    private javax.swing.JTextField txtTakeOffMin;
    // End of variables declaration//GEN-END:variables
}
