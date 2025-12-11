/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapketnoidatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class ketnoi {

    public static void main(String[] args) throws SQLException { //cần khai báo 
//        BƯỚC 1: NẠP DRIVER (Java< 6)
//Class.forName("com.mysql.cj.jdbc.Driver");
//        BƯỚC 2: TẠO CONNECTION
//        DriverManager.getConnection(url, user, pass);
//        BƯỚC 3: TẠO STATEMENT
//        Statement st = conn.createStatement();
//        BƯỚC 4: THỰC THI QUERY ResultSet rs = st.executeQuery("SELECT ...");
//        BƯỚC 5: XỬ LÝ KẾT QUẢ
//        while (rs.next()) {
//            rs.getString("column");
//        }
//        BƯỚC 6: ĐÓNG KẾT NỐI(hoặc dùng try -with - resources
//            )
//rs.close();
//            st.close();
//            conn.close();
            Connection con = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/ql_tai_khoan";
                String user = "root";
                String pass = "";
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Connection");
                Statement st = con.createStatement();
                ResultSet rec = st.executeQuery("SELECT * FROM tai_khoan");
                while (rec.next()) {
                    System.out.println(rec.getString("username") + "\t" + rec.getString("password"));

                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("loi ket noi data base");
            }
        }

    }
