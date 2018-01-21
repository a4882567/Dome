package org.java.service.impl;

import java.util.List;

import org.java.dao.StudentDao;
import org.java.pojo.Student;
import org.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	@Override
	public Student getById(Integer id) {
		return studentDao.getById(id);
	}

	@Override
	public List<Student> getStudents(String name) {
		if(name == null){
			name = "";
		}
		return studentDao.getStudents(name);
	}

}
