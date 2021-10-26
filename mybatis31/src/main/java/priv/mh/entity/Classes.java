package priv.mh.entity;

import java.util.List;

public class Classes {
    private String cid;
    private String cname;
    private List<Student> students;

    @Override
    public String toString() {
        return "Classes{" +
                "班级编号='" + cid + '\'' +
                ", 班级名称='" + cname +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
