package priv.mh.test;

import priv.mh.dao.GoodsDaoImpl;
import priv.mh.entity.Goods;

import java.util.List;

public class TestGoods {
    public static void main(String[] args) {
        listAllGoods();
    }

    private static void listAllGoods() {
        GoodsDaoImpl goodsDao = new GoodsDaoImpl();
        List<Goods> gList = goodsDao.listAllGoods();
        for (int i = 0; i < gList.size(); i++) {
            gList.get(i).show();
        }
    }
}
