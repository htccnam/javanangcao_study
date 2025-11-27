/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createFormByCode;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class signUp_Form extends JFrame{
    public signUp_Form(){
        initComponents();
    }
    
    private void initComponents() {
        JLabel labelUsername, labelPassword ;
        JTextField textFieldUsername, textFieldPassword;
        JButton buttonLogin;

        labelUsername = new JLabel("Nhap user");
        labelPassword = new JLabel("Nhap pass");
        textFieldUsername = new JTextField(20);
        textFieldPassword = new JTextField(20);
        buttonLogin = new JButton("Dang nhap");

        JPanel panelUsername, panelPassword , panelLogin;
        panelUsername = new JPanel();
        panelPassword = new JPanel();
        panelLogin = new JPanel();

        panelUsername.setLayout(new GridLayout(1,2, 5, 5));
        panelUsername.add(labelUsername); panelUsername.add(textFieldUsername);
        panelPassword.setLayout(new GridLayout(1,2, 5, 5));
        panelPassword.add(labelPassword); panelPassword.add(textFieldPassword);
        panelLogin.setLayout(new FlowLayout());
        panelLogin.add(buttonLogin);
        add(panelUsername); add(panelPassword); add(panelLogin);
    }
    
    public static void main(String[] args) {
        signUp_Form fdn = new signUp_Form();
        fdn.setLayout(new GridLayout(3,1));
        fdn.setSize(320,140);
        fdn.setResizable(false);
        fdn.setVisible(true);
    }
}