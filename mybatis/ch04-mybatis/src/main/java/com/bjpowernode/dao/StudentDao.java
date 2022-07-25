package com.bjpowernode.dao;


import com.bjpowernode.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudent();

    Student selectStudentById(Integer id);

    List<Student> selectMultiParam(@Param("name") String name,
                                   @Param("age") int age);

    List<Student> selectMultiObject(Student student);

    Student selectMultiMap(Student student);


}
