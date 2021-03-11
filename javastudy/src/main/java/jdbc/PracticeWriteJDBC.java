/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author yjl
 * @version $Id: PracticeWriteJDBC.java, v 0.1 2021-03-10 10:02 yjl Exp $$
 */
public class PracticeWriteJDBC {

    private static String URL
        = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF8";
    private static String name = "root";
    private static String password = "123456";

    private static Connection conn;

    static {
        try {
            //1、 加载注册jdbc的驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2、创建数据库连接
            conn = DriverManager.getConnection(URL, name, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test1();
    }

    private static void test1(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("select * from test where a = ? and b = ?;");
            ps.setString(1, "a");
            ps.setString(2, "b");
            rs = ps.executeQuery();
            while (rs.next()) {
                rs.getString("name");
            }
            rs.close();
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public static void closeConn(){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}