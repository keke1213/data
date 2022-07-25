package com.bjpowernode.dao.imp;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.util.MybatisUtil;
import com.bjpowernode.domain.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentImp implements StudentDao {
    @Override
    public List<Student> selectStudent() {
        SqlSession session = MybatisUtil.getSqlSession();
        List<Student> studentList = session.selectList("com.bjpowernode.dao.StudentDao.selectStudent");
        session.close();
        return studentList;
    }

    @Override
    public Student selectStudentById(Integer id) {
        return null;
    }

    @Override
    public List<Student> selectMultiParam(String name, int age) {
        return null;
    }

    @Override
    public List<Student> selectMultiObject(Student student) {
        return null;
    }

    @Override
    public Student selectMultiMap(Student student) {
        return null;
    }
}
