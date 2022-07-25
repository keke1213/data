package com.bjpowernode.dao;


import com.bjpowernode.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {


    List<Student> selectStudentIf(Student student);

    List<Student> selectForeach(List<Integer> stuIdList);

    List<Student> selectForeach2(List<Student> stuIdList);

    List<Student> selectStudentSqlFragment(List<Student> stuList);//sql代码片段

    List<Student> selectStudent();
}
