package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.imp.StudentImp;
import com.bjpowernode.domain.Student;
import org.junit.Test;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class TestSelect {
    StudentDao studentDao = new StudentImp();

    @Test
    public void test() {
        final List<Student> students = studentDao.selectStudent();
        for (Student student : students
        ) {
            System.out.println("你进大厂了吗" + student);
        }
    }
}
