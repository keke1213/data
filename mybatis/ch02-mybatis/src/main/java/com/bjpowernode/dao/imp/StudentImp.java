package com.bjpowernode.dao.imp;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentImp implements StudentDao {
    @Override
    public List<Student> selectStudent() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.bjpowernode.dao.StudentDao.selectStudent";
        List<Student> list = sqlSession.selectList(sql);
        sqlSession.close();
        return list;
    }

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudent(int id) {
        return 0;
    }

    @Override
    public int updateStudent(Student student) {
        return 0;
    }
}
