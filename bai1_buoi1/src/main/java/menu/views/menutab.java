/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.views;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author Admin
 */
public class menutab extends JFrame{

    public menutab() {//hàm tạo bước 1
        
        setTitle("Menu chính");
        setSize(500, 700); //thêm kích thước của view cho menutab
        initComponents(); //hàm để hiển thị các views mình cần
    }
    
    public static void main(String[] args) {
        new menutab().setVisible(true); //hiển thị view
    }
    private void initComponents(){
        JTabbedPane jtb = new JTabbedPane();
        add(jtb); //add vào view hiện tại 
        FormQuanLyNhanVienPanel jp = new FormQuanLyNhanVienPanel();
        jtb.addTab("nhân viên", jp); //thêm panel cho jtb hiện tại
        
        FormQuanLySinhVienPanel jp1 =new FormQuanLySinhVienPanel();
        jtb.addTab("sinh viên", jp1);
    }
}
