/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.KhoaDAO;
import DAO.UsersDAO;
import DTO.Khoa;
import DTO.Users;
import Utilities.Tags;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author boixi
 */
public class ManageUser extends javax.swing.JFrame {

    
    DefaultTableModel tableModel;
    String idSave = "-1";
    private List<Users> listUser = UsersDAO.getInstance().listAccount();
    
    public ManageUser() {
        initComponents();
        
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Username");
        tableModel.addColumn("Họ");
        tableModel.addColumn("Tên");
        tableModel.addColumn("Tuổi");
        tableModel.addColumn("Địa chỉ");
        tableModel.addColumn("Số điện thoại");
        tableModel.addColumn("Email");
        tableModel.addColumn("Ghi chú");
        tableModel.addColumn("Chức vụ");
        
        tblDisplay.setModel(tableModel);
        LoadTable();
        cboKhoa.setEnabled(false);
        labelKhoa.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        txtRePass = new javax.swing.JPasswordField();
        btnHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelRole = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboChucVu = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNote = new javax.swing.JTextField();
        labelKhoa = new javax.swing.JLabel();
        cboKhoa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm tài khoản");

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
<<<<<<< HEAD
=======
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Account_50px.png"))); // NOI18N
>>>>>>> 01990d21bd42d7a5fcbc18eb9e7ebf942f0c18bf
        jLabel1.setText("Quản lý tài khoản");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Họ:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tài khoản:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mật khẩu:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Xác nhận mật khẩu:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

<<<<<<< HEAD
=======
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit File_50px.png"))); // NOI18N
>>>>>>> 01990d21bd42d7a5fcbc18eb9e7ebf942f0c18bf
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
<<<<<<< HEAD
=======
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Plus_50px.png"))); // NOI18N
>>>>>>> 01990d21bd42d7a5fcbc18eb9e7ebf942f0c18bf
        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
<<<<<<< HEAD
=======
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Trash_50px.png"))); // NOI18N
>>>>>>> 01990d21bd42d7a5fcbc18eb9e7ebf942f0c18bf
        btnDelete.setText("Xóa tài khoản");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplay);

        txtRePass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
<<<<<<< HEAD
=======
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Go Back_50px.png"))); // NOI18N
>>>>>>> 01990d21bd42d7a5fcbc18eb9e7ebf942f0c18bf
        btnHome.setText("Quay lại");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tuối:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số điện thoại:");

        labelRole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelRole.setText("Chức vụ: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Địa chỉ: ");

        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select role--", "manager", "teacher", "student", " " }));
        cboChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVuActionPerformed(evt);
            }
        });

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.setToolTipText("16-99");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tên:");

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Ghi chú:");

        txtNote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelKhoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelKhoa.setText("Khoa: ");

        cboKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select khoa--", "CNTT", "ATTT", "QTKD", "DTVT" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnHome)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtRePass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelRole, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNote, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboChucVu, javax.swing.GroupLayout.Alignment.LEADING, 0, 202, Short.MAX_VALUE)
                                                .addComponent(txtPhoneNumber)
                                                .addComponent(cboKhoa, 0, 202, Short.MAX_VALUE))))
                                    .addComponent(labelKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(btnDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnHome))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelRole)
                                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(labelKhoa)
                            .addComponent(cboKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (!idSave.equals("-1")) {            
            if (!formatValidation()) {
                return;
            }
            if (UsersDAO.getInstance().Update(txtPass.getText(), txtFirstName.getText(), txtLastName.getText(),
                    Integer.parseInt(txtAge.getText()), txtAddress.getText(),
                    txtPhoneNumber.getText(), txtEmail.getText(), txtNote.getText(),
                    cboChucVu.getSelectedItem().toString(), cboKhoa.getSelectedItem().toString(),idSave)) {
                JOptionPane.showMessageDialog(null, Tags.UPDATE_SUCCESS);
                LoadTable();
                emptyField();
                btnAdd.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, Tags.UNEXPECTED_ERROR);
            }
        } else {
            JOptionPane.showMessageDialog(null, Tags.NONE_SELECTED);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (!formatValidation()) {
            return;
        }
        if(checkDuplicateUser()) {
            return;
        }
        if (UsersDAO.getInstance().Add(txtUsername.getText(), txtPass.getText(), txtFirstName.getText(),
                txtLastName.getText(), Integer.parseInt(txtAge.getText()), txtAddress.getText(),
                txtPhoneNumber.getText(), txtEmail.getText(),
                txtNote.getText(), cboChucVu.getSelectedItem().toString(), cboKhoa.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, Tags.ADD_USER_SUCCESS);
            LoadTable();
            emptyField();
        } else {
            JOptionPane.showMessageDialog(null, Tags.UNEXPECTED_ERROR);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!idSave.equals("-1")) {
            int confirm = JOptionPane.showConfirmDialog(this, Tags.DELETE_CONFIRM, 
                    "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION) {
                if (UsersDAO.getInstance().Delete(String.valueOf(idSave))) {
                    LoadTable();
                    emptyField();
                    JOptionPane.showMessageDialog(null, Tags.DELETE_USER_SUCCESS);
                } else {
                    JOptionPane.showMessageDialog(null, Tags.DELETE_USER_FAILURE);
                }
            }           
        } else {
            JOptionPane.showMessageDialog(null, Tags.NONE_SELECTED);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
  
        private void tblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMouseClicked
            // TODO add your handling code here:
            //Initialize ComboBox
            labelRole.setEnabled(true);
            cboChucVu.setEnabled(true);
            cboKhoa.setEnabled(true);
            labelKhoa.setEnabled(true);
                
            int row = tblDisplay.getSelectedRow();             
            idSave = listUser.get(row).getId();
            
            if(!UsersDAO.getInstance().GetAccount().getRole().equals("admin")) {
                justForAdmin();
            } else {
                if(idSave.equals("1")) {
                    labelRole.setEnabled(false);
                    cboChucVu.setEnabled(false);
                }
            }          
                       
            Khoa khoa = KhoaDAO.getInstance().getKhoaByUserId(Integer.parseInt(idSave));
            txtUsername.setText(tblDisplay.getValueAt(row, 1) + "");
            txtFirstName.setText(tblDisplay.getValueAt(row, 2) + "");
            txtLastName.setText(tblDisplay.getValueAt(row, 3) + "");
            txtAge.setText(tblDisplay.getValueAt(row, 4) + "");
            txtAddress.setText(tblDisplay.getValueAt(row, 5) + "");
            txtPhoneNumber.setText(tblDisplay.getValueAt(row, 6) + "");
            txtEmail.setText(tblDisplay.getValueAt(row, 7) + "");
            txtNote.setText(tblDisplay.getValueAt(row, 8) + "");
            cboChucVu.setSelectedItem(tblDisplay.getValueAt(row, 9) + "");           
            txtPass.setText(listUser.get(row).getPassword());
            txtRePass.setText("");
            
            System.out.println(khoa.getTen());
            if(tblDisplay.getValueAt(row, 9).toString().equalsIgnoreCase("student")) {               
                cboKhoa.setSelectedItem(khoa.getTen() + "");
            }
            else {
                cboKhoa.setEnabled(false);
                labelKhoa.setEnabled(false);
                cboKhoa.setSelectedIndex(0);
            }
        }//GEN-LAST:event_tblDisplayMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

<<<<<<< HEAD
=======
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cboChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVuActionPerformed
        // TODO add your handling code here:
        if(cboChucVu.getSelectedItem().toString().equalsIgnoreCase("student")) {
            cboKhoa.setEnabled(true);
            labelKhoa.setEnabled(true);
        }
        else {
            cboKhoa.setEnabled(false);
            labelKhoa.setEnabled(false);
        }
    }//GEN-LAST:event_cboChucVuActionPerformed

>>>>>>> 01990d21bd42d7a5fcbc18eb9e7ebf942f0c18bf
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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageUser().setVisible(true);
        });
    }
    
    public boolean formatValidation() {
        if (emptyValidate(txtFirstName)
                || emptyValidate(txtLastName) || emptyValidate(txtUsername)
                || emptyValidate(txtPass) || emptyValidate(txtRePass)
                || emptyValidate(txtAge) || emptyValidate(txtAddress)
                || emptyValidate(txtPhoneNumber)) {          
            return false;
        }
        if (!txtPass.getText().equals(txtRePass.getText())) {
            JOptionPane.showMessageDialog(null, "Xác nhận mật khẩu chưa chính xác!");
            txtRePass.requestFocus();
            return false;
        }
        //Kiểm tra số điện thoại
        if (numberValidate(txtPhoneNumber)) {            
            return false;
        } else {
            String phone = txtPhoneNumber.getText();
            if (!phone.matches("[0-9]{10}")) {
                JOptionPane.showMessageDialog(null, "Số điện thoại bao gồm 10 chữ số!");
                txtAge.requestFocus();
                return false;
            }
        }
        //Kiểm tra tuổi
        if (numberValidate(txtAge)) {
            return false;
        } else {
            int age = Integer.parseInt(txtAge.getText());
            if (age < 18 || age > 100) {
                JOptionPane.showMessageDialog(null, "Tuổi không hợp lệ!\n Người dùng phải từ 18 tuổi trở lên");
                txtAge.requestFocus();
                return false;
            }
        }
        //Sử dụng chuẩn email RFC 5322
        String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(txtEmail.getText() + "");
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Email không đúng định dạng!\nexample: test@email.com");
            txtEmail.requestFocus();
            return false;
        }
        return true;
    }
    
    public boolean numberValidate(JTextField jTextField) {
        if (!jTextField.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Chỉ được điền số!");
            jTextField.requestFocus();
            return true;
        }
        return false;
    }
    
    public boolean emptyValidate(JTextField jTextField) {
        if (jTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống!");
            jTextField.requestFocus();
            return true;
        }
        return false;
    }
    
    public void emptyField() {
        idSave = "-1";
        txtUsername.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");        
        txtPass.setText("");
        txtRePass.setText("");
        txtAge.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        cboChucVu.setSelectedIndex(0);
        cboKhoa.setSelectedIndex(0);
        txtNote.setText("");
        txtEmail.setText("");
    }
    
    public boolean checkDuplicateUser() {
        for(Users user : listUser) {
            if(txtPhoneNumber.getText().equals(user.getPhoneNumber())) {
                JOptionPane.showMessageDialog(null, Tags.USER_EXISTED);
                txtPhoneNumber.requestFocus();
                return true;
            }
            if(txtEmail.getText().equals(user.getEmail())) {
                JOptionPane.showMessageDialog(null, Tags.USER_EXISTED);
                txtEmail.requestFocus();
                return true;
            }
        }  
        return false;
    }
    
    public void justForAdmin() {
        if(idSave.equals("1")) {
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            cboChucVu.setSelectedIndex(0);
            cboChucVu.setEnabled(false);
            labelRole.setEnabled(false);
            return;
        }
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        cboChucVu.setEnabled(true);
        labelRole.setEnabled(true);
    }
    
    private void LoadTable() {
        tableModel.setRowCount(0);
        listUser = UsersDAO.getInstance().listAccount();
        for (int i = 0; i < listUser.size(); i++) {
            Users account = listUser.get(i);
            Object[] dt = {account.getId(), account.getUsername(), account.getFirstName(), account.getLastName(), account.getAge(), account.getAddress(), account.getPhoneNumber(), account.getEmail(), account.getNote(), account.getRole()};
            tableModel.addRow(dt);
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelKhoa;
    private javax.swing.JLabel labelRole;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNote;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JPasswordField txtRePass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
