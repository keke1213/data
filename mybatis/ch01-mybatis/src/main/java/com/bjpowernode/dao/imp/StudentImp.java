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
    public int insertStudent(Student student) {
        SqlSession session = MybatisUtil.getSqlSession();
        int studentList = session.insert("com.bjpowernode.dao.StudentDao.insertStudent", student);
        session.commit();
        session.close();
        return studentList;
    }

    @Override
    public int deleteStudent(int id) {
        SqlSession session = MybatisUtil.getSqlSession();
        int studentList = session.delete("com.bjpowernode.dao.StudentDao.deleteStudent", id);
        session.commit();
        session.close();
        return studentList;
    }

    @Override
    public int updateStudent(Student student) {
        SqlSession session = MybatisUtil.getSqlSession();
        int studentList = session.update("com.bjpowernode.dao.StudentDao.updateStudent", student);
        session.commit();
        session.close();
        return studentList;
    }
}
