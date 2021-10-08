package priv.mh.test;

import priv.mh.dao.IStudentDao;
import priv.mh.dao.StudentDaoImpl;
import priv.mh.entity.Student;

import java.util.List;

public class TestStudent1 {
    public static void main(String[] args) {
        findAllStudents();
    }

    private static void findAllStudents() {
        IStudentDao studentDao = new StudentDaoImpl();
        List<Student> sList = studentDao.findAllStudents();
        for (int i = 0; i < sList.size(); i++) {
            sList.get(i).show();
        }
    }
}
