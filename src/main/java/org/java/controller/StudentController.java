package org.java.controller;

import java.util.List;

import org.java.pojo.Student;
import org.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	/**
	 * 跳转到显示页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/show",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView show(String name) throws Exception{
		List<Student> list = studentService.getStudents(name);
		return new ModelAndView("show", "list", list);
	}
	
	/**
	 * 跳转到显示页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toadd")
	public ModelAndView toadd() throws Exception{
		return new ModelAndView("add");
	}
	
	/**
	 * 添加
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/add")
	public String add(Student student) throws Exception{
		studentService.addStudent(student);
		return "redirect:show";
	}
	
	/**
	 * 跳转到修改
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toupdate/{id}")
	public ModelAndView toupdate(@PathVariable("id") Integer id) throws Exception{
		Student student = studentService.getById(id);
		return new ModelAndView("update","student",student);
	}
	
	/**
	 * 修改
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/update")
	public String update(Student student) throws Exception{
		studentService.updateStudent(student);
		return "redirect:show";
	}
}
