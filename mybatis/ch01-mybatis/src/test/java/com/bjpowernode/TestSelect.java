package com.bjpowernode;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSelect {
    @org.junit.Test
    public void testStart() throws IOException {
        //1.mybatis 主配置文件
        String config = "mybatis.xml";
        //2.读取配置文件
        InputStream in = Resources.getResourceAsStream(config);
        //3.创建 SqlSessionFactory 对象,目的是获取 SqlSession
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //4.获取 SqlSession,SqlSession 能执行 sql 语句
        SqlSession session = factory.openSession();
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
