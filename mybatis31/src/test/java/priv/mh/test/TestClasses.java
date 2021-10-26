package priv.mh.test;

import priv.mh.dao.ClassesDaoImpl;
import priv.mh.dao.IClassDao;
import priv.mh.entity.Classes;
import priv.mh.entity.Student;

import java.util.List;

public class TestClasses {
    public static void main(String[] args) {
        findClassesById();
    }

    private static void findClassesById() {
        IClassDao classesDao = new ClassesDaoImpl();
        Classes myclass = classesDao.findClassesById("201801");
        System.out.println("班级编号" + myclass.getCid() + ",班级名称:" + myclass.getCname() + ",班级学生:");
        List<Student> sList = myclass.getStudents();
        for (int i = 0; i < sList.size(); i++) {
            sList.get(i).show();
        }
    }
}
