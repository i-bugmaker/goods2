package priv.mh.dao;

import priv.mh.entity.Student;

import java.util.List;

public interface IStudentDao {
    public List<Student> findAllStudents();

    public Student findStudentById(int id);
}
