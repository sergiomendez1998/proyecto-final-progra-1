/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.panels;


import views.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.util.List;

import model.User;
import service.UserServiceManagement;
import util.Util;

/**
 *
 * @author SERGIO-MENDEZ
 */
public class AdminRegistrationForm extends javax.swing.JFrame {
    UserServiceManagement userServiceManagement = new UserServiceManagement();
    User newUser=null;
   

    
    /**
     * Creates new form RegistrtionForm
     */
    public AdminRegistrationForm() {
        roundJFrame();
        // round the form border util does not have the method
    }

    private void roundJFrame() {
  

        // Set the window's shape
        setDefaultCloseOperation(AdminRegistrationForm.EXIT_ON_CLOSE);
        setSize(800, 900);
        setLocationRelativeTo(null); // Center the frame
        setUndecorated(true); // Remove the default window decorations

        // Create a rounded shape
        Shape roundedShape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50);
        //Apply also a border into the footer frame
        // Set the shape of the frame
        setShape(roundedShape);
        initComponents();
    }

    public boolean emailExist(String email) {

        List<User> userList = userServiceManagement.executeReadAll().stream()
                .map(user -> (User) user).toList();

        return userList.stream().anyMatch(user -> user.getEmail().equals(email));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        userSuccessLbl = new javax.swing.JLabel();
        emailErrorLbl = new javax.swing.JLabel();
        standardUseRb = new javax.swing.JRadioButton();
        adminUseRb = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanel2ComponentRemoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER REGISTRATION FORM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Phone Number");

        firstNameTxt.setBackground(new java.awt.Color(230, 230, 230));
        firstNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        firstNameTxt.setText(" ");
        firstNameTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });

        lastNameTxt.setBackground(new java.awt.Color(230, 230, 230));
        lastNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lastNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        lastNameTxt.setText(" ");
        lastNameTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTxtActionPerformed(evt);
            }
        });

        addressTxt.setBackground(new java.awt.Color(230, 230, 230));
        addressTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressTxt.setForeground(new java.awt.Color(0, 0, 0));
        addressTxt.setText(" ");
        addressTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("First Name");

        emailTxt.setBackground(new java.awt.Color(230, 230, 230));
        emailTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(0, 0, 0));
        emailTxt.setText(" ");
        emailTxt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        phoneNumberTxt.setBackground(new java.awt.Color(230, 230, 230));
        phoneNumberTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phoneNumberTxt.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumberTxt.setText(" ");
        phoneNumberTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        phoneNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTxtActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTER");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CLOSE");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(49, 49, 49))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Password");

        passwordTxt.setBackground(new java.awt.Color(230, 230, 230));
        passwordTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(0, 0, 0));
        passwordTxt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        userSuccessLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userSuccessLbl.setForeground(new java.awt.Color(0, 204, 0));

        emailErrorLbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        emailErrorLbl.setForeground(new java.awt.Color(255, 51, 51));

        standardUseRb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        standardUseRb.setForeground(new java.awt.Color(0, 0, 0));
        standardUseRb.setText("Standard User");
        standardUseRb.setContentAreaFilled(false);
        standardUseRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardUseRbActionPerformed(evt);
            }
        });

        adminUseRb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adminUseRb.setForeground(new java.awt.Color(0, 0, 0));
        adminUseRb.setText("Admin User");
        adminUseRb.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(phoneNumberTxt))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailErrorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addressTxt)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel7)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(userSuccessLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(standardUseRb)
                        .addGap(39, 39, 39)
                        .addComponent(adminUseRb)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userSuccessLbl)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailErrorLbl)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standardUseRb)
                    .addComponent(adminUseRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel2ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2ComponentRemoved

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void clearFields() {
        firstNameTxt.setText("   ");
        lastNameTxt.setText("   ");
        addressTxt.setText("   ");
        emailTxt.setText("   ");
        phoneNumberTxt.setText("   ");
        passwordTxt.setText("   ");
        firstNameTxt.setFocusable(true);
    }
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        userType.add(adminUseRb);
        userType.add(adminUseRb);
        String rol = "";

        if(standardUseRb.isSelected()){
            rol = "user";
        }else if(adminUseRb.isSelected()){
            rol = "admin";
        }

        String email = Util.removeSpaces(emailTxt.getText());
        String firstName = Util.removeSpaces(firstNameTxt.getText());
        String lastName = Util.removeSpaces(lastNameTxt.getText());
        String address = Util.removeSpaces(addressTxt.getText());
        String phoneNumber = Util.removeSpaces(phoneNumberTxt.getText());
        String password = passwordTxt.getText();

        if(firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty()){
            userSuccessLbl.setText("Please fill all the fields!");
            userSuccessLbl.setForeground(Color.red);
            return;
        }

        if (!Util.isValidEmail(email)) {
            emailErrorLbl.setText("Not a valid email!");
            return;
        }

        if (emailExist(email)) {
            emailErrorLbl.setText("Email already exists!");
            return;
        }

        User newUser = new User(firstName, lastName, phoneNumber, address, email, password, rol);
        userServiceManagement.executeCreate(newUser);

        userSuccessLbl.setText("User created successfully!");
        emailErrorLbl.setText("");
        clearFields();

    }//GEN-LAST:event_jLabel9MouseClicked

    private void phoneNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTxtActionPerformed

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void lastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTxtActionPerformed

    private void standardUseRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardUseRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardUseRbActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(AdminRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JRadioButton adminUseRb;
    private javax.swing.JLabel emailErrorLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JRadioButton standardUseRb;
    private javax.swing.JLabel userSuccessLbl;
    private javax.swing.ButtonGroup userType;
    // End of variables declaration//GEN-END:variables
}
