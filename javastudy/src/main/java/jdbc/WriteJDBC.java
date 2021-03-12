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
import java.sql.Statement;

/**
 * @author yjl
 * @version $Id: WriteJDBC.java, v 0.1 2021-03-09 17:06 yjl Exp $$
 */
public class WriteJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF8";
    private static final String name = "root";
    private static final String password = "123456";

    private static Connection conn = null;
    //private static PreparedStatement ps = null;
    //private static Statement st = null;
    //private static ResultSet rs = null;


    static {
        try {
            // 1、注册加载JDBC数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2、获得数据库的连接
            conn = DriverManager.getConnection(URL, name, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

    }

    private static void test1() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("select * from test");
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
            }
            rs.close();
            ps.close();
        } catch (SQLException throwables) {

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }

    private static void test2(){
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from test");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}