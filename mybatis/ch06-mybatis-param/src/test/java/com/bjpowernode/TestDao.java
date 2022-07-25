package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDao {
    //    @Test
//    public  void  TestDaoSelect(){
//        SqlSession session =MybatisUtil.getSqlSession();
//        StudentDao studentDao = session.getMapper(StudentDao.class);
//        System.out.println("studentDao的名称=="+studentDao.getClass());//org.apache.ibatis.binding.MapperProxy@127bd23
//        //.getClass() == com.sun.proxy.$Proxy2
//        Student student =studentDao.selectStudentById(4);
//        session.close();
//        System.out.println(student.getName());
//
//    }
//    @Test
//    public  void  TestDaoSelectParam(){
//        SqlSession session =MybatisUtil.getSqlSession();
//        StudentDao studentDao = session.getMapper(StudentDao.class);
//        List<Student> student =studentDao.selectMultiParam("任超",80);
//        session.close();
//        for (Student student1:student
//             ) {
//            System.out.println(student1.toString());
//        }
//
//    }
//
//    @Test
//    public  void  TestDaoSelectObject(){
//        SqlSession session =MybatisUtil.getSqlSession();
//        StudentDao studentDao = session.getMapper(StudentDao.class);
//        Student stu = new Student(null,"任超",null,80);
//        List<Student> student =studentDao.selectMultiObject(stu);
//        session.close();
//        for (Student student1:student
//        ) {
//            System.out.println(student1.toString());
//        }
//
//    }
//
//    @Test
//    public  void  TestResultMap(){
//        SqlSession session =MybatisUtil.getSqlSession();
//        StudentDao studentDao = session.getMapper(StudentDao.class);
//        Student student = new Student();
//        student.setId(4);
//        Student student1 =studentDao.selectMultiMap(student);
//        session.close();
//
//        System.out.println(student1.toString());
//
//
//    }
    @Test
    public void TestLikeFirst() {
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
//        String like = "%超";
        String like = "五";
        Student student1 = studentDao.selectLikeFirst(like);
        session.close();

        System.out.println(student1.toString());
    }

}
