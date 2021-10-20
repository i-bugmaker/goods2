package priv.mh.entity;

public class Goods {
    private String gid;
    private String gname;
    private int price;
    private int quantity;

    public Goods(String gid, String gname, int price, int quantity) {
        this.gid = gid;
        this.gname = gname;
        this.price = price;
        this.quantity = quantity;
    }

    public Goods() {
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void show() {
        System.out.println("商品编号: " + gid + "\t商品名称: " + gname + "\t商品单价 " + price + "\t商品数量 " + quantity);
    }
}
