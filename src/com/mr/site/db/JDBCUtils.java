package com.mr.site.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mr.site.exception.DBException;

/**
 * 数据库工具类
 * 
 * @author gaohailong
 * @version 1.0
 * @date 2016.7.5
 */
public class JDBCUtils {
	private static DataSource dataSource = null;

	static {
		dataSource = new ComboPooledDataSource("siteColletion");
	}

	/**
	 * 连接数据库
	 * 
	 * @author gaohailong
	 * @return Connection 数据库连接对象
	 */
	public static Connection getConnetion() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("数据库连接异常");
		}
	}

	/**
	 * 关闭数据库
	 * 
	 * @author gaohailong
	 * @param connection
	 *            数据库连接对象
	 * @return void
	 */
	public static void release(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("关闭数据库错误");
		}
	}

	/**
	 * 关闭数据库
	 * 
	 * @author gaohailong
	 * @param resultSet  数据库连接对象
	 * @param statement  数据库连接对象
	 * @return void
	 */
	public static void release(ResultSet resultSet, Statement statement) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (Exception e) {
			throw new DBException("关闭数据库错误");
		}
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (Exception e) {
			throw new DBException("关闭数据库错误");
		}
	}
}
