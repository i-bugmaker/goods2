package priv.mh.test;

import priv.mh.dao.IStudentDao;
import priv.mh.dao.StudentDaoImpl2;
import priv.mh.entity.Student;

import java.util.List;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        //findAllStudents();
        //findStudentById(1);
        //insertStudent();
        //insertStudentAutoIncrement();
        //deleteStudentById();
        updateStudent();
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


    private static void insertStudentAutoIncrement() {
        IStudentDao studentDao = new StudentDaoImpl2();
        Student student = new Student();
        student.setSname("林冲");
        student.setSex("男");
        student.setAge(22);
        int count = studentDao.insertStudentAutoIncrement(student);
        if (count > 0) {
            System.out.println("添加成功");
            System.out.println("新添加的学生的编号是:" + student.getSid());
        }
    }

    private static void deleteStudentById() {
        IStudentDao studentDao = new StudentDaoImpl2();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号");
        int sid = input.nextInt();
        Student student = studentDao.findStudentById(sid);
        if (student != null) {
            int count = studentDao.deleteStudentById(sid);
            if (count > 0) {
                System.out.println("删除成功!");
            } else {
                System.out.println("改学生不存在!");
            }
        }
    }


    private static void updateStudent() {
        IStudentDao studentDao = new StudentDaoImpl2();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        int sid = input.nextInt();
        Student student = studentDao.findStudentById(sid);
        if (student != null) {
            System.out.println("该学生原有信息如下");
            student.show();
            System.out.print("请输入学生的新的姓名:");
            String sname = input.next();
            System.out.print("请输入学生的新的性别:");
            String sex = input.next();
            System.out.print("请输入学生的新的年龄:");
            int age = input.nextInt();
            student = new Student(Integer.toString(sid), sname, sex, age);
            studentDao.updateStudent(student);
        } else {
            System.out.println("该学生不存在!");
        }
    }
}
