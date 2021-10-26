package priv.mh.dao;

import org.apache.ibatis.session.SqlSession;
import priv.mh.entity.Classes;
import priv.mh.utils.MyBatisUtil;

public class ClassesDaoImpl implements IClassDao {
    @Override
    public Classes findClassesById(String id) {
        Classes classes = new Classes();
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();
            classes = session.selectOne("priv.mh.dao.IClassDao.findClassesById", id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return classes;
    }
}
