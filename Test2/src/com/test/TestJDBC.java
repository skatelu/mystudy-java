package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class TestJDBC {

	public static SimpleDateFormat FMT_YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static Connection con;
	private static String zzlxdm = "111000000000131433001";
	private static String versionNumber = "001";
	
	//需要修改
	private static String blank_file="/ofd_file/ofd_data/temp_2";
    private static String sign_file ="/ofd_file/ofd_data/temp_2";
    private static String table_name ="cert_jhz_38";
    private static int begin =47000000;
    private static int end = 48000000;
    
//	/ofd_file/ofd_data/temp_1
//	/ofd_file/ofd_data/temp_2
//	/ofd_file/ofd_data/temp_3
//	/ofd_file/ofd_data/temp_4
//	/ofd_file/ofd_data/temp_5
	
	public static void main(String[] args) {


		int j = 0;
		for(int i = begin; i<end; i+=10000) {
			j = i+9999;
			System.out.println(i+" "+j);
			updateTest( i,  j);
		}



	}

	public static void updateTest(int idstart, int idend) {

		// 创建一个数据库连接
		Connection conn = null;
		// 创建预编译语句对象
		PreparedStatement pstm = null;
		Statement stmtt = null;

		// 创建一个结果集对象
		ResultSet rs = null;
		String s = "";
		String cert_number = "";
		try {

			// 创建数据连接
			conn = getConnection();
			// 关闭自动提交，即开启事务
			conn.setAutoCommit(false);

			// 查询
			String sql1 = "select id,extendinfo from "+table_name+ "  where id >= " + idstart 
					+ " and id <" + (idend+1)+ " and  cert_identifier = '' ";

			stmtt = conn.createStatement();
			rs = stmtt.executeQuery(sql1);

			
			
			// 执行
			String sql2 = "update "+table_name+ " set cert_number=?,cert_identifier = ?,blank_file=?,sign_file=? "
					+ " where id = ?";
			pstm = conn.prepareStatement(sql2);
			int i = 0;
			while (rs.next()) {
				i = rs.getInt("id");
				cert_number = getRandomChar();
				s = getCertIdentifier( zzlxdm, rs.getString("extendinfo"), cert_number, versionNumber);
				if(s != null) {
					pstm.setString(1, cert_number);
					pstm.setString(2, s);
					pstm.setString(3, blank_file);
					pstm.setString(4, sign_file);
					pstm.setInt(5, i);
					// 添加批处理SQL
					pstm.addBatch();
					// 每1000条执行一次，避免内存不够的情况
					
					if (i > 0 && i % 1000 == 0) {
						pstm.executeBatch();
						if(i == idstart) {
							System.out.println(FMT_YYYY_MM_DD_HH_MM_SS.format(System.currentTimeMillis()) + " 开始执行！" + i);
							
						}else {
							System.out.println(FMT_YYYY_MM_DD_HH_MM_SS.format(System.currentTimeMillis()) + " 已经执行！" + i);
							
						}
						
						// 执行完后，手动提交事务
						conn.commit();
					}
				}
			}

			// 不足1000条
			pstm.executeBatch();
			pstm.close();
			// 执行完后，手动提交事务
			conn.commit();
			System.out.println(FMT_YYYY_MM_DD_HH_MM_SS.format(System.currentTimeMillis()) + " 已经执行结束" + i);
			
			// 在把自动提交打开
			conn.setAutoCommit(true);
			
		} catch (Exception e) {

			try {
				// 发生异常，事务回滚！
				if (conn != null && !conn.isClosed()) {
					conn.rollback();
					conn.setAutoCommit(true);
					System.out.println("更新失败，事务回滚！");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmtt != null) {
				try {
					stmtt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://10.210.2.209:3306/certextraction?characterEncoding=UTF-8",
					"quanmin110", "quanmin110.com");
			//System.out.println("数据库连接成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	 
    /**
     * 获取UUID
     * @return 32位UUID
     */
    public static String getRandomChar(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        return uuid;
    }



   /**
     * 获取电子证照标识
     * @param zzlxdm 证照类型代码 长度21位
     * @param zzbfjgdm 证照颁发机构代码 长度18位
     * @param certNumber 流水号（证照编号）
     * @param versionNumber 版本号 3位阿拉伯数字
     * @return
     */
    public static String getCertIdentifier(String zzlxdm,String zzbfjgdm,String certNumber,String versionNumber) {
       // log.info("获取电子证照标识参数：zzlxdm={},zzbfjgdm={},certNumber={},versionNumber={}",zzlxdm,zzbfjgdm,certNumber,versionNumber);
//        if(StringUtils.isBlank(zzlxdm) || StringUtils.isBlank(zzbfjgdm) || StringUtils.isBlank(certNumber) || StringUtils.isBlank(versionNumber)){
//            //log.info("获取电子证照标识结束，参数为空");
//            return null;
       // }
        if(zzlxdm == null || "".equals(zzlxdm)) {
        	 return null;
        }

        if(zzbfjgdm == null || "".equals(zzbfjgdm)) {
       	 return null;
       }
        if(certNumber == null || "".equals(certNumber)) {
       	 return null;
       }
        if(versionNumber == null || "".equals(versionNumber)) {
          	 return null;
         }
        
        String oid = "1.2.156.3005.2"; //根代码
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String reckoningStr = zzlxdm.concat(zzbfjgdm).concat(certNumber).concat(versionNumber);
        //log.info("待计算校验位的字符串：reckoningStr={}",reckoningStr);
        Integer X = null; //校验位
        int M = 36;
        int P = 0; //递归结算结果
        // 1.将待计算校验位的字符串进行递归计算
        for(int i=0;i<reckoningStr.length();i++){
            String strVal = String.valueOf(reckoningStr.charAt(i));
            int ai = 0;
            if(strVal.matches("[A-Z]+")){
                ai = str.indexOf(strVal) + 1;
            }else {
                ai = Integer.valueOf(strVal);
            }

            int R1,R2,R3;
            if(i == 0){
                R1 = M + ai;
            }else {
                R1 = P + ai;
            }
            if(ai > 10 && R1 > (M + 1)){
                R1 = R1 % (M + 1);
            }else if(ai < 10 && R1 > M){
                R1 = R1 % M;
            }

            R2 = R1 % M == 0 ? 36 : R1 % M;
            R3 = R2 * 2;
            P = R3 % (M + 1);
        }

       // log.info("递归结算结果:P={}",P);

        //2.计算校验位X，应满足满足公式 (P + X - 1) % M =0
        int N = 0;
        X = M * (N + 1) - P + 1;
        while (X < 1){
            X = M * (N++ + 1) - P + 1;
            if(X >= 1 && X <= M){
                break;
            }
        }

      //  log.info("最终校验位：X={}",X);

        // 电子证照标识结构：电子证照根代码 + "." + 证照类型代码 + "." + 证照颁发机构代码 + "." + 流水号 + "." + 版本号 + "." + 校验位
        String result = oid + "." + zzlxdm + "." + zzbfjgdm + "." + certNumber + "." + versionNumber + "." + str.charAt(X - 1);
       // log.info("获取电子证照标识成功：result={}",result);
        return result;
    }

}
