package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.imp.StudentImp;
import com.bjpowernode.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestStuImp {
    StudentDao dao = new StudentImp();

    @Test
    public void TestStudentImpSelect() {
        List<Student> studentList = dao.selectStudent();
        studentList.forEach(stu -> System.out.println("--->" + stu.getName()));
    }

    @Test
    public void TestStudentImpDelete() {
        int value = dao.deleteStudent(2);
        System.out.println(value == 1 ? "删除成功" : "删除失败");
    }

    @Test
    public void TestStudentImpInsert() {
        Student student = new Student(6, "张山", "1158258231@qq.com", 20);
        int value = dao.insertStudent(student);
        System.out.println(value == 1 ? "插入成功" : "插入失败");
    }

    @Test
    public void TestStudentImpUpdate() {
        Student student = new Student(6, null, null, 80);
        int value = dao.updateStudent(student);
        System.out.println(value == 1 ? "更新成功" : "更新失败");
    }

}
