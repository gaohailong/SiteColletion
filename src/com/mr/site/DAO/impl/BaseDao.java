package com.mr.site.DAO.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mr.site.DAO.DAO;
import com.mr.site.db.JDBCUtils;
import com.mr.site.utils.ReflectionUtils;

public class BaseDao<T> implements DAO<T> {
	private QueryRunner queryRunner = new QueryRunner();
	private Class<T> clazz;

	public BaseDao() {
		clazz = ReflectionUtils.getSuperGenericType(getClass());
	}

	@Override
	public long insert(String sql, Object... objects) {
		/*Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = JDBCUtils.getConnetion();
			preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			if (objects != null) {
				for (int i = 0; i < objects.length; i++) {
					preparedStatement.setObject(i + 1, objects[i]);
				}
			}
			preparedStatement.executeUpdate();
			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
				id = resultSet.getLong(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCUtils.release(connection);
		} finally {
			JDBCUtils.release(resultSet, preparedStatement);
		}*/
		return 0;
	}

	@Override
	public void update(String sql, Object... objects) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnetion();
			queryRunner.update(connection, sql, objects);
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCUtils.release(connection);
		}
	}

	@Override
	public T query(String sql, Object... args) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnetion();
			return queryRunner.query(connection, sql, new BeanHandler<>(clazz), args);
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCUtils.release(connection);
		}
		return null;
	}

	@Override
	public void delete(String sql, Object... objects) {

	}

	@Override
	public List<T> queryForList(String sql, Object... args) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnetion();
			return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), args);
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCUtils.release(connection);
		}
		return null;
	}

	@Override
	public void insertNoReturn(String sql, Object... objects) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnetion();
			queryRunner.update(connection, sql, objects);
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCUtils.release(connection);
		}
	}

}
