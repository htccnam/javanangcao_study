/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demologin_trenlop_chucnangkhac;

import Person_Nhanvien.Fnhap;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Result;
import demologin_trenlop_sudunglopthucthe.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sound.sampled.Control;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class controller_login {

    view_login v = null;

    public controller_login() {
        v = new view_login();
        v.check_login_listenner(new check_login_action());
    }

    public void check_login(model_login tai_khoan) {
        //kết nối tới database
        //khai báo biến con rỗng 
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ql_tai_khoan";
            String user = "root";
            String pass = "";
            //tạo connection
            con = DriverManager.getConnection(url, user, pass);
            //tạo statement
            Statement st = con.createStatement();
            ResultSet rec = st.executeQuery("select * from tai_khoan");

   
            while (rec.next()) {
                if (tai_khoan.user.equals(rec.getString("username")) && tai_khoan.pass.equals(rec.getString("password"))) {
                    Fnhap f = new Fnhap();
                   f.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(v, "đăng nhập thất bại do tài khoản hoặc mật khẩu không chính xác");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public class check_login_action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            model_login m = new model_login();
            m.user = v.txtUser.getText();
            m.pass = new String(v.txtPass.getPassword());
            check_login(m);
        }
    }

    public static void main(String[] args) {
        controller_login c = new controller_login();
    }
}
