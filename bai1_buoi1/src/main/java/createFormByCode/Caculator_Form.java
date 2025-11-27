/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createFormByCode;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Caculator_Form extends JFrame {

    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btpoint, btC, btPluss, btMinus, btMutiple, btDivide, btEqual;
    JTextField screen;

    public Caculator_Form() {
        init();
    }

    private void init() {
        //panel chứa textFile kết quả
        JPanel jscreen = new JPanel();
        jscreen.setLayout(new BorderLayout());

        screen = new JTextField("0.0");
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setPreferredSize(new Dimension(WIDTH, 70));
        jscreen.add(screen);
        this.setLayout(new BorderLayout());
        this.add(jscreen, BorderLayout.NORTH);

        //panel chứa các button
        JPanel buttonTotal = new JPanel();
        buttonTotal.setLayout(new BorderLayout(10, 0));

        //Panel operator
        JPanel buttonOperator = new JPanel();
        buttonOperator.setLayout(new GridLayout(5, 1,0,7));
        btPluss = new JButton("+");
        btDivide = new JButton("-");
        btMutiple = new JButton("*");
        btMinus = new JButton("/");
        btEqual = new JButton("=");

        JButton[] ArrayButtonOperator = new JButton[]{
            btPluss, btDivide, btMutiple, btMinus, btEqual
        };

        for (JButton a : ArrayButtonOperator) {
            a.setBackground(Color.white);
            a.setForeground(Color.red);
            a.setFont(new Font("T", Font.BOLD, 40));

        }
        buttonOperator.add(btPluss);
        buttonOperator.add(btDivide);
        buttonOperator.add(btMutiple);
        buttonOperator.add(btMinus);
        buttonOperator.add(btEqual);

        JPanel buttonNumber = new JPanel();
        buttonNumber.setLayout(new GridLayout(4, 3,7,7));
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt0 = new JButton("0");
        btpoint = new JButton(".");
        btC = new JButton("C");

        JButton[] ArrayButtonNumber = new JButton[]{
            bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btpoint

        };
        for (JButton a : ArrayButtonNumber) {
            a.setFont(new Font("T", Font.BOLD, 40));
            a.setBackground(Color.white);
            a.setForeground(Color.blue);
        }
        btC.setFont(new Font("T", Font.BOLD, 40));
        btC.setBackground(Color.white);
        btC.setForeground(Color.green);
        
        buttonNumber.add(bt0);
        buttonNumber.add(bt1);
        buttonNumber.add(bt2);
        buttonNumber.add(bt3);
        buttonNumber.add(bt4);
        buttonNumber.add(bt5);
        buttonNumber.add(bt6);
        buttonNumber.add(bt7);
        buttonNumber.add(bt8);
        buttonNumber.add(bt9);
        buttonNumber.add(btpoint);
        buttonNumber.add(btC);

        buttonTotal.add(buttonOperator, BorderLayout.EAST);
        buttonTotal.add(buttonNumber); //chiếm phần còn lại
        this.add(buttonTotal);

    }

    public static void main(String[] args) {
        Caculator_Form C = new Caculator_Form();
        C.setSize(500, 700);
        C.setVisible(true);
    }
}
