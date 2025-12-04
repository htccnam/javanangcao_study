package createFormByCode;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class createFormByCode extends JFrame{
    public createFormByCode(){
        JButton b_n, b_s , b_w , b_e ,b_c ;
        b_n =new JButton("one");
        b_s =new JButton("two");
        b_w =new JButton("three");
        b_e =new JButton("four");
        b_c =new JButton("five");
        JPanel p1,p2,p3;
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p1.setLayout(new GridLayout());
        p1.add(b_n);p1.add(b_s);
        p2.setLayout(new BorderLayout());
        p2.add(b_w);
        p3.setLayout(new FlowLayout());
        p3.add(b_e); p3.add(b_c);
        setLayout(new GridLayout(3, 1));
        add(p1); add(p2);add(p3);
        setTitle("Hello");
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        createFormByCode f=new createFormByCode();
    }
}