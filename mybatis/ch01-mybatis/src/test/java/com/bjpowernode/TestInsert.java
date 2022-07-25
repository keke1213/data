package com.bjpowernode;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//com.bjpowernode.dao.StudentDao.insertStudent()
public class TestInsert {
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
        Student student = new Student(5, "刘备", "22322241132@qq.com", 30);

        int studentList = session.insert("com.bjpowernode.dao.StudentDao.insertStudent", student);
        //6.循环输出查询结果
//        studentList.forEach( student -> System.out.println(student));
        session.commit();

        System.out.println(studentList == 1 ? "插入成功" : "插入失败");

        //7.关闭 SqlSession，释放资源
        session.close();
    }
}
