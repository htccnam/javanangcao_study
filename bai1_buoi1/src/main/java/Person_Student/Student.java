/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person_Student;

import java.rmi.StubNotFoundException;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    private String masinhvien;
    private String email;
    private float diemtongket;
    
    public Student(String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
    }

    public Student(String masinhvien, String email, float diemtongket, String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.masinhvien = masinhvien;
        this.email = email;
        this.diemtongket = diemtongket;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemtongket() {
        return diemtongket;
    }

    public void setDiemtongket(float diemtongket) {
        this.diemtongket = diemtongket;
    }

    public String hienthistudent() {
        return "Student{" + "masinhvien=" + masinhvien + ", email=" + email + ", diemtongket=" + diemtongket + hienthinguoi();
    }
    
    
}
