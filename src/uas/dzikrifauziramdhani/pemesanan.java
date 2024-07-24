/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package uas.dzikrifauziramdhani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADVAN
 */
public class pemesanan extends javax.swing.JInternalFrame {

    /**
     * Creates new form pemesanan
     */
    public pemesanan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kodeTransaksiTxt = new javax.swing.JTextField();
        namaSekolahTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        tglTransaksiTxt = new javax.swing.JTextField();
        telpTxt = new javax.swing.JTextField();
        jumlahBeliTxt = new javax.swing.JTextField();
        produkCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        simpanBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        hapusBtn = new javax.swing.JButton();
        tutupBtn = new javax.swing.JButton();

        setTitle("PEMESANAN");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Kode Transaksi");

        jLabel2.setText("Nama Sekolah");

        jLabel3.setText("Email/Telp");

        jLabel4.setText("Tgl Transaksi");

        jLabel5.setText("Produk");

        jLabel6.setText("Jumlah Beli");

        produkCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Piece", "Akun", "Pelatihan" }));

        jLabel7.setText("/");

        simpanBtn.setText("SAVE");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Transaksi", "Nama Sekolah", "Email", "Telpon", "Tgl Transaksi", "Produk", "Jumlah Beli"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        hapusBtn.setText("DELETE");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        tutupBtn.setText("CLOSE");
        tutupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(produkCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                            .addComponent(tglTransaksiTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt)
                            .addComponent(namaSekolahTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeTransaksiTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jumlahBeliTxt))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tutupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(simpanBtn)
                                    .addComponent(hapusBtn))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(namaSekolahTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tglTransaksiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(produkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jumlahBeliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hapusBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tutupBtn)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
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

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
            model.addRow(new Object[]{kodeTransaksiTxt.getText(), namaSekolahTxt.getText(), emailTxt.getText(),telpTxt.getText()
                    , tglTransaksiTxt.getText(),produkCB.getSelectedItem(), jumlahBeliTxt.getText()});
            
             try {
            Connection conn = getConnection();
            String sql = "INSERT INTO produk(kode, nama_sekolah, email, telpon, tgl, produk, jumlah_beli FROM transaksi) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, kodeTransaksiTxt.getText());
            statement.setString(2, namaSekolahTxt.getText());
            statement.setString(3, emailTxt.getText());
            statement.setString(4, telpTxt.getText());
            statement.setString(5, tglTransaksiTxt.getText());
            statement.setString(6, (String) produkCB.getSelectedItem());
            statement.setString(7, jumlahBeliTxt.getText());
            statement.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, " Gagal menyimpan " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_simpanBtnActionPerformed
     private Connection getConnection() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/uaspemp";
            String username = "root";
            String password = "";
            return DriverManager.getConnection(url, username, password);
        }
    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        int selectedRow = orderTable.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel tableModel = (DefaultTableModel) orderTable.getModel();
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void tutupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupBtnActionPerformed
        dispose();
    }//GEN-LAST:event_tutupBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahBeliTxt;
    private javax.swing.JTextField kodeTransaksiTxt;
    private javax.swing.JTextField namaSekolahTxt;
    private javax.swing.JTable orderTable;
    private javax.swing.JComboBox<String> produkCB;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JTextField telpTxt;
    private javax.swing.JTextField tglTransaksiTxt;
    private javax.swing.JButton tutupBtn;
    // End of variables declaration//GEN-END:variables
}
