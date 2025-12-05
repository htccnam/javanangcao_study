/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demologin_trenlop_chucnangkhac;

import demologin_trenlop_sudunglopthucthe.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.Control;

/**
 *
 * @author Admin
 */
public class controller_login {
    view_login v=null;
    public controller_login() {
        v = new view_login();
        v.check_login_listenner(new check_login_action());
    }
    public void check_login(model_login tai_khoan){
        if(tai_khoan.user.equals("aa")&&tai_khoan.pass.equals("123")){
            System.out.println("dang nhap thanh cong");
        }else{
            System.out.println("User hoac pass sai");
        }
        
    }
    public class check_login_action implements ActionListener{

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
