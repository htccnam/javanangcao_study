/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person_Student_lession;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */

public class formdangnhap {
    public static ArrayList<Sinhvien> lsv = new ArrayList<>();
    static int i = 0;
    public static void main(String[] args){
        JFrame jf = new JFrame("ĐĂNG NHẬP");
        jf.setSize(600, 700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setResizable(false);
        
        JLabel jlht = new JLabel("Họ tên");
        jlht.setBounds(170, 30, 100, 30);
        jf.add(jlht);
        
        JTextField tfht = new JTextField();
        tfht.setBounds(230, 30, 150, 30);
        jf.add(tfht);
        
        JLabel jlns = new JLabel("Ngày sinh");
        jlns.setBounds(170, 80, 100, 30);
        jf.add(jlns);
        
        JTextField tfns = new JTextField();
        tfns.setBounds(230, 80, 150, 30);
        jf.add(tfns);
        
        JLabel jldc = new JLabel("Địa chỉ");
        jldc.setBounds(170, 130, 100, 30);
        jf.add(jldc);
        
        JTextField tfdc = new JTextField();
        tfdc.setBounds(230, 130, 150, 30);
        jf.add(tfdc);
        
        JLabel jlgt = new JLabel("Giới tính");
        jlgt.setBounds(170, 180, 100, 30);
        jf.add(jlgt);
        
        JRadioButton rbnam = new JRadioButton("Nam");
        rbnam.setBounds(230, 180, 70, 30);
        JRadioButton rbnu = new JRadioButton("Nữ");
        rbnu.setBounds(300, 180, 70, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbnu);
        bg.add(rbnam);
        jf.add(rbnam);
        jf.add(rbnu);
        
        JLabel jlmsv = new JLabel("Mã Sinh viên");
        jlmsv.setBounds(150, 230, 100, 30);
        jf.add(jlmsv);
        
        JTextField tfmsv = new JTextField();
        tfmsv.setBounds(230, 230, 150, 30);
        jf.add(tfmsv);
        
        JLabel jlem = new JLabel("Email");
        jlem.setBounds(180, 280, 70, 30);
        jf.add(jlem);
        
        JTextField tfem = new JTextField();
        tfem.setBounds(230, 280, 150, 30);
        jf.add(tfem);
        
        JLabel jldtk = new JLabel("Điểm TK");
        jldtk.setBounds(160, 330, 100, 30);
        jf.add(jldtk);
        
        JTextField tfdtk = new JTextField();
        tfdtk.setBounds(230, 330, 150, 30);
        jf.add(tfdtk);
        
        JButton btnt = new JButton("Thêm");
        btnt.setBounds(70, 380, 70, 30);
        JButton btns = new JButton("Sửa");
        btns.setBounds(180, 380, 70, 30);
        JButton btnl = new JButton("Lưu");
        btnl.setBounds(290, 380, 70, 30);
        JButton btnx = new JButton("Xóa");
        btnx.setBounds(400, 380, 70, 30);
        jf.add(btnt);
        jf.add(btns);
        jf.add(btnl);
        jf.add(btnx);
        
        String[] tencot = {"Họ tên", "Ngày sinh", "Địa chỉ", "Giới tính", "MSV", "Email", "DTK"};
        DefaultTableModel model = new DefaultTableModel(tencot, 0);
        JTable tb = new JTable(model);
        JScrollPane sp = new JScrollPane(tb);
        sp.setBounds(10, 430, 560, 200);
        jf.add(sp);
        
        jf.setVisible(true);
        
        btnt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String ht = tfht.getText();
                String ns = tfns.getText();
                String dc = tfdc.getText();
                String gt = rbnam.isSelected() ? "Nam" : "Nữ";
                String msv = tfmsv.getText();
                String em = tfem.getText();
                float dtk = Float.parseFloat(tfdtk.getText());
                lsv.add(new Sinhvien(ht,ns,dc,gt,msv,em,dtk));
                Sinhvien sv = lsv.get(i);
                Object[] row = {sv.getHoten(), sv.getNgaysinh(), sv.getDiachi(), sv.getGioitinh(), sv.getMsv(), sv.getEmail(), sv.getDtk()};
                model.addRow(row);     
                model.fireTableDataChanged();
                i++;
            }
        });
        
        btnx.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeRow(tb.getSelectedRow());
            }
        });
        
        btns.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tb.getSelectedRow();
                String ht = tfht.getText();
                String ns = tfns.getText();
                String dc = tfdc.getText();
                String gt = rbnam.isSelected() ? "Nam" : "Nữ";
                String msv = tfmsv.getText();
                String em = tfem.getText();
                String dtk = tfdtk.getText();
                model.setValueAt(ht, row, 0);
                model.setValueAt(ns, row, 1);
                model.setValueAt(dc, row, 2);
                model.setValueAt(gt, row, 3);              
                model.setValueAt(msv, row, 4);
                model.setValueAt(em, row, 5);
                model.setValueAt(dtk, row, 6);
            }
        });
        
        tb.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tb.getSelectedRow();
                tfht.setText(tb.getValueAt(row,0).toString());
                tfns.setText(tb.getValueAt(row,1).toString());
                tfdc.setText(tb.getValueAt(row,2).toString());
                String gt = tb.getValueAt(row,3).toString();
                if(gt.equalsIgnoreCase("Nam")){
                    rbnam.setSelected(true);
                }else{
                    rbnu.setSelected(true);
                }            
                tfmsv.setText(tb.getValueAt(row,4).toString());
                tfem.setText(tb.getValueAt(row,5).toString());
                tfdtk.setText(tb.getValueAt(row,6).toString());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
}
