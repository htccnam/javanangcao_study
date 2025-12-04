/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demologin_trenlop_sudunglopthucthe;

/**
 *
 * @author Admin
 */
public class controller_login {

    public controller_login() {
    }
    public void check_login(model_login tai_khoan){
        if(tai_khoan.user.equals("aa")&&tai_khoan.pass.equals("123")){
            System.out.println("dang nhap thanh cong");
        }else{
            System.out.println("User hoac pass sai");
        }
    }
    
}
