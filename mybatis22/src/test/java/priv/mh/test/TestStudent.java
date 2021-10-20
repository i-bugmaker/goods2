package priv.mh.test;

import priv.mh.dao.IStudentDao;
import priv.mh.dao.StudentDaoImpl2;
import priv.mh.entity.Student;

import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        //findAllStudents();
        //findStudentById(1);
        insertStudent();
    }


    private static void findAllStudents() {
        IStudentDao studentDao = new StudentDaoImpl2();
        List<Student> sList = studentDao.findAllStudents();
        for (int i = 0; i < sList.size(); i++) {
            sList.get(i).show();
        }
    }

    private static void findStudentById(int id) {
        IStudentDao studentDao = new StudentDaoImpl2();
        Student student = studentDao.findStudentById(id);
        student.show();
    }


    private static void insertStudent() {
        IStudentDao studentDao = new StudentDaoImpl2();
        Student student = new Student();
        student.setSid("6");
        student.setSname("武松");
        student.setSex("男");
        student.setAge(23);
        int count = studentDao.insertStudent(student);
        if (count > 0) {
            System.out.println("添加成功!");
        }
    }
}
