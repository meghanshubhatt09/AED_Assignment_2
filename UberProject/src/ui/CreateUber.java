/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import io.github.pixee.security.ObjectInputFilters;
import java.io.EOFException;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import model.UberModel;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class CreateUber extends javax.swing.JPanel {

    /**
     * Creates new form CreateUber
     */
    
    UberModel car;   
    ArrayList<UberModel> ls;
    public CreateUber(UberModel car) {
        initComponents();
        this.car = car;
        ls = new ArrayList<UberModel>();
        populateArrayList();
    }
    




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDrivingLicense = new javax.swing.JTextField();
        lblTotalSeats = new javax.swing.JLabel();
        txtWarrantyYear = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblLicensePlate = new javax.swing.JLabel();
        lblEngineNo = new javax.swing.JLabel();
        lblCarPhoto = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblWarrantyYear = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblOwnerTelephoneNumber = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtEngineNo = new javax.swing.JTextField();
        btnSaveCar = new javax.swing.JButton();
        lblDrvingLicense = new javax.swing.JLabel();
        txtTotalSeats = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        lblCarAvailable = new javax.swing.JLabel();
        lblCarAvailable1 = new javax.swing.JLabel();
        lblWarrantyYear1 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblWarrantyYear2 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        checkBoxCA = new javax.swing.JCheckBox();
        checkBoxMA = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        txtDrivingLicense.setBackground(new java.awt.Color(204, 204, 204));
        txtDrivingLicense.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDrivingLicense.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblTotalSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTotalSeats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalSeats.setText("Total Seat's:");

        txtWarrantyYear.setBackground(new java.awt.Color(204, 204, 204));
        txtWarrantyYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWarrantyYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblColor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColor.setText("Color:");

        lblOwnerName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblOwnerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOwnerName.setText("Driver Name:");

        txtNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLicensePlate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLicensePlate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLicensePlate.setText("License Plate:");

        lblEngineNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEngineNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEngineNo.setText("Engine No.:");

        lblCarPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CarImage.png"))); // NOI18N

        txtOwnerName.setBackground(new java.awt.Color(204, 204, 204));
        txtOwnerName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOwnerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Please Enter Your Details ! :)");

        lblWarrantyYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWarrantyYear.setText("Warranty Year:");

        lblYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYear.setText("Manufacture Year:");

        lblOwnerTelephoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblOwnerTelephoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOwnerTelephoneNumber.setText("Driver Phone Number:");

        txtColor.setBackground(new java.awt.Color(204, 204, 204));
        txtColor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtBrand.setBackground(new java.awt.Color(204, 204, 204));
        txtBrand.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBrand.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtYear.setBackground(new java.awt.Color(204, 204, 204));
        txtYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblBrand.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrand.setText("Brand:");

        txtModel.setBackground(new java.awt.Color(204, 204, 204));
        txtModel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtModel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEngineNo.setBackground(new java.awt.Color(204, 204, 204));
        txtEngineNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEngineNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSaveCar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSaveCar.setText("Save !");
        btnSaveCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCarActionPerformed(evt);
            }
        });

        lblDrvingLicense.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDrvingLicense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDrvingLicense.setText("Driving License:");

        txtTotalSeats.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalSeats.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalSeats.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblModel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModel.setText("Model:");

        txtLicensePlate.setBackground(new java.awt.Color(204, 204, 204));
        txtLicensePlate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtLicensePlate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCarAvailable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCarAvailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarAvailable.setText("Car Available:");

        lblCarAvailable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCarAvailable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarAvailable1.setText("Expired Maintenance Certificate:");

        lblWarrantyYear1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWarrantyYear1.setText("City:");

        txtCity.setBackground(new java.awt.Color(204, 204, 204));
        txtCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblWarrantyYear2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWarrantyYear2.setText("Serial Number:");

        txtSerialNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtSerialNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSerialNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        checkBoxCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCarPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBrand)
                            .addComponent(lblColor)
                            .addComponent(lblModel)
                            .addComponent(lblYear)
                            .addComponent(lblTotalSeats)
                            .addComponent(lblEngineNo)))
                    .addComponent(lblLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEngineNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDrvingLicense)
                        .addGap(45, 45, 45)
                        .addComponent(txtDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWarrantyYear2)
                                .addGap(53, 53, 53)
                                .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWarrantyYear)
                                .addGap(52, 52, 52)
                                .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWarrantyYear1)
                                .addGap(112, 112, 112)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblCarAvailable)
                                .addGap(82, 82, 82)
                                .addComponent(checkBoxCA))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblOwnerName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblOwnerTelephoneNumber)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCarAvailable1)
                        .addGap(33, 33, 33)
                        .addComponent(checkBoxMA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(btnSaveCar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCarPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDrvingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWarrantyYear)
                            .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWarrantyYear2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWarrantyYear1)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxCA)
                            .addComponent(lblCarAvailable)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarAvailable1)
                    .addComponent(checkBoxMA))
                .addGap(22, 22, 22)
                .addComponent(btnSaveCar)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCarActionPerformed
        // TODO add your handling code here:
        // BRAND
        car = new UberModel();
        if (txtBrand.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Car Brand is Empty!");
            txtBrand.grabFocus();
            return;
            }
        else
           {
               car.setBrand(txtBrand.getText());
                       };
        //MODEL
        if (txtModel.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Car Model is Empty!");
                txtModel.grabFocus();
                return;
            }
        else
        {car.setModel(txtModel.getText());}
        

        // COLOR
        car.setColor(txtColor.getText());
        

// YEAR
        try{
            int year = Integer.parseInt(txtYear.getText());

            if (String.valueOf(year).length() != 4)
            {
                JOptionPane.showMessageDialog(this, "Input Valid Year !");
                txtYear.grabFocus();
                return;

            }

            car.setYear(year);
        }
        catch(NumberFormatException e)
        {JOptionPane.showMessageDialog(this, "Input Valid Year !");
            txtYear.grabFocus();
            return;
        }
        
      // ENGINE NO
        if (txtEngineNo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Car Engine Number is Empty!");
            txtEngineNo.grabFocus();
            return;
        }
        else
        {car.setEngineNo(txtEngineNo.getText());}

        // SEAT NO
       try{
            int seatNumber = Integer.parseInt(txtTotalSeats.getText());
            car.setSeatsNumber(seatNumber);
        }
        catch(NumberFormatException e)
        {JOptionPane.showMessageDialog(this, "Put proper Number in Total Seats !");
            txtTotalSeats.grabFocus();
            return;
        }


        
        
 // WARRANTY YEAR
        try{
            int WarrantyYear = Integer.parseInt(txtWarrantyYear.getText());

            if (String.valueOf(WarrantyYear).length() != 4)
            {
                JOptionPane.showMessageDialog(this, "Input Valid Warranty Year !");
                txtWarrantyYear.grabFocus();
                return;

            }

            car.setWarrantyYear(WarrantyYear);
        }
        catch(NumberFormatException e)
        {JOptionPane.showMessageDialog(this, "Input Valid Warranty Year !");
            txtWarrantyYear.grabFocus();
            return;
        }
        
        
        // OWNER NAME
        if (txtOwnerName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Owner Name is Empty!");
            txtOwnerName.grabFocus();
            return;
        }
        else
        {car.setOwnerName(txtOwnerName.getText());}

        //PHONE NUMBER
        
                try{
            long phoneNumber = Long.parseLong(txtNumber.getText());

            if (String.valueOf(phoneNumber).length() != 10)
            {
                JOptionPane.showMessageDialog(this, "Input Valid Telephone Number !");
                txtNumber.grabFocus();
                return;

            }
            
        
        for (int i = 0; i < ls.size(); i++)
        {
            long pattern = ls.get(i).getOwnerTelephoneNumbers();
               if(phoneNumber == pattern)
               {
                   JOptionPane.showMessageDialog(this, "This Phone Number is Already registered !");
                   return;
               }
               
     
        }

            car.setOwnerTelephoneNumbers(phoneNumber);
        }
        catch(NumberFormatException e)
        {JOptionPane.showMessageDialog(this, "Input Valid Telephone Number !");
            txtNumber.grabFocus();
            return;
        }



        // DRIVING LICENSE

        if (txtDrivingLicense.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Driving License Number is Empty!");
            txtDrivingLicense.grabFocus();
            return;
        }
        else
        {car.setOwnerDriverLicense(txtDrivingLicense.getText());}
        
        
        // LICENSE PLATE
        
        if (txtLicensePlate.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "License Plate Number is Empty!");
            txtLicensePlate.grabFocus();
            return;
        }
        else{  
            String LicensePlate = txtLicensePlate.getText();
            LicensePlate = LicensePlate.toLowerCase();
            for (int i = 0; i < ls.size(); i++)
            {
                String pattern = ls.get(i).getLicensePlates();
                pattern = pattern.toLowerCase();
                   if(LicensePlate.equals(pattern))
                   {
                       JOptionPane.showMessageDialog(this, "This License Plate is Already registered !");
                       return;
                   }


            }
            car.setLicensePlates(txtLicensePlate.getText());
        }
        

        // SERIAL NUMBER
        
        
        
        String serialNumber = txtSerialNumber.getText();        
        serialNumber = serialNumber.toLowerCase();
        if (serialNumber.length() >= 3)
        {
        for (int i = 0; i < ls.size(); i++)
        {
            String pattern = ls.get(i).getisSerialNumber();
            pattern = pattern.toLowerCase();
               if(serialNumber.equals(pattern))
               {
                   JOptionPane.showMessageDialog(this, "This Serial Number is Already registered !");
                   txtSerialNumber.grabFocus();
                   return;
               }
               
            
        }
        car.setisSerialNumber(txtSerialNumber.getText());
        
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid length serial Serial Number!");
            txtSerialNumber.grabFocus();
            return;
        }
        
        
        // CITY
        if (txtCity.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "City is Empty!");
            txtCity.grabFocus();
            return;
        }
        else
        {car.setisCity(txtCity.getText());}

        
        // CAR AVAILABLE ?
        if (checkBoxCA.isSelected())
        {car.setisAvailable(true);}
        else{car.setisAvailable(false);}
        
        if (checkBoxMA.isSelected())
        {car.setisMaintenanceCertificates(true);}
        else{car.setisMaintenanceCertificates(false);}
        

        

        
       
        ls.add(car);
        System.out.println(ls.toString());
        saveFile();
        
        
        //// AFTER ALL THE VALIDATION

        JOptionPane.showMessageDialog(this, "Car Information Saved !");


        


    }//GEN-LAST:event_btnSaveCarActionPerformed

    private void checkBoxCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxCAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveCar;
    private javax.swing.JCheckBox checkBoxCA;
    private javax.swing.JCheckBox checkBoxMA;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCarAvailable;
    private javax.swing.JLabel lblCarAvailable1;
    private javax.swing.JLabel lblCarPhoto;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDrvingLicense;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerTelephoneNumber;
    private javax.swing.JLabel lblTotalSeats;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblWarrantyYear1;
    private javax.swing.JLabel lblWarrantyYear2;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDrivingLicense;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtTotalSeats;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    public void populateArrayList() {
     
        try{
            FileInputStream file = new FileInputStream("ubercars.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            ObjectInputFilters.enableObjectFilterIfUnprotected(input);
            boolean endoffile = false;
            
            while (!endoffile){
                try
                {
                    ls.add((UberModel) input.readObject());
                }
                catch(EOFException e)
                {
                   endoffile = true;
                }
                catch(Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            input.close();
        
        }
        catch (IOException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
        
        
        
        
    }
    
    
    
    public void saveFile()
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("ubercars.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            
            for (int i = 0; i < ls.size(); i++)
            {
                oos.writeObject(ls.get(i));
                System.out.println(ls.get(i).getBrand());
                
            }
//            oos.writeObject(ls.get(0));
//            System.out.println(ls.get(0).getBrand());
//
//            oos.close();
            
        }
        catch(IOException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
        
        
    }
}
