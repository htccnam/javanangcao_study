/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import Person_Nhanvien.Fnhap;
import Person_Nhanvien.NhanVien;
import Person_Student_lession.formdangnhap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Admin
 */
public class code_menu {

    public static void main(String[] args) {
        //tạo menu
        JFrame j = new JFrame();
        JMenuBar menu_bar = new JMenuBar();
        JMenu menu = new JMenu("Quan ly");
        JMenuItem item1 = new JMenuItem("Quan_ly_nhan_vien");
        JMenuItem item2 = new JMenuItem("Quan_ly_sinh_vien");
        menu.add(item1);
        menu.add(item2);
        menu_bar.add(menu);

        //tạo sự kiện nút ấn trên menu
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Quan_ly_nhan_vien")) {
                    Fnhap form_nv = new Fnhap();
                    form_nv.setVisible(true);

                } else {
                   
                }
            }
        };
        item1.addActionListener(l);
        item2.addActionListener(l);

        //tạo giao diện menu
        j.add(menu_bar);
        j.setSize(300, 200);
        j.setVisible(true);
    }

}
