package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDao {
    @Test
    public void TestDaoSelect() {
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        System.out.println("studentDao的名称==" + studentDao.getClass());//org.apache.ibatis.binding.MapperProxy@127bd23
        //.getClass() == com.sun.proxy.$Proxy2
        List<Student> studentList = studentDao.selectStudent();
        session.close();
        for (Student stu : studentList) {
            System.out.println(stu.getName());
        }


    }
}
