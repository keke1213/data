package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.imp.StudentImp;
import com.bjpowernode.domain.Student;

import java.util.List;

public class Test {
    StudentDao dao = new StudentImp();

    @org.junit.Test
    public void test() {

        final List<Student> studentList = dao.selectStudent();
        studentList.forEach(stu -> System.out.println(stu));

    }
}
