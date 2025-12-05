/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demologin_trenlop_chucnangkhac;

import demologin_trenlop_sudunglopthucthe.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class view_login extends JFrame {

    public JTextField txtUser;
    public JPasswordField txtPass;
    private JButton btnLogin, btnExit;

    public view_login() {
        initComponents();
        setLocationRelativeTo(null); //can giua man hinh

    }

    private void initComponents() {
        setTitle("Đăng Nhập");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lblUser = new JLabel("User name:");
        lblUser.setBounds(30, 30, 100, 30);
        add(lblUser);
        txtUser = new JTextField();
        txtUser.setBounds(120, 30, 170, 30);
        add(txtUser);
        JLabel lblpass = new JLabel("Password: ");
        lblpass.setBounds(30, 70, 100, 30);
        add(lblpass);
        txtPass = new JPasswordField();
        txtPass.setBounds(120, 70, 170, 30);
        add(txtPass);
        btnLogin = new JButton("Đăng nhập");
        btnLogin.setBounds(50, 120, 110, 30);
        add(btnLogin);
        btnExit = new JButton("Thoát");
        btnExit.setBounds(180, 120, 110, 30);
        add(btnExit);
        
        setVisible(true);

    }

    public void check_login_listenner(ActionListener a) {
        btnLogin.addActionListener(a);
    }
}
