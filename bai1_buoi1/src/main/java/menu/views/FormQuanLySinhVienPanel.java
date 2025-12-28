package menu.views;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FormQuanLySinhVienPanel extends JPanel {

    public int selectedRow = 0;
    public JTextField jtfMaSinhVien, jtfHoTen, jtfNgaySinh, jtfDiaChi, jtfEmail, jtfDiemTongKet;
    public JRadioButton jrbNam, jrbNu;
    public ButtonGroup groupGioiTinh;
    public JButton buttonThem, buttonSua, buttonLuu, buttonXoa, buttonClearCache;
    public DefaultTableModel tableModel;
    public JScrollPane scrollPane;
    public JTable tableSinhVien;

    public FormQuanLySinhVienPanel() {
        initComponents();
    }

    private void initComponents() {
        this.setSize(700, 600);
        this.setLayout(null);

        JLabel jlMaSinhVien = new JLabel("Mã sinh viên");
        jlMaSinhVien.setBounds(50, 30, 100, 30);
        jtfMaSinhVien = new JTextField();
        jtfMaSinhVien.setBounds(150, 30, 300, 30);
        this.add(jlMaSinhVien);
        this.add(jtfMaSinhVien);

        JLabel jlHoTen = new JLabel("Họ tên");
        jlHoTen.setBounds(50, 70, 100, 30);
        jtfHoTen = new JTextField();
        jtfHoTen.setBounds(150, 70, 300, 30);
        this.add(jlHoTen);
        this.add(jtfHoTen);

        JLabel labelNgaySinh = new JLabel("Ngày sinh");
        labelNgaySinh.setBounds(50, 110, 100, 30);
        jtfNgaySinh = new JTextField();
        jtfNgaySinh.setBounds(150, 110, 300, 30);
        this.add(labelNgaySinh);
        this.add(jtfNgaySinh);

        JLabel labelGioiTinh = new JLabel("Giới tính");
        labelGioiTinh.setBounds(50, 150, 100, 30);
        jrbNam = new JRadioButton("Nam");
        jrbNam.setSelected(true);
        jrbNam.setBounds(150, 150, 50, 30);
        jrbNu = new JRadioButton("Nữ");
        jrbNu.setBounds(200, 150, 50, 30);
        this.add(labelGioiTinh);
        this.add(jrbNam);
        this.add(jrbNu);

        groupGioiTinh = new ButtonGroup();
        groupGioiTinh.add(jrbNam);
        groupGioiTinh.add(jrbNu);

        JLabel labelDiaChi = new JLabel("Địa chỉ");
        labelDiaChi.setBounds(50, 190, 100, 30);
        jtfDiaChi = new JTextField();
        jtfDiaChi.setBounds(150, 190, 300, 30);
        this.add(labelDiaChi);
        this.add(jtfDiaChi);

        JLabel labelEmail = new JLabel("eMail");
        labelEmail.setBounds(50, 230, 100, 30);
        jtfEmail = new JTextField();
        jtfEmail.setBounds(150, 230, 300, 30);
        this.add(labelEmail);
        this.add(jtfEmail);

        JLabel labelDiemTongKet = new JLabel("Điểm tổng kết");
        labelDiemTongKet.setBounds(50, 270, 100, 30);
        jtfDiemTongKet = new JTextField();
        jtfDiemTongKet.setBounds(150, 270, 300, 30);
        this.add(labelDiemTongKet);
        this.add(jtfDiemTongKet);

        buttonThem = new JButton("Thêm");
        buttonThem.setBounds(50, 320, 80, 30);
        this.add(buttonThem);

        buttonSua = new JButton("Sửa");
        buttonSua.setBounds(140, 320, 80, 30);
        this.add(buttonSua);

        buttonLuu = new JButton("Lưu");
        buttonLuu.setBounds(230, 320, 80, 30);
        this.add(buttonLuu);

        buttonXoa = new JButton("Xoá");
        buttonXoa.setBounds(320, 320, 80, 30);
        this.add(buttonXoa);

        buttonClearCache = new JButton("Xoá bộ đệm");
        buttonClearCache.setBounds(410, 320, 100, 30);
        this.add(buttonClearCache);

        String[] columns = {"Mã sinh viên", "Họ tên", "Ngày sinh", "Giới tính", "Địa chỉ", "eMail", "Điểm tổng kết"};
        tableModel = new DefaultTableModel(null, columns);
        tableSinhVien = new JTable(tableModel);
        scrollPane = new JScrollPane(tableSinhVien);
        scrollPane.setBounds(20, 380, 640, 150);
        this.add(scrollPane);
    }
    
    public void buttonThemActionListener(ActionListener l) {
        buttonThem.addActionListener(l);
    }
    
    public void tableSinhVienMouseListener(MouseListener l) {
        tableSinhVien.addMouseListener(l);
    }
    
    public void buttonSuaActionListener(ActionListener l) {
        buttonSua.addActionListener(l);
    }
    
    public void buttonLuuActionListener(ActionListener l) {
        buttonLuu.addActionListener(l);
    }
    
    public void buttonXoaActionListener(ActionListener l) {
        buttonXoa.addActionListener(l);
    }
    
    public void buttonClearCacheActionListener(ActionListener l) {
        buttonClearCache.addActionListener(l);
    }
}
