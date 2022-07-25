package com.bjpowernode;

import com.bjpowernode.domain.Student;
import com.bjpowernode.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest_util {
    @Test
    public void test() throws IOException {

        SqlSession session = MybatisUtil.getSqlSession();
        //5.执行 SqlSession 的 selectList()
//        String sqlId  ="com.bjpowernode.dao.StudentDao.selectStudent";
        List<Student> studentList = session.selectList("com.bjpowernode.dao.StudentDao.selectStudent");
        //6.循环输出查询结果
//        studentList.forEach( student -> System.out.println(student));
        for (Student student : studentList
        ) {
            System.out.println("Student" + student.getName());
        }

        //7.关闭 SqlSession，释放资源
        session.close();
    }
}
