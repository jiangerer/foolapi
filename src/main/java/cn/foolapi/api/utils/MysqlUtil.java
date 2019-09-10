package cn.foolapi.api.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

public class MysqlUtil {
	private static String DB_URL;
	private static String JDBC_DRIVER;
	private static String USER;
	private static String PASSWORD;
	public List getListData() {
		return null;
	}
	public Map getFirstData() {
		return null;
	}
	public String getOnlyData() {
		return null;
	}
	
	private Connection getcon() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// 注册 JDBC 驱动
			Class.forName(JDBC_DRIVER);

			// 打开链接
			System.out.println("连接数据库...");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

			return conn;

		} catch (SQLException e) {
			ReportUtil.log("sql error:" + e.getMessage());
			return null;
		} catch (ClassNotFoundException e) {
			ReportUtil.log("sql error:" + e.getMessage());
			return null;
		}
	}
	

}