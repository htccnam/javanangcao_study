/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.model;

/**
 *
 * @author qphwn
 */
public class SinhVien extends Person {

    private String maSinhVien;
    private String email;
    private float diemTongKet;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, String diaChi, String email, float diemTongKet) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(float diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: " + getMaSinhVien()
                + "Ho ten: " + getHoTen()
                + "Ngay sinh: " + getNgaySinh()
                + "Gioi tinh: " + getGioiTinh()
                + "Dia chi: " + getDiaChi()
                + "Email: " + getEmail()
                + "Diem tong ket: " + String.valueOf(getDiemTongKet());
    }
}
