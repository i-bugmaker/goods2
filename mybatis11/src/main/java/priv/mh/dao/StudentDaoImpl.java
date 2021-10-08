package priv.mh.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import priv.mh.entity.Student;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao {

    @Override
    public List<Student> findAllStudents() {
        SqlSession session = null;
        List<Student> list = new ArrayList<>();
        try {
            // 1.读取主配置文件 mybatis-config.xml
            String resource = "mybatis-config.xml";
            Reader reader = Resources.getResourceAsReader(resource);

            // 2.根据主配置文件 mybatis-config.xml 构建 SqlSessionFactory 对象 factory
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(reader);

            // 3.根据 SqlSessionFactory 对象创建 SqlSession 对象 session
            session = factory.openSession();

            // 4.根据 SqlSession 对象 session 的 selectList 方法执行查询数据库的操作,返回映射后的结果集合
            list = session.selectList("priv.mh.dao.IStudentDao.findAllStudents");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return list;
    }
}
