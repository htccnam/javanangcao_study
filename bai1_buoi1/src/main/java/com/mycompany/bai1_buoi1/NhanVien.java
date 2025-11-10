/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1_buoi1;

/**
 *
 * @author Admin
 */
public class NhanVien extends Person{
    private String phongban;
    private float hesoluong;
    private float thamnien;
    private float luongcoban;

    
    public NhanVien(String hoten, String ngaysinh, String diachi, String gioitinh,String phongban, float hesoluong, float thamnien, float luongcoban) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    

 
    public String hienthinhanvien() { 
        return super.toString() + "phongban=" + phongban + ", hesoluong=" + hesoluong + ", thamnien=" + thamnien + ", luongcoban=" + luongcoban + ", lương thực lĩnh = "+ luongthuclinh();
    }
    
    public float luongthuclinh(){
        return luongcoban*hesoluong*(1+thamnien/100);
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public float getThamnien() {
        return thamnien;
    }

    public void setThamnien(float thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }
    
}
