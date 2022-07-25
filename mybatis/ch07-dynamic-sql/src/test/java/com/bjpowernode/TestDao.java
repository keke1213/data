package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDao {
    private SqlSession sqlSessions = MybatisUtil.getSqlSession();
    StudentDao studentDao = sqlSessions.getMapper(StudentDao.class);

    @Test
    public void selectTest() {

        Student student = new Student();
        student.setName("任超");
        student.setAge(2);
        List<Student> studentList = studentDao.selectStudentIf(student);
        for (Student student1 : studentList
        ) {
            System.out.println("====" + student1.toString());
        }
    }

    @Test
    public void testSelectForList() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        List<Student> studentList = studentDao.selectForeach(list);
        for (Student student1 : studentList
        ) {
            System.out.println("foreach" + student1.toString());
        }
    }

    @Test
    public void testSelectForList2() {
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        student.setId(3);
        student1.setId(4);
        student2.setId(5);
        list.add(student);
        list.add(student1);
        list.add(student2);
        List<Student> studentList = studentDao.selectForeach2(list);
        for (Student student3 : studentList
        ) {
            System.out.println("foreach2" + student3.toString());
        }
    }

    @Test
    public void testSelectSqlFragment() {
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        student.setId(3);
        student1.setId(4);
        student2.setId(5);
        list.add(student);
        list.add(student1);
        list.add(student2);
        List<Student> studentList = studentDao.selectStudentSqlFragment(list);
        for (Student student3 : studentList
        ) {
            System.out.println("sql" + student3.toString());
        }
    }

    @Test
    public void testSelect() throws IOException {
//获取第 1 页，3 条内容
        PageHelper.startPage(2, 2);
        List<Student> studentList = studentDao.selectStudent();
        studentList.forEach(stu -> System.out.println(stu));

    }
}
