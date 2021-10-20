package priv.mh.dao;

import org.apache.ibatis.session.SqlSession;
import priv.mh.entity.Goods;
import priv.mh.utils.MyBatisUtil;

import java.util.ArrayList;
import java.util.List;

public class GoodsDaoImpl implements IGoodsDao {
    @Override
    public List<Goods> listAllGoods() {
        SqlSession session = null;
        List<Goods> list = new ArrayList<>();
        try {
            session = MyBatisUtil.getSession();
            list = session.selectList("priv.mh.dao.IGoodsDao.listAllGoods");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
