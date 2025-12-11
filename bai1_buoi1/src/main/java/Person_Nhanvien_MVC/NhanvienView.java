/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person_Nhanvien_MVC;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class NhanvienView extends JFrame {
    public JTextField txtHoTen, txtNgaySinh, txtDiaChi, txtHeSoLuong, txtThamNien, txtLuongCoBan;
    public JRadioButton rdNam, rdNu;
    public JComboBox<String> cbPhongBan;
    public JButton btnThem, btnSua, btnXoa, btnLuu;
    public JTable table;
    public DefaultTableModel model;

    public NhanvienView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        setTitle("Quan Ly Nhan Vien");
        setSize(720,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel lbHT= new JLabel("Ho Ten ");
        lbHT.setBounds(150,30,100,30);
        add(lbHT);
        
        JLabel lbNS=new JLabel("Ngay Sinh ");
        lbNS.setBounds(150,70,100,30);
        add(lbNS);
        
        JLabel lbDC =new JLabel("Dia Chi ");
        lbDC.setBounds(150,110,100,30);
        add(lbDC);
        
        JLabel lbGT =new JLabel("Gioi Tinh ");
        lbGT.setBounds(150,150,100,30);
        add(lbGT);
        
        JLabel lbPB =new JLabel("Phong Ban ");
        lbPB.setBounds(150,190,100,30);
        add(lbPB);
        
        JLabel lbHSL=new JLabel("He So Luong ");
        lbHSL.setBounds(150,230,100,30);
        add(lbHSL);
        
        JLabel lbTN= new JLabel("Tham Nien ");
        lbTN.setBounds(150,270,100,30);
        add(lbTN);
        
        JLabel lbLCB=new JLabel("Luong Co Ban ");
        lbLCB.setBounds(150,310,100,30);
        add(lbLCB);
        
        txtHoTen = new JTextField();
        txtHoTen.setBounds(300,30,170,30);
        add(txtHoTen);
        
                txtNgaySinh = new JTextField();
        txtNgaySinh.setBounds(300, 70, 170, 30);
        add(txtNgaySinh);

        txtDiaChi = new JTextField();
        txtDiaChi.setBounds(300, 110, 170, 30);
        add(txtDiaChi);

        rdNam = new JRadioButton("Nam");
        rdNam.setBounds(300, 150, 70, 30);

        rdNu = new JRadioButton("Nữ");
        rdNu.setBounds(400, 150, 70, 30);

        ButtonGroup groupSex = new ButtonGroup();
        groupSex.add(rdNam);
        groupSex.add(rdNu);
        rdNam.setSelected(true);

        add(rdNam);
        add(rdNu);

        cbPhongBan = new JComboBox<>(new String[]{"Kế Toán", "Nhân Sự", "Kỹ Thuật", "Bán Hàng"});
        cbPhongBan.setBounds(300, 190, 170, 30);
        add(cbPhongBan);

        txtHeSoLuong = new JTextField();
        txtHeSoLuong.setBounds(300, 230, 170, 30);
        add(txtHeSoLuong);

        txtThamNien = new JTextField();
        txtThamNien.setBounds(300, 270, 170, 30);
        add(txtThamNien);

        txtLuongCoBan = new JTextField();
        txtLuongCoBan.setBounds(300, 310, 170, 30);
        add(txtLuongCoBan);

        btnThem = new JButton("Thêm");
        btnThem.setBounds(200, 350, 110, 30);
        add(btnThem);

        btnSua = new JButton("Sửa");
        btnSua.setBounds(300, 350, 110, 30);
        add(btnSua);

        btnXoa = new JButton("Xóa");
        btnXoa.setBounds(400, 350, 110, 30);
        add(btnXoa);

        btnLuu = new JButton("Lưu");
        btnLuu.setBounds(500, 350, 110, 30);
        add(btnLuu);

        String[] columnNames = {
            "User", "Ngày sinh", "Địa chỉ", "Giới tính",
            "Phòng ban", "HSL", "Thâm niên", "Lương CB"
        };

        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(30, 390, 650, 200);
        add(sp);

    }
    
    public void addAddListener(ActionListener l){
        btnThem.addActionListener(l);
    }
    
    public void addEditListener(ActionListener l){
        btnSua.addActionListener(l);
    }
    
    public void addDeleteListener(ActionListener l){
        btnXoa.addActionListener(l);
    }
    
    public void addSaveListener(ActionListener l){
        btnLuu.addActionListener(l);
    }
    
    public void addTableClickListener(MouseAdapter l){
        table.addMouseListener(l);
    }
    
}
