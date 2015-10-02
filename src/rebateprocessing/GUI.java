/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rebateprocessing;


import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author achaturvedi
 */
public class GUI extends javax.swing.JFrame {
    /*
        sample combo box
    */
        JComboBox cbo = new JComboBox();
    
    RebateProcessingController rebateProcessingController;
    
    ArrayList<AppDataModel> appDataList;
    /**
     * Creates new form GUI
     */
    public GUI() {
        //
        
        //
        //load File data and initialize the GUI components (phone numebr and Name dropdown with them)
        appDataList = FileHandler.loadAllData();
        
        initComponents();
        
        //initialize an object of controller class
        rebateProcessingController = new RebateProcessingController();
        

//        for (int i=0;i<appDataList.size();i++){
//           
//        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        middleInitial = new javax.swing.JTextField();
        addressLine1 = new javax.swing.JTextField();
        addressLine2 = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        zipCode = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        emailAddress = new javax.swing.JTextField();
        POAattached = new javax.swing.JToggleButton();
        dateReceived = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        middleInitialLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eMailLabel = new javax.swing.JLabel();
        addressLine1Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        zipCodeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pageHeading = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        phoneNumCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        middleInitial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleInitialActionPerformed(evt);
            }
        });

        POAattached.setText("Proof of Address Attached");
        POAattached.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POAattachedActionPerformed(evt);
            }
        });

        dateReceived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateReceivedActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First Name");

        middleInitialLabel.setText("Middle Initial");

        lastNameLabel.setText("Last Name");

        jLabel1.setText("Date Received");

        eMailLabel.setText("eMail");

        addressLine1Label.setText("Address Line 1");

        jLabel2.setText("Address Line 2");

        cityLabel.setText("City");

        stateLabel.setText("State");

        zipCodeLabel.setText("zip code");

        jLabel3.setText("phone");

        pageHeading.setText("REBATE PROCESSING TOOL");

        addButton.setText("Add a record");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete this record");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        phoneNumCombo.setModel(new javax.swing.DefaultComboBoxModel());// { "Item 1", "Item 2", "Item 3", "Item 4" }));
phoneNumCombo.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        phoneNumComboActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressLine1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addComponent(zipCodeLabel)
                .addComponent(eMailLabel)
                .addComponent(jLabel3)
                .addComponent(firstNameLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(zipCode))
                    .addGap(10, 10, 10)
                    .addComponent(stateLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dateReceived, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addGap(387, 387, 387))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(pageHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(phoneNumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(152, 152, 152))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(POAattached)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(middleInitialLabel)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailAddress))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(427, 427, 427))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(phoneNumCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(pageHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(firstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(middleInitialLabel)
                    .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addressLine1Label)
                .addComponent(addressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addGap(9, 9, 9)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cityLabel)
                .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(stateLabel))
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zipCodeLabel)
                        .addComponent(POAattached))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(3, 3, 3)
                    .addComponent(eMailLabel)
                    .addGap(36, 36, 36))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateReceived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(30, 30, 30)))
            .addComponent(addButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(deleteButton)
                .addComponent(cancelButton))
            .addContainerGap(25, Short.MAX_VALUE))
    );

    pageHeading.setFont(new Font("Courier New", Font.BOLD, 18));
    phoneNumCombo.addItem("      ****select a record from list****");
    //phoneNumCombo.addItem("469-774-6884");
    //phoneNumCombo.addItem("404-345-6258");
    if(appDataList != null){
        for (int i = 0;i<appDataList.size();i++) {
            phoneNumCombo.addItem(appDataList.get(i).getFirstName() + " " + appDataList.get(i).getMInitial() + " " + appDataList.get(i).getLastName() + " | " +(appDataList.get(i)).getPhone());
        }
    }
    //phoneNumCombo.setSelectedItem("");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateReceivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateReceivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateReceivedActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void middleInitialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleInitialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleInitialActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        /*get all the data from the text fields from here
        make an object of AppDataModel class
        initialize this object with data read from the fields
        pass this object to the RebateProcessing class (controller) */
        
        //first create object of AppDataModel class
        AppDataModel appDataModel = new AppDataModel();
        
        //now feed this object with the input values
        appDataModel.setLastName(lastName.getText());
        appDataModel.setFirstName(firstName.getText());
        appDataModel.setMInitial(middleInitial.getText());
        appDataModel.setAddrLine1(addressLine1.getText());
        appDataModel.setAddrLine2(addressLine2.getText());
        appDataModel.setCity(city.getText());
        appDataModel.setState(state.getText());
        appDataModel.setZipCode(zipCode.getText());
        appDataModel.setPhone(phoneNumber.getText());
        appDataModel.setEmail(emailAddress.getText());
        appDataModel.setDateReceived(dateReceived.getText());
        appDataModel.setPoa(POAattached.isSelected());
        
        //pass this object to the controller (RebateProcessingController class)
        if (rebateProcessingController.addData(appDataModel)) {
            System.out.println("data written in file");
            //show a message in dialogue box as well
             /*Also, we need to update the data here that is feeded to phone number and name dropdowns
                need not to call File Handler functions, just need to add the recently added item in the lists*/
            appDataList.add(appDataModel);
            
            //akso, update the dropdown(combo box) list
             phoneNumCombo.addItem(appDataList.get(appDataList.size()-1).getFirstName() + " " + appDataList.get(appDataList.size()-1).getMInitial() + " " + appDataList.get(appDataList.size()-1).getLastName() + " | " +(appDataList.get(appDataList.size()-1)).getPhone());
        }else {
            System.out.println("something went wrong while writing data to file");
            //show an error messge to user as well
        }
                
       
    }//GEN-LAST:event_addButtonActionPerformed

    private void POAattachedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POAattachedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_POAattachedActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        //pass full name to controller
        String fullName = firstName.getText() + "\t" + middleInitial.getText() + "\t" + lastName.getText();
        if(rebateProcessingController.deleteData(fullName)){
            System.out.println("data deleted");
        }else {
            System.out.println("data not deleted, some error occured!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    
    private void phoneNumComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumComboActionPerformed
        // TODO add your handling code here:
        System.out.println("selected index is : "+phoneNumCombo.getSelectedIndex());
        fillData(phoneNumCombo.getSelectedIndex());
        
    }//GEN-LAST:event_phoneNumComboActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // clear all the fields
        firstName.setText("");
            middleInitial.setText("");
            lastName.setText("");
            POAattached.setSelected(false);
            addressLine1.setText("");
            addressLine2.setText("");
            city.setText("");
            state.setText("");
            zipCode.setText("");
            phoneNumber.setText("");
            emailAddress.setText("");
            dateReceived.setText("");
            phoneNumCombo.setSelectedIndex(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    
    //function to fill the data in the GUI fields based on the item selected
    private void fillData(int index)
    {
        //appDataList.add(null);
        if(index == 0){
            firstName.setText("");
            middleInitial.setText("");
            lastName.setText("");
        }else {
            index--;    //because the data actually starts from the first index in the comboBox list, but not in the appDataList
            firstName.setText(appDataList.get(index).getFirstName());
            middleInitial.setText(appDataList.get(index).getMInitial());
            lastName.setText(appDataList.get(index).getLastName());
            POAattached.setSelected(appDataList.get(index).getPoa());
            addressLine1.setText(appDataList.get(index).getAddrLine1());
            addressLine2.setText(appDataList.get(index).getAddrLine2());
            city.setText(appDataList.get(index).getCity());
            state.setText(appDataList.get(index).getState());
            zipCode.setText(appDataList.get(index).getZipCode());
            phoneNumber.setText(appDataList.get(index).getPhone());
            emailAddress.setText(appDataList.get(index).getEmail());
            dateReceived.setText(appDataList.get(index).getDateReceived());
        }
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton POAattached;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressLine1;
    private javax.swing.JLabel addressLine1Label;
    private javax.swing.JTextField addressLine2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField city;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField dateReceived;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel eMailLabel;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField middleInitial;
    private javax.swing.JLabel middleInitialLabel;
    private javax.swing.JLabel pageHeading;
    private javax.swing.JComboBox phoneNumCombo;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField state;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField zipCode;
    private javax.swing.JLabel zipCodeLabel;
    // End of variables declaration//GEN-END:variables
}
