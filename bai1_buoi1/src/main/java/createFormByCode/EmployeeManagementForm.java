package createFormByCode;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.event.TableModelEvent;

public class EmployeeManagementForm extends JFrame {

    int k = 0;
    private JTextField txtHoTen, txtNgaySinh, txtDiaChi, txtHeSoLuong, txtThamNien, txtLuongCoBan;
    private JRadioButton rdNam, rdNu;
    private JComboBox<String> cboPhongBan;

    private JTable table;
    private DefaultTableModel tableModel;

    private JButton btnThem, btnSua, btnLuu, btnXoa;

    public EmployeeManagementForm() {
        setTitle("Quản Lý Nhân Viên");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 650);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // PANEL FORM NHẬP LIỆU 
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.insets = new Insets(8, 20, 8, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int row = 0;

        addLabel("Họ Tên", formPanel, gbc, row, 0);
        txtHoTen = addTextField(formPanel, gbc, row++, 1);

        addLabel("Ngày Sinh", formPanel, gbc, row, 0);
        txtNgaySinh = addTextField(formPanel, gbc, row++, 1);

        addLabel("Địa Chỉ", formPanel, gbc, row, 0);
        txtDiaChi = addTextField(formPanel, gbc, row++, 1);

        addLabel("Giới Tính", formPanel, gbc, row, 0);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rdNam = new JRadioButton("Nam");
        rdNu = new JRadioButton("Nữ");
        ButtonGroup group = new ButtonGroup();
        group.add(rdNam);
        group.add(rdNu);
        genderPanel.add(rdNam);
        genderPanel.add(rdNu);
        gbc.gridx = 1;
        gbc.gridy = row++;
        formPanel.add(genderPanel, gbc);

        addLabel("Phòng Ban", formPanel, gbc, row, 0);
        cboPhongBan = new JComboBox<>(new String[]{"Kế Toán", "Hành Chính", "Nhân Sự", "IT"});
        gbc.gridx = 1;
        gbc.gridy = row++;
        formPanel.add(cboPhongBan, gbc);

        addLabel("Hệ số lương", formPanel, gbc, row, 0);
        txtHeSoLuong = addTextField(formPanel, gbc, row++, 1);

        addLabel("Thâm niên", formPanel, gbc, row, 0);
        txtThamNien = addTextField(formPanel, gbc, row++, 1);

        addLabel("Lương Cơ bản", formPanel, gbc, row, 0);
        txtLuongCoBan = addTextField(formPanel, gbc, row++, 1);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));

        btnThem = new JButton("Thêm");
        btnSua = new JButton("Sửa");
        btnLuu = new JButton("Lưu");
        btnXoa = new JButton("Xóa");

        buttonPanel.add(btnThem);
        buttonPanel.add(btnSua);
        buttonPanel.add(btnLuu);
        buttonPanel.add(btnXoa);

        // ===== BẢNG =====
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createTitledBorder(""));

        String[] columnNames = {"User", "Ngày sinh", "Địa chỉ", "Giới tính", "Phòng ban", "HSL", "Thâm niên", "Lương CB"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        tablePanel.add(new JScrollPane(table), BorderLayout.CENTER);

        // ===== GHÉP TẤT CẢ PANEL =====
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(formPanel, BorderLayout.NORTH);
        topPanel.add(buttonPanel, BorderLayout.CENTER);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(tablePanel, BorderLayout.CENTER);

        add(mainPanel);

        // ===== SỰ KIỆN =====
        btnThem.addActionListener(e -> themNhanVien());
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                k = table.getSelectedRow();
                int selectedRow = table.getSelectedRow();
                txtHoTen.setText(table.getValueAt(selectedRow, 0).toString());
                txtNgaySinh.setText(table.getValueAt(selectedRow, 1).toString());
                txtDiaChi.setText(table.getValueAt(selectedRow, 2).toString());

                String gioitinh = table.getValueAt(selectedRow, 3).toString();
                if (gioitinh.equals("Nam")) {
                    rdNam.setSelected(true);
                } else {
                    rdNu.setSelected(true);
                }

                cboPhongBan.setSelectedItem(table.getValueAt(selectedRow, 4));
                txtHeSoLuong.setText(tableModel.getValueAt(selectedRow, 5).toString());
                txtThamNien.setText(tableModel.getValueAt(selectedRow, 6).toString());
                txtLuongCoBan.setText(tableModel.getValueAt(selectedRow, 7).toString());

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

        });

        btnXoa.addActionListener(e -> xoaNhanVien());
        btnSua.addActionListener(e -> suanhanvien());
    }

    // ===================== HÀM DÙNG CHUNG ===================== //
    private void addLabel(String text, JPanel panel, GridBagConstraints gbc, int row, int col) {
        gbc.gridx = col;
        gbc.gridy = row;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(new JLabel(text), gbc);
    }

    private JTextField addTextField(JPanel panel, GridBagConstraints gbc, int row, int col) {
        gbc.gridx = col;
        gbc.gridy = row;
        JTextField txt = new JTextField(20);
        panel.add(txt, gbc);
        return txt;
    }

    // ===== CHỨC NĂNG =====
    private void themNhanVien() {
        String hoTen = txtHoTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        String diaChi = txtDiaChi.getText();
        String gioiTinh = rdNam.isSelected() ? "Nam" : "Nữ";
        String phongBan = cboPhongBan.getSelectedItem().toString();
        String heSoLuong = txtHeSoLuong.getText();
        String thamNien = txtThamNien.getText();
        String luongCoBan = txtLuongCoBan.getText();

        if (hoTen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên!");
            return;
        }

        tableModel.addRow(new Object[]{hoTen, ngaySinh, diaChi, gioiTinh, phongBan, heSoLuong, thamNien, luongCoBan});
        tableModel.fireTableDataChanged();
    }

    private void xoaNhanVien() {
        tableModel.removeRow(k);
    }

    private void suanhanvien() {
        int selectedRow = table.getSelectedRow();
        tableModel.setValueAt(txtHoTen.getText(), selectedRow, 0);
        tableModel.setValueAt(txtNgaySinh.getText(), selectedRow, 1);
        tableModel.setValueAt(txtDiaChi.getText(), selectedRow, 2);
        tableModel.setValueAt(rdNam.isSelected() ? "Nam" : "Nữ", selectedRow, 3);
        tableModel.setValueAt(cboPhongBan.getSelectedItem().toString(), selectedRow, 4);
        tableModel.setValueAt(txtHeSoLuong.getText(), selectedRow, 5);
        tableModel.setValueAt(txtThamNien.getText(), selectedRow, 6);
        tableModel.setValueAt(txtLuongCoBan.getText(), selectedRow, 7);

        javax.swing.JOptionPane.showMessageDialog(this, "sửa thành công");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeManagementForm().setVisible(true));
    }

}
