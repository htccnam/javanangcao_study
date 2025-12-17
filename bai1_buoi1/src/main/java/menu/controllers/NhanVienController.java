package menu.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import menu.views.FormQuanLyNhanVien;

public class NhanVienController {

    private FormQuanLyNhanVien form;

    public NhanVienController() {
        form = new FormQuanLyNhanVien();
        form.setVisible(true);
        form.buttonThemActionListener(new buttonThemActionPerfomed());
        form.tableNhanVienActionListener(new tableNhanVienActionPerformed());
        form.buttonSuaActionListener(new buttonSuaActionPerformed());
        form.buttonLuuActionListener(new buttonLuuActionPerformed());
        form.buttonXoaActionListener(new buttonXoaActionPerformed());
    }

    private class buttonThemActionPerfomed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String hoTen = form.textFieldHoTen.getText().trim();
            String ngaySinh = form.textFieldNgaySinh.getText().trim();
            String diaChi = form.textFieldDiaChi.getText().trim();
            String gioiTinh = form.radioButtonNam.isSelected() ? "Nam" : "Nữ";
            String phongBan = form.comboBoxPhongBan.getSelectedItem().toString().trim();
            String heSoLuong = form.textFieldHeSoLuong.getText().trim();
            String thamNien = form.textFieldThamNien.getText().trim();
            String luongCoBan = form.textFieldLuongCoBan.getText().trim();

            form.model.addRow(new Object[]{
                hoTen, ngaySinh, diaChi, gioiTinh, phongBan, heSoLuong, thamNien, luongCoBan
            });
            form.model.fireTableDataChanged();
        }
    }

    private class tableNhanVienActionPerformed implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            form.k = form.tableNhanVien.getSelectedRow();
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class buttonSuaActionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            form.textFieldHoTen.setText(form.tableNhanVien.getValueAt(form.k, 0).toString().trim());
            form.textFieldNgaySinh.setText(form.tableNhanVien.getValueAt(form.k, 1).toString().trim());
            form.textFieldDiaChi.setText(form.tableNhanVien.getValueAt(form.k, 2).toString().trim());
            if (form.tableNhanVien.getValueAt(form.k, 3).equals("Nam")) {
                form.radioButtonNam.setSelected(true);
            } else {
                form.radioButtonNu.setSelected(true);
            }
            form.comboBoxPhongBan.setSelectedItem(form.tableNhanVien.getValueAt(form.k, 4).toString().trim());
            form.textFieldHeSoLuong.setText(form.tableNhanVien.getValueAt(form.k, 5).toString().trim());
            form.textFieldThamNien.setText(form.tableNhanVien.getValueAt(form.k, 6).toString().trim());
            form.textFieldLuongCoBan.setText(form.tableNhanVien.getValueAt(form.k, 7).toString().trim());
        }
    }

    private class buttonLuuActionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String hoTen = form.textFieldHoTen.getText().trim();
            String ngaySinh = form.textFieldNgaySinh.getText().trim();
            String diaChi = form.textFieldDiaChi.getText().trim();
            String gioiTinh = form.radioButtonNam.isSelected() ? "Nam" : "Nữ";
            String phongBan = form.comboBoxPhongBan.getSelectedItem().toString().trim();
            String heSoLuong = form.textFieldHeSoLuong.getText().trim();
            String thamNien = form.textFieldThamNien.getText().trim();
            String luongCoBan = form.textFieldLuongCoBan.getText().trim();

            form.model.setValueAt(hoTen, form.k, 0);
            form.model.setValueAt(ngaySinh, form.k, 1);
            form.model.setValueAt(diaChi, form.k, 2);
            form.model.setValueAt(gioiTinh, form.k, 3);
            form.model.setValueAt(phongBan, form.k, 4);
            form.model.setValueAt(heSoLuong, form.k, 5);
            form.model.setValueAt(thamNien, form.k, 6);
            form.model.setValueAt(luongCoBan, form.k, 7);

            form.model.fireTableDataChanged();
        }
    }

    private class buttonXoaActionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            form.model.removeRow(form.k);
            form.model.fireTableDataChanged();
        }
    }

    public static void main(String[] args) {
        NhanVienController controller = new NhanVienController();
    }
}
