package priv.mh.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

// 使用工具类简化项目
public class MyBatisUtil {
    public MyBatisUtil() {
    }

    private static final String RESOURCE = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory = null;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(RESOURCE);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化MyBatis失败,请检查配置文件或数据库");
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public static SqlSession getSession() {
        SqlSession session = threadLocal.get();
        if (session == null) {
            session = (sqlSessionFactory != null) ? sqlSessionFactory.openSession() : null;
            threadLocal.set(session);
        }
        return session;
    }

    public static void closeSession() {
        SqlSession session = (SqlSession) threadLocal.get();
        threadLocal.set(null);
        if (session != null) {
            session.close();
        }
    }
}
