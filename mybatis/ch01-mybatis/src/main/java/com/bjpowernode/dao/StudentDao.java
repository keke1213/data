package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudent();

    int insertStudent(Student student);

    int deleteStudent(int id);

    int updateStudent(Student student);
}
