/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalexam.bad;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.PreparedStatement;
import javax.swing.JDialog;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;
import java.awt.print.*;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


/**
 *
 * @author LENOVO
 */
public class SistemManajemenInventaris extends javax.swing.JFrame {
    private DefaultTableModel model;
    private JComboBox<String> comboBox;
    /**
     * Creates new form SistemManajemenInventaris
     */
    public SistemManajemenInventaris() {
        initComponents();
        getData();
    }
    
    public void getData( ){
        try{
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            Statement s = MySQLConnection.getConnection().createStatement();
            
            ResultSet res = (ResultSet) s.executeQuery(""
                    + "Select * from m_produk "
                    + "left join m_kategori m on m_produk.id_kategori = m.id_kategori");
                        
            while(res.next ()){
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(9));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(3));

                dt.addRow(v);
            }           
            
        }catch (Exception e){
            
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Produk", "Nama Produk", "Kategori", "Deskripsi", "Harga", "Stok", "Tanggal"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Sistem Manajemen Inventaris");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Produk PT. Kahfi Sejahtera");

        t_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_searchActionPerformed(evt);
            }
        });
        t_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_searchKeyReleased(evt);
            }
        });

        jButton2.setText("Tambah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Produk");

        jLabel4.setText("Deskripsi");

        jLabel5.setText("Kategori");

        jLabel6.setText("Harga");

        jLabel7.setText("Stok");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Ubah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID Produk");
        jLabel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel9ComponentHidden(evt);
            }
        });

        jLabel10.setText("Tanggal");

        jButton4.setText("Cetak Laporan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(26, 26, 26)
                                                .addComponent(jTextField4))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            Statement s = MySQLConnection.getConnection().createStatement();
            
            String nm_produk = jTextField1.getText();
            String kategori = jTextField2.getText();
            String harga = jTextField3.getText();
            String stok = jTextField4.getText();
            String deskripsi = jTextArea1.getText();
            
            String kategori_cast;
            
            if (kategori.equals("DVD")) {
                kategori_cast = "5";
            } else if (kategori.equals("TV")) {
                kategori_cast = "1";
            } else if (kategori.equals("Laptop")) {
                kategori_cast = "6";
            } else {
                kategori_cast = "2";
            }
            
            
            String query = "INSERT INTO m_produk (nama_produk, id_kategori, harga, stok, deskripsi) VALUES (?, ?, ?, ?, ?)";
    
            // Membuat PreparedStatement untuk mencegah SQL injection
            PreparedStatement pstmt = MySQLConnection.getConnection().prepareStatement(query);
            pstmt.setString(1, nm_produk);
            pstmt.setString(2, kategori_cast);
            pstmt.setString(3, harga);
            pstmt.setString(4, stok);
            pstmt.setString(5, deskripsi);
    
            // Eksekusi query
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");    
            getData();
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextArea1.setText("");
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_searchKeyReleased
        // TODO add your handling code here:
        
        String id = t_search.getText();
        try{
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            Statement s = MySQLConnection.getConnection().createStatement();
            ResultSet res = (ResultSet) s.executeQuery(""
                    + "Select * from m_produk p "
                    + "LEFT JOIN m_kategori m ON p.id_kategori = m.id_kategori "
                    + "WHERE p.nama_produk LIKE '%" + id + "%' OR m.nama_kategori LIKE '%" + id + "%'");
                        
            while(res.next ()){
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(9));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(3));

                dt.addRow(v);
            }           
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_t_searchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow(); // Mendapatkan indeks baris yang dipilih
        
        if (selectedRow >= 0) {
            // Mengambil nilai dari setiap kolom di baris yang dipilih
            Object id_produk = jTable1.getValueAt(selectedRow, 0);
            Object nama_produk = jTable1.getValueAt(selectedRow, 1);
            Object kategori = jTable1.getValueAt(selectedRow, 2);
            Object deskripsi = jTable1.getValueAt(selectedRow, 3);
            Object harga = jTable1.getValueAt(selectedRow, 4);
            Object stok = jTable1.getValueAt(selectedRow, 5);


            // Menampilkan nilai
            jTextField1.setText((String) nama_produk);
            jTextField2.setText((String) kategori);
            jTextField3.setText((String) harga);
            jTextField4.setText((String) stok);
            jTextArea1.setText((String) deskripsi);
            jLabel9.setText((String) id_produk);

        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada baris yang dipilih.");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Statement s = MySQLConnection.getConnection().createStatement();
            
            String nm_produk = jTextField1.getText();
            String kategori = jTextField2.getText();
            String kategori_cast;
            
            if (kategori.equals("DVD")) {
                kategori_cast = "5";
            } else if (kategori.equals("TV")) {
                kategori_cast = "1";
            } else if (kategori.equals("Laptop")) {
                kategori_cast = "6";
            } else {
                kategori_cast = "2";
            }
            
            String harga = jTextField3.getText();
            String stok = jTextField4.getText();
            String deskripsi = jTextArea1.getText();
            String id_produk = jLabel9.getText();
            
            String query = "UPDATE m_produk SET nama_produk = ?, id_kategori = ?, harga = ?, stok = ?, deskripsi = ? WHERE id_produk = ?";
    
            // Membuat PreparedStatement untuk mencegah SQL injection
            PreparedStatement pstmt = MySQLConnection.getConnection().prepareStatement(query);
            pstmt.setString(1, nm_produk);
            pstmt.setString(2, kategori_cast);
            pstmt.setString(3, harga);
            pstmt.setString(4, stok);
            pstmt.setString(5, deskripsi);
            pstmt.setString(6, id_produk);
    
            // Eksekusi query
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");    
            getData();
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextArea1.setText("");
            jLabel9.setText("ID Produk");
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Statement s = MySQLConnection.getConnection().createStatement();
            
            String id_produk = jLabel9.getText();
            
            String query = "DELETE FROM m_produk WHERE id_produk = ?";
            
            PreparedStatement pstmt = MySQLConnection.getConnection().prepareStatement(query);
            pstmt.setString(1, id_produk);
            
            // Eksekusi query
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");    
            getData();
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextArea1.setText("");
            jLabel9.setText("ID Produk");
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel9ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9ComponentHidden

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Cetak Laporan");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            frame.add(scrollPane, BorderLayout.CENTER);

            JButton btnPrint = new JButton("Cetak Laporan");
            btnPrint.addActionListener(e -> {
                try {
                    // Ambil data dari database
                    Statement s = MySQLConnection.getConnection().createStatement();
                    ResultSet rs = s.executeQuery("SELECT * FROM m_produk");
                    
                    StringBuilder sb = new StringBuilder();
                    
                    sb.append("Laporan Produk\n\n");
                    while (rs.next()) {
                        sb.append("Nama Produk: ").append(rs.getString("nama_produk")).append("\n");
                        sb.append("Kategori: ").append(rs.getString("id_kategori")).append("\n");
                        sb.append("Deskripsi: ").append(rs.getString("deskripsi")).append("\n");
//                        sb.append("Tanggal: ").append(rs.getDate("tanggal")).append("\n");
                        sb.append("Harga: ").append(rs.getDouble("harga")).append("\n");
                        sb.append("Stok: ").append(rs.getInt("stok")).append("\n");
                        sb.append("-------------------------------\n");
                    }
                    textArea.setText(sb.toString());

                    // Mencetak laporan
                    PrinterJob printerJob = PrinterJob.getPrinterJob();
                    printerJob.setPrintable((graphics, pageFormat, pageIndex) -> {
                        if (pageIndex > 0) {
                            return Printable.NO_SUCH_PAGE;
                        }
                        Graphics2D g2d = (Graphics2D) graphics;
                        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                        g2d.scale(0.75, 0.75); // Skalakan jika diperlukan
                        textArea.printAll(graphics);
                        return Printable.PAGE_EXISTS;
                    });

                    if (printerJob.printDialog()) {
                        printerJob.print();
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            frame.add(btnPrint, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(SistemManajemenInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemManajemenInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemManajemenInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemManajemenInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemManajemenInventaris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField t_search;
    // End of variables declaration//GEN-END:variables

}
