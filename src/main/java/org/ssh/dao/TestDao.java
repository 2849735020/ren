package org.ssh.dao;

import java.util.List;

public interface TestDao<T> {
	 List<T> selectAll(String hql);/*查询所有*/
	 void delete(T t);/*删除*/
	 void update(T t);/*修改*/
	 void insert(T t);/*添加*/
	 List<T> selectAllBySql(String sql,T t);/*条件查询所有*/
	

}
