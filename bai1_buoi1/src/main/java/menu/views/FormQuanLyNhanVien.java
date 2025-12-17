package menu.views;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormQuanLyNhanVien extends JFrame {

    public int k = 0;
    public JTextField textFieldHoTen, textFieldNgaySinh, textFieldDiaChi ,textFieldHeSoLuong, textFieldThamNien, textFieldLuongCoBan;
    public JRadioButton radioButtonNam, radioButtonNu;
    public ButtonGroup buttonGroupGioiTinh;
    public JComboBox<String> comboBoxPhongBan;
    public JButton buttonThem, buttonSua, buttonLuu, buttonXoa;
    public JTable tableNhanVien;
    public JScrollPane scrollPane;
    public DefaultTableModel model;

    public FormQuanLyNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        setTitle("Quản Lý Nhân Viên");
        setSize(700, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblHoTen = new JLabel("Họ tên");
        lblHoTen.setBounds(50, 30, 100, 30);
        add(lblHoTen);

        textFieldHoTen = new JTextField();
        textFieldHoTen.setBounds(150, 30, 300, 30);
        add(textFieldHoTen);

        JLabel lblNgaySinh = new JLabel("Ngày sinh");
        lblNgaySinh.setBounds(50, 70, 100, 30);
        add(lblNgaySinh);

        textFieldNgaySinh = new JTextField();
        textFieldNgaySinh.setBounds(150, 70, 300, 30);
        add(textFieldNgaySinh);

        JLabel lblDiaChi = new JLabel("Địa chỉ");
        lblDiaChi.setBounds(50, 110, 100, 30);
        add(lblDiaChi);

        textFieldDiaChi = new JTextField();
        textFieldDiaChi.setBounds(150, 110, 300, 30);
        add(textFieldDiaChi);

        JLabel lblGioiTinh = new JLabel("Giới tính");
        lblGioiTinh.setBounds(50, 150, 100, 30);
        add(lblGioiTinh);

        radioButtonNam = new JRadioButton("Nam");
        radioButtonNam.setBounds(150, 150, 70, 30);
        radioButtonNam.setSelected(true);
        add(radioButtonNam);

        radioButtonNu = new JRadioButton("Nữ");
        radioButtonNu.setBounds(230, 150, 70, 30);
        add(radioButtonNu);

        buttonGroupGioiTinh = new ButtonGroup();
        buttonGroupGioiTinh.add(radioButtonNam);
        buttonGroupGioiTinh.add(radioButtonNu);

        JLabel lblPhongBan = new JLabel("Phòng ban");
        lblPhongBan.setBounds(50, 190, 100, 30);
        add(lblPhongBan);

        String[] dsPhongBan = {"Kế toán", "Nhân sự", "Kỹ thuật", "Kinh doanh"};
        comboBoxPhongBan = new JComboBox<>(dsPhongBan);
        comboBoxPhongBan.setBounds(150, 190, 300, 30);
        add(comboBoxPhongBan);

        JLabel lblHSL = new JLabel("Hệ số lương");
        lblHSL.setBounds(50, 230, 100, 30);
        add(lblHSL);

        textFieldHeSoLuong = new JTextField();
        textFieldHeSoLuong.setBounds(150, 230, 300, 30);
        add(textFieldHeSoLuong);

        JLabel lblThamNien = new JLabel("Thâm niên");
        lblThamNien.setBounds(50, 270, 100, 30);
        add(lblThamNien);

        textFieldThamNien = new JTextField();
        textFieldThamNien.setBounds(150, 270, 300, 30);
        add(textFieldThamNien);

        JLabel lblLuongCB = new JLabel("Lương cơ bản");
        lblLuongCB.setBounds(50, 310, 100, 30);
        add(lblLuongCB);

        textFieldLuongCoBan = new JTextField();
        textFieldLuongCoBan.setBounds(150, 310, 300, 30);
        add(textFieldLuongCoBan);

        buttonThem = new JButton("Thêm");
        buttonThem.setBounds(50, 360, 100, 30);
        add(buttonThem);

        buttonSua = new JButton("Sửa");
        buttonSua.setBounds(170, 360, 100, 30);
        add(buttonSua);

        buttonLuu = new JButton("Lưu");
        buttonLuu.setBounds(290, 360, 100, 30);
        buttonLuu.addActionListener((e) -> {
            String hoTen = textFieldHoTen.getText().trim();
            String ngaySinh = textFieldNgaySinh.getText().trim();
            String diaChi = textFieldDiaChi.getText().trim();
            String gioiTinh = radioButtonNam.isSelected() ? "Nam" : "Nữ";
            String phongBan = comboBoxPhongBan.getSelectedItem().toString().trim();
            String heSoLuong = textFieldHeSoLuong.getText().trim();
            String thamNien = textFieldThamNien.getText().trim();
            String luongCoBan = textFieldLuongCoBan.getText().trim();
            model.setValueAt(hoTen, k, 0);
            model.setValueAt(ngaySinh, k, 1);
            model.setValueAt(diaChi, k, 2);
            model.setValueAt(gioiTinh, k, 3);
            model.setValueAt(phongBan, k, 4);
            model.setValueAt(heSoLuong, k, 5);
            model.setValueAt(thamNien, k, 6);
            model.setValueAt(luongCoBan, k, 7);
        });
        add(buttonLuu);

        buttonXoa = new JButton("Xóa");
        buttonXoa.setBounds(410, 360, 100, 30);
        add(buttonXoa);

        String[] columns = {"Họ tên", "Ngày sinh", "Địa chỉ", "Giới tính", "Phòng ban", "HSL", "Thâm niên", "Lương CB"};
        model = new DefaultTableModel(null, columns);

        tableNhanVien = new JTable(model);

        scrollPane = new JScrollPane(tableNhanVien);
        scrollPane.setBounds(20, 410, 640, 180);
        add(scrollPane);
    }

    public void buttonThemActionListener(ActionListener a) {
        buttonThem.addActionListener(a);
    }

    public void tableNhanVienActionListener(MouseListener l) {
        tableNhanVien.addMouseListener(l);
    }
    
    public void buttonSuaActionListener(ActionListener a) {
        buttonSua.addActionListener(a);
    }

    public void buttonLuuActionListener(ActionListener a) {
        buttonLuu.addActionListener(a);
    }

    public void buttonXoaActionListener(ActionListener a) {
        buttonXoa.addActionListener(a);
    }
}
