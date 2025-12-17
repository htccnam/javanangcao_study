package menu.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import menu.views.FormQuanLySinhVien;

public class SinhVienController{
    private FormQuanLySinhVien form;

    public SinhVienController() {
        form = new FormQuanLySinhVien();
        form.setVisible(true);
        form.buttonThemActionListener(new buttonThemActionPerformed());
        form.tableSinhVienMouseListener(new tableSinhVienActionPerformed());
        form.buttonSuaActionListener(new buttonSuaActionPerformed());
        form.buttonLuuActionListener(new buttonLuuActionPerformed());
        form.buttonXoaActionListener(new buttonXoaActionPerformed());
        form.buttonClearCacheActionListener(new buttonClearCacheActionPerformed());
    }
    
    private class buttonThemActionPerformed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String maSinhVien = form.jtfMaSinhVien.getText().trim();
            String hoTen = form.jtfHoTen.getText().trim();
            String ngaySinh = form.jtfNgaySinh.getText().trim();
            String gioiTinh = form.jrbNam.isSelected() ? "Nam" : "Nữ";
            String diaChi = form.jtfDiaChi.getText().trim();
            String email = form.jtfEmail.getText().trim();
            String diemTongKet = form.jtfDiemTongKet.getText().trim();
            form.tableModel.addRow(new Object[]{maSinhVien, hoTen, ngaySinh, gioiTinh, diaChi, email, diemTongKet});
            form.tableModel.fireTableDataChanged();
        }
    }
    
    private class tableSinhVienActionPerformed implements MouseListener{

        @Override
            public void mouseClicked(MouseEvent e) {
                form.selectedRow = form.tableSinhVien.getSelectedRow();
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
    
    private class buttonSuaActionPerformed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String maSinhVien = form.jtfMaSinhVien.getText().trim();
            String hoTen = form.jtfHoTen.getText().trim();
            String ngaySinh = form.jtfNgaySinh.getText().trim();
            String gioiTinh = form.jrbNam.isSelected() ? "Nam" : "Nữ";
            String diaChi = form.jtfDiaChi.getText().trim();
            String email = form.jtfEmail.getText().trim();
            String diemTongKet = form.jtfDiemTongKet.getText().trim();
            form.tableModel.addRow(new Object[]{maSinhVien, hoTen, ngaySinh, gioiTinh, diaChi, email, diemTongKet});
            form.tableModel.fireTableDataChanged();
        }
    }
    
    private class buttonLuuActionPerformed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String maSinhVien = form.jtfMaSinhVien.getText().trim();
            String hoTen = form.jtfHoTen.getText().trim();
            String ngaySinh = form.jtfNgaySinh.getText().trim();
            String gioiTinh = form.jrbNam.isSelected() ? "Nam" : "Nữ";
            String diaChi = form.jtfDiaChi.getText().trim();
            String email = form.jtfEmail.getText().trim();
            String diemTongKet = form.jtfDiemTongKet.getText().trim();
            form.tableSinhVien.setValueAt(maSinhVien, form.selectedRow, 0);
            form.tableSinhVien.setValueAt(hoTen, form.selectedRow, 1);
            form.tableSinhVien.setValueAt(ngaySinh, form.selectedRow, 2);
            form.tableSinhVien.setValueAt(gioiTinh, form.selectedRow, 3);
            form.tableSinhVien.setValueAt(diaChi, form.selectedRow, 4);
            form.tableSinhVien.setValueAt(email, form.selectedRow, 5);
            form.tableSinhVien.setValueAt(diemTongKet, form.selectedRow, 6);
        }
    }
    
    private class buttonXoaActionPerformed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            form.tableModel.removeRow(form.selectedRow);
            form.tableModel.fireTableDataChanged();
            form.tableModel.fireTableDataChanged();
        }
    }
    
    private class buttonClearCacheActionPerformed implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            form.jtfMaSinhVien.setText("");
            form.jtfHoTen.setText("");
            form.jtfNgaySinh.setText("");
            form.jrbNam.setSelected(true);
            form.jtfDiaChi.setText("");
            form.jtfEmail.setText("");
            form.jtfDiemTongKet.setText("");
        }
    }
    
    public static void main(String[] args) {
        SinhVienController controller = new SinhVienController();
    }
}
