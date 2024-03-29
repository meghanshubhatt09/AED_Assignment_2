/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UberModel;

/**
 *
 * @author meghanshubhatt
 */
public class SearchUber extends javax.swing.JPanel {

    /**
     * Creates new form SearchUber
     */
    ArrayList<UberModel> ls;
    
    public SearchUber() throws IOException {
        initComponents();
        ls = new ArrayList<UberModel>();
        ReadFile();
        ReadUpdtTimeFile();
        
        
        
        
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
        lblWelcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboboxSearch = new javax.swing.JComboBox<>();
        btnSearchUber = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearch = new javax.swing.JTable();
        Search1 = new javax.swing.JTextField();
        Search2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCM = new javax.swing.JTable();
        btnCarManufacture = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblUpdateTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1004, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/CarImage.png"))); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Search your Uber ? :)");

        jLabel2.setText("Last Updated:");

        comboboxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Available Car", "All Car Available", "By Brand", "By Manufactured Year", "By Seats", "By Serial Number", "By Model Number", "By City", "Expired Maintenance Certificate" }));
        comboboxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxSearchActionPerformed(evt);
            }
        });

        btnSearchUber.setText("Search!");
        btnSearchUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUberActionPerformed(evt);
            }
        });

        jTableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Model", "Manufacture Year", "Seats", "License Plate", "Driver Name", "Phone Number", "Car Available", "City", "Serial Number", "Maintenance Certificate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSearch);

        Search1.setBackground(new java.awt.Color(204, 204, 204));
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        Search2.setBackground(new java.awt.Color(204, 204, 204));
        Search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search2ActionPerformed(evt);
            }
        });

        jTextField1.setText("List of Car Manufactures:");

        jTableCM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Manufacture"
            }
        ));
        jScrollPane2.setViewportView(jTableCM);

        btnCarManufacture.setText("Search");
        btnCarManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarManufactureActionPerformed(evt);
            }
        });

        jLabel3.setText("Filter the Parameter:");

        lblUpdateTime.setBackground(new java.awt.Color(204, 204, 204));
        lblUpdateTime.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(comboboxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(btnSearchUber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnCarManufacture))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboboxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnSearchUber)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarManufacture))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
        
    public void ReadFile(){
    
            try{
            FileInputStream file = new FileInputStream("ubercars.dat");
            ObjectInputStream input = new ObjectInputStream(file);
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
    private void comboboxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboboxSearchActionPerformed

    private void btnSearchUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUberActionPerformed
        // TODO add your handling code here:
        String searchParameter = comboboxSearch.getSelectedItem().toString();
        System.out.println(searchParameter);
        if (searchParameter == "First Available Car")
        {
            ArrayList<UberModel> temp = FirstAvailabeCar();
            populateSearchTable(temp,"All");
            Search1.setText("");
            Search2.setText("");
            return;
        }
        if (searchParameter == "All Car Available")
        {
            ArrayList<UberModel> temp = AllAvailabeCar();
            populateSearchTable(temp,"All");
            Search1.setText("");
            Search2.setText("");
            return;
        }
       if (searchParameter == "By Brand")
        {
            ArrayList<UberModel> temp = ByBrand();
            populateSearchTable(temp,"All");
                        Search1.setText("");
            Search2.setText("");
            return;
        }
       
        if (searchParameter == "By Manufactured Year")
        {
            ArrayList<UberModel> temp = ByManufacturedYear();
            populateSearchTable(temp,"All");
                        Search1.setText("");
            Search2.setText("");
            return;
        }

        if (searchParameter == "By Seats")
        {
            ArrayList<UberModel> temp = BySeats();
            populateSearchTable(temp,"All");
                        Search1.setText("");
            Search2.setText("");
            return;
        }
        if (searchParameter == "By Model Number")
        {
            ArrayList<UberModel> temp = ByModelNumber();
            populateSearchTable(temp,"All");
                        Search1.setText("");
            Search2.setText("");
            return;
        }
        if (searchParameter == "By Serial Number")
        {
            ArrayList<UberModel> temp = BySerialNumber();
            populateSearchTable(temp,"All");
                        Search1.setText("");
            Search2.setText("");
            return;
        }
        if (searchParameter == "By City")
        {
            ArrayList<UberModel> temp = ByCity();
            populateSearchTable(temp,"All");
                        Search1.setText("");
            Search2.setText("");
            return;
        }
        if (searchParameter == "Expired Maintenance Certificate")
        {
            ArrayList<UberModel> temp = ByExpMC();
            populateSearchTable(temp,"All");
                        Search1.setText("");
            Search2.setText("");
            return;
        }
        
        

        
    }//GEN-LAST:event_btnSearchUberActionPerformed

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search1ActionPerformed

    private void Search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search2ActionPerformed

    private void btnCarManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarManufactureActionPerformed
        // TODO add your handling code here:
        ArrayList<String> temp = ByManufactures();
        //System.out.println(temp);
        populateCarManufactureTable(temp);
        
    }//GEN-LAST:event_btnCarManufactureActionPerformed

public void populateSearchTable(ArrayList<UberModel> temp, String cond){
          //JTable  table = new JTable();
          //DefaultTableModel model = new DefaultTableModel();
          DefaultTableModel model = (DefaultTableModel) jTableSearch.getModel();
          model.setRowCount(0);
          
          if (cond == "All")
          {
              Object rowData[] = new Object[11];
                        
        for (int i = 0; i < temp.size(); i++) {
            rowData[0] = temp.get(i).getBrand();
            rowData[1] = temp.get(i).getModel();
            rowData[2] = temp.get(i).getYear();
            rowData[3] = temp.get(i).getSeatsNumber();
            rowData[4] = temp.get(i).getLicensePlates();
            rowData[5] = temp.get(i).getOwnerName();
            rowData[6] = temp.get(i).getOwnerTelephoneNumbers();
            rowData[7] = temp.get(i).getisAvailable();
            rowData[8] = temp.get(i).getisCity() ; //city name
            rowData[9] = temp.get(i).getisSerialNumber() ; // serial number
            rowData[10] = temp.get(i).getisMaintenanceCertificates() ;
           
            model.addRow(rowData);
            //System.out.println(rowData);
        
        }
              
          }
          
          

        
    }

public void populateCarManufactureTable(ArrayList<String> temp){
          //JTable  table = new JTable();
          //DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model = (DefaultTableModel) jTableCM.getModel();
        model.setRowCount(0);

        Object rowData[] = new Object[1];
                        
        for (int i = 0; i < temp.size(); i++) {
            rowData[0] = temp.get(i);
           
            model.addRow(rowData);
            //System.out.println(rowData);
        

              
          }
          
          

        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search1;
    private javax.swing.JTextField Search2;
    private javax.swing.JButton btnCarManufacture;
    private javax.swing.JButton btnSearchUber;
    private javax.swing.JComboBox<String> comboboxSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCM;
    private javax.swing.JTable jTableSearch;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblUpdateTime;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables

    private ArrayList<UberModel> FirstAvailabeCar() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
        for (int i = 0; i < ls.size(); i++)
        {
            if (ls.get(i).getisAvailable() == true)
            {
                temp.add(ls.get(i));
                break;
                
            }
        }
        return temp;
        
    }

    private ArrayList<UberModel> AllAvailabeCar() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
        for (int i = 0; i < ls.size(); i++)
        {
            if (ls.get(i).getisAvailable() == true)
            {
                temp.add(ls.get(i));
                
                
            }
        }
        return temp;
    }

    private ArrayList<UberModel> ByBrand() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
        String search1 = Search1.getText();
         if (Search1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Input");
            Search1.grabFocus();
        }
        search1 = search1.toLowerCase();
        for (int i = 0; i < ls.size(); i++)
        {
            String pattern = ls.get(i).getBrand();
            pattern = pattern.toLowerCase();
            if (search1.equals(pattern))
            {
                temp.add(ls.get(i));
                
                
            }
        }
        return temp;
        
    }

    private ArrayList<UberModel> ByManufacturedYear() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
                 if (Search1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Input");
            Search1.grabFocus();
        }
        try {
        int search1 = Integer.parseInt(Search1.getText()); ////Integer.parseInt(txtYear.getText())
        for (int i = 0; i < ls.size(); i++)
        {
            int pattern = (ls.get(i).getYear());
            if (search1 == pattern)
            {
                temp.add(ls.get(i));
            }
        }
        return temp;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Invaild Search");
            return temp;
            
        }
        
    }

    private ArrayList<UberModel> BySeats() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
                 if (Search1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Input");
            Search1.grabFocus();
        }
                          if (Search1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Input");
            Search2.grabFocus();
        }
        try 
        {
        int search1 = Integer.parseInt(Search1.getText()); ////Integer.parseInt(txtYear.getText())
        int search2 = Integer.parseInt(Search2.getText());
        
       for (int i = 0; i < ls.size(); i++)
        {
            int pattern = (ls.get(i).getSeatsNumber());
            if (search1 <= pattern & search2 >= pattern)
            {
                temp.add(ls.get(i));
                
                
            }
        }
        return temp;
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Invaild Search");
            return temp;
            
        }

    }

    private ArrayList<UberModel> ByModelNumber() {
        
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
        String search1 = Search1.getText();
                 if (Search1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Input");
            Search1.grabFocus();
        }
        search1 = search1.toLowerCase();
        for (int i = 0; i < ls.size(); i++)
        {
            String pattern = ls.get(i).getModel();
            pattern = pattern.toLowerCase();
            if (search1.equals(pattern))
            {
                temp.add(ls.get(i));
                
                
            }
        }
        return temp;
        
    }

    private ArrayList<String> ByManufactures() {
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < ls.size(); i++)
        {
            String pattern = ls.get(i).getBrand();
            pattern = pattern.toLowerCase();
               if(!temp.contains(pattern))
               {temp.add(pattern);}
     
        }
       
       
        
        return temp;
        
    }

    private ArrayList<UberModel> BySerialNumber() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
        String search1 = Search1.getText();
                 if (Search1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Input");
            Search1.grabFocus();
        }
        for (int i = 0; i < ls.size(); i++)
        {
            String pattern = ls.get(i).getisSerialNumber();
            if (search1.equals(pattern))
            {
                temp.add(ls.get(i));
                
                
            }
        }
        return temp;
}

    private ArrayList<UberModel> ByCity() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
        String search1 = Search1.getText();
                 if (Search1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Input");
            Search1.grabFocus();
        }
        search1 = search1.toLowerCase();
        for (int i = 0; i < ls.size(); i++)
        {
            String pattern = ls.get(i).getisCity();
            pattern = pattern.toLowerCase();
            if (search1.equals(pattern))
            {
                temp.add(ls.get(i));
                
                
            }
        }
        return temp;
    }

    private ArrayList<UberModel> ByExpMC() {
        ArrayList<UberModel> temp = new ArrayList<UberModel>();
        for (int i = 0; i < ls.size(); i++)
        {
            if (ls.get(i).getisMaintenanceCertificates())
            {
                temp.add(ls.get(i));
                
                
            }
        }
        return temp;
    }

    private void ReadUpdtTimeFile() throws IOException {
        
            try {
            BufferedReader logReader = new BufferedReader (new FileReader("serverLog.txt"));
            lblUpdateTime.setText(logReader.readLine());
        
            logReader.close();
            }
            
                    catch (IOException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
        

        
            
}
}