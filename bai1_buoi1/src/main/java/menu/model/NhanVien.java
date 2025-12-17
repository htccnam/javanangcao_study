/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.model;

import java.util.Date;

/**
 *
 * @author qphwn
 */
public class NhanVien extends Person {

    private String phongBan;
    private float heSoLuong;
    private float thamNien;
    private int luongCoBan;

    public NhanVien() {
    }
    
    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String phongBan, float heSoLuong, float thamNien, int luongCoBan) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
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

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getThamNien() {
        return thamNien;
    }

    public void setThamNien(float thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int tinhLuongThucLinh() {
        return (int) (luongCoBan * heSoLuong * (1 + thamNien / 100));
    }
    
    @Override
    public String toString() {
        return "Ho ten: " + hoTen
                + "\nNgay sinh: " + ngaySinh
                + "\nGioi tinh: " + gioiTinh
                + "\nDia chi: " + diaChi
                + "\nPhong ban: " + phongBan
                + "\nHe so luong: " + String.valueOf(heSoLuong)
                + "\nTham nien: " + String.valueOf(thamNien)
                + "\nLuong co ban: " + String.valueOf(luongCoBan)
                + "\nLuong thuc linh: " + String.valueOf(tinhLuongThucLinh());
    }
}
