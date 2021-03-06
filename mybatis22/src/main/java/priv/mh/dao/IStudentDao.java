package priv.mh.dao;

import priv.mh.entity.Student;

import java.util.List;

public interface IStudentDao {
    public List<Student> findAllStudents();

    public Student findStudentById(int id);

    public int insertStudent(Student student);

    public int insertStudentAutoIncrement(Student student);

    public int deleteStudentById(int id);

    public int updateStudent(Student student);
}
