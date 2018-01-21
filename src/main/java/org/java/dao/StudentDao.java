package org.java.dao;

import java.util.List;

import org.java.pojo.Student;


public interface StudentDao {
	/**
	 * 添加
	 * @param student
	 */
	void addStudent(Student student);
	/**
	 * 删除
	 * @param student
	 */
	void deleteStudent(Student student);
	/**
	 * 修改
	 * @param student
	 */
	void updateStudent(Student student);
	/**
	 * 根据学号查询
	 * @param id
	 * @return
	 */
	Student getById(Integer id);
	/**
	 * 查询所有
	 * @return
	 */
	List<Student> getStudents(String name);
}
