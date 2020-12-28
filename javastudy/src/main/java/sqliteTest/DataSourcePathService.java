/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package sqliteTest;

import jdk.nashorn.api.scripting.ScriptUtils;
import sun.font.ScriptRun;

import java.sql.*;

/**
 * @author wb-yjl790595
 * @version DataSourcePathService.java, v 0.1 2020-07-30 15:05 wb-yjl790595 Exp $$
 */

public class DataSourcePathService {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        String db = "D:\\sqlite\\db\\test.db";
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + db);
//        new ScriptRunner();
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery("select * from test1;"); //查询数据
        while (rs.next()) { //将查询到的数据打印出来
            System.out.print("name = " + rs.getString("name") + " "); //列属性一
            System.out.println("context = " + rs.getString("context")); //列属性二
        }
        rs.close();
        conn.close();
    }

}