package priv.mh.dao;

import org.apache.ibatis.session.SqlSession;
import priv.mh.entity.Student;
import priv.mh.utils.MyBatisUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl2 implements IStudentDao {

    @Override
    public List<Student> findAllStudents() {
        SqlSession session = null;
        List<Student> list = new ArrayList<>();
        session = MyBatisUtil.getSession();
        // 4.根据 SqlSession 对象 session 的 selectList 方法执行查询数据库的操作,返回映射后的结果集合
        list = session.selectList("priv.mh.dao.IStudentDao.findAllStudents");
        return list;
    }

    @Override
    public Student findStudentById(int id) {
        Student student = new Student();
        try {
            SqlSession session = MyBatisUtil.getSession();
            student = session.selectOne("priv.mh.dao.IStudentDao.findStudentById", id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession session = null;
        int count = 0;
        try {
            session = MyBatisUtil.getSession();
            count = session.insert("priv.mh.dao.IStudentDao.insertStudent", student);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (session != null) {
                session.close();
            }
        }
        return count;
    }
}
