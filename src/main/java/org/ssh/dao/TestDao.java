package org.ssh.dao;

import java.util.List;

public interface TestDao<T> {
	 List<T> selectAll(String hql);/*��ѯ����*/
	 void delete(T t);/*ɾ��*/
	 void update(T t);/*�޸�*/
	 void insert(T t);/*���*/
	 List<T> selectAllBySql(String sql,T t);/*������ѯ����*/
	

}
