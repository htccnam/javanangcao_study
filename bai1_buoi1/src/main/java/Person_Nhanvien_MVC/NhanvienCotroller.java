/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person_Nhanvien_MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.Nhanvien;
import view.NhanvienView;

/**
 *
 * @author Admin
 */
public class NhanvienCotroller {
    NhanvienView v=null;
    int selectedRow =-1;

    public NhanvienCotroller() {
        v= new NhanvienView();
        
        v.addAddListener(new AddAction());
        v.addEditListener(new EditAction());
        v.addDeleteListener(new DeleteAction());
        v.addSaveListener(new SaveAction());
        v.addTableClickListener(new TableClickAction());
        v.model.fireTableDataChanged();
        v.setVisible(true);
    }
    //Lấy dữ liệu từ form
    public Nhanvien getEmployeeFromView() {
        String gt = v.rdNam.isSelected() ? "Nam" : "Nữ";

        return new Nhanvien(
                v.txtHoTen.getText(),
                v.txtNgaySinh.getText(),
                v.txtDiaChi.getText(),
                gt,
                v.cbPhongBan.getSelectedItem().toString(),
                v.txtHeSoLuong.getText(),
                v.txtThamNien.getText(),
                v.txtLuongCoBan.getText()
        );
    }

    // Thêm nhân viên
    public void addNhanvien() {
        Nhanvien nv = getEmployeeFromView();
        v.model.addRow(new Object[]{
            nv.getHoTen(), nv.getNgaySinh(), nv.getDiaChi(),
            nv.getGioiTinh(), nv.getPhongBan(), nv.getHeSoLuong(),
            nv.getThamNien(), nv.getLuongCoBan()
        });
    }
        // Sửa nhân viên
    public void editNhanvien() {
        if (selectedRow >= 0) {
            Nhanvien nv = getEmployeeFromView();

            v.model.setValueAt(nv.getHoTen(), selectedRow, 0);
            v.model.setValueAt(nv.getNgaySinh(), selectedRow, 1);
            v.model.setValueAt(nv.getDiaChi(), selectedRow, 2);
            v.model.setValueAt(nv.getGioiTinh(), selectedRow, 3);
            v.model.setValueAt(nv.getPhongBan(), selectedRow, 4);
            v.model.setValueAt(nv.getHeSoLuong(), selectedRow, 5);
            v.model.setValueAt(nv.getThamNien(), selectedRow, 6);
            v.model.setValueAt(nv.getLuongCoBan(), selectedRow, 7);
        }
    }
    // Xóa nhân viên
    public void deleteNhanvien() {
        if (selectedRow >= 0) {
            v.model.removeRow(selectedRow);
        }
    }

    // Lưu (thực chất là sửa)
    public void saveNhanvien() {
        editNhanvien();
    }
    // Load dữ liệu khi click vào bảng
    public void loadSelectedRow() {
        v.txtHoTen.setText(v.model.getValueAt(selectedRow, 0).toString());
        v.txtNgaySinh.setText(v.model.getValueAt(selectedRow, 1).toString());
        v.txtDiaChi.setText(v.model.getValueAt(selectedRow, 2).toString());

        String gt = v.model.getValueAt(selectedRow, 3).toString();
        if (gt.equals("Nam")) {
            v.rdNam.setSelected(true);
        } else {
            v.rdNu.setSelected(true);
        }

        v.cbPhongBan.setSelectedItem(v.model.getValueAt(selectedRow, 4).toString());
        v.txtHeSoLuong.setText(v.model.getValueAt(selectedRow, 5).toString());
        v.txtThamNien.setText(v.model.getValueAt(selectedRow, 6).toString());
        v.txtLuongCoBan.setText(v.model.getValueAt(selectedRow, 7).toString());
    }
        public class AddAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            addNhanvien();
        }
    }

    public class EditAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            editNhanvien();
        }
    }

    public class DeleteAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            deleteNhanvien();
        }
    }

    public class SaveAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveNhanvien();
        }
    }

    public class TableClickAction extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            selectedRow = v.table.getSelectedRow();
            loadSelectedRow();
        }
    }

    public static void main(String[] args) {
        new NhanvienCotroller();
    }

}
