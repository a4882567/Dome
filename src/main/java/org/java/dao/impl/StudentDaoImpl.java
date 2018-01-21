package org.java.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.java.dao.StudentDao;
import org.java.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
	}

	@Override
	public void deleteStudent(Student student) {
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
	}

	@Override
	public Student getById(Integer id) {
		return entityManager.find(Student.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents(String name) {
		Query query = entityManager.createQuery("select s from Student s where s.name like ?1");
		query.setParameter(1, "%" + name + "%");
		return query.getResultList();
	}

}
