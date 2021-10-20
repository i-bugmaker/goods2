package priv.mh.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import priv.mh.entity.Student;
import priv.mh.utils.MyBatisUtil;

import java.io.IOException;
import java.io.Reader;
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
}
