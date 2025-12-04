/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person_Student_lession;

/**
 *
 * @author HP
 */
public class Sinhvien extends Person{
    String msv, email;
    float dtk;

    public Sinhvien() {
    }

    public Sinhvien(String Hoten, String Ngaysinh, String Diachi, String Gioitinh, String msv, String email, float dtk) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.msv = msv;
        this.email = email;
        this.dtk = dtk;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDtk() {
        return dtk;
    }

    public void setDtk(float dtk) {
        this.dtk = dtk;
    }
   
    public void Hienthi(){
        Hienthithongtin();
        System.out.println(msv + " || " + email + " || " + dtk);
    }  
}
