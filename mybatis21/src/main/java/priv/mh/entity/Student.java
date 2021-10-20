package priv.mh.entity;

public class Student {
    private String sid;
    private String sname;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(String sid, String sname, String sex, int age) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.age = age;
    }

    public void show() {
        System.out.println("学生编号:" + sid + " 学生姓名:" + sname + " 学生性别:" + sex + " 学生年龄:" + age);
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
