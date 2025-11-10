/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bai1_buoi1;
    
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Ftable_hienthi extends javax.swing.JFrame {
    
    /**
     * Creates new form Ftable_hienthi
     */
    //khai báo 
    private DefaultTableModel tablemodle;
    
    public Ftable_hienthi() {
        initComponents();
        tablemodle=(DefaultTableModel) table_nhanvien.getModel(); //gắn đối tượng
        load_table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_nhanvien = new javax.swing.JTable();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HỌ TÊN", "NGÀY SINH", "ĐỊA CHỈ", "GIỚI TÍNH", "PHÒNG BAN", "HỆ SỐ LƯƠNG", "THÂM NIÊN", "LƯƠNG CƠ BẢN", "LƯƠNG THỰC LĨNH"
            }
        ));
        jScrollPane1.setViewportView(table_nhanvien);

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_thoatActionPerformed

    
    private List<NhanVien> docfilenhanvien(String duongdan){
        List<NhanVien> dsnv= new ArrayList<>();
        File file = new File(duongdan);
        
        if(!file.exists()){
            System.err.println("file không tốn tại");
            return dsnv;
        }
        
        try{
            FileReader fr=new FileReader(file);
            BufferedReader br= new BufferedReader(fr);
            String line =" ";
            while ((line=br.readLine())!=null){
                String[] part=line.split("\\$");
                if(part.length == 9){
                    String ht=part[0];
                    String ns=part[1];
                    String dc=part[2];
                    String gt=part[3];
                    String pb=part[4];
                    float hsl=Float.parseFloat(part[5]);
                    float tn=Float.parseFloat(part[6]);
                    float lcb=Float.parseFloat(part[7]);
              
                    NhanVien nv=new NhanVien(ht, ns, dc, gt, pb, hsl, tn, lcb);
                    dsnv.add(nv);
                }
            }
        }catch(Exception e){
            System.err.println("lỗi thực lĩnh");
        }
        return dsnv;
    }
    
    private void load_table(){
        List<NhanVien> dsnv = docfilenhanvien("C:/file/nhanvien.dat");
        
        if(dsnv!=null){
            for(NhanVien nv: dsnv){
                tablemodle.addRow(new Object[]{
                    nv.getHoten(),
                    nv.getNgaysinh(),
                    nv.getDiachi(),
                    nv.getGioitinh(),
                    nv.getPhongban(),
                    nv.getHesoluong(),
                    nv.getThamnien(),
                    nv.getLuongcoban(),
                    nv.luongthuclinh()
                });
            }
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
            java.util.logging.Logger.getLogger(Ftable_hienthi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ftable_hienthi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ftable_hienthi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ftable_hienthi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ftable_hienthi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thoat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_nhanvien;
    // End of variables declaration//GEN-END:variables
}
