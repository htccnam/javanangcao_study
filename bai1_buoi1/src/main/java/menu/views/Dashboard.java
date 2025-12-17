package menu.views;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import menu.controllers.NhanVienController;
import menu.controllers.SinhVienController;

public class Dashboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem itemQLNV = new JMenuItem("QuanLyNhanVien");
        JMenuItem itemQLSV = new JMenuItem("QuanLySinhVien");
        menu.add(itemQLNV);
        menu.add(itemQLSV);
        menuBar.add(menu);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("QuanLyNhanVien")) {
                    NhanVienController controller = new NhanVienController();
                }
                if (e.getActionCommand().equals("QuanLySinhVien")) {
                    SinhVienController controller = new SinhVienController();
                }
            }
        };
        
        itemQLNV.addActionListener(listener);
        itemQLSV.addActionListener(listener);
        
        frame.add(menuBar);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
