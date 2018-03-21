package org.ssh.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssh.pojo.Emp;
import org.ssh.service.EmpService;

@Controller
public class EmpController {
	
	@Resource
	private EmpService es;

	@RequestMapping("/list")
	public String fn() {
		String sql = "select * from emp ";
		List<Emp> el = es.selectAll(sql, new Emp());
		System.err.println(el);
		return "list";
	}
}
