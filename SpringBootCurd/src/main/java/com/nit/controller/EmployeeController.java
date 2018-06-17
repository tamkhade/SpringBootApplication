package com.nit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.dao.EmployeeDao;
import com.nit.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;

	@GetMapping(value = { "/", "addEmp" })
	public String getDetails(Model model) {
		model.addAttribute("emp", new Employee());
		return "index";
	}

	@PostMapping("saveData")
	public String saveData(@ModelAttribute("emp") Employee emp) {
		System.out.println(emp);
		dao.save(emp);
		return "index";
	}

	@GetMapping("viewAll")
	public String viewAll(ModelMap map) 
	{
		List<Employee> empList = new ArrayList<Employee>();
		for (Employee e : dao.findAll()) {
			empList.add(e);
		}
		map.addAttribute("empList", empList);
		return "ViewEmps";
	}

	@GetMapping("delete")
	public String deleteEmp(@RequestParam int empId) 
	{
		dao.delete(empId);
		return "redirect:viewAll";
	}

	@GetMapping("edit")
	public String goEditPage(@RequestParam int empId, ModelMap map)
	{
		Employee e = dao.findOne(empId);
		map.addAttribute("emp", e);
		return "addEmpForm";
	}
}
