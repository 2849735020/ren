package org.ssh.service;

import java.util.List;

import org.ssh.pojo.Emp;

public interface EmpService {

	List<Emp> selectAll(String sql,Emp emp);
}
