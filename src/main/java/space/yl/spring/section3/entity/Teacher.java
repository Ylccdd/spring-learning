package space.yl.spring.section3.entity;

/**
 * 教师类
 *
 * @author yaojianfeng
 */

public class Teacher {
    private String name;
    private String sex;

    public Teacher() {
    }

    public Teacher(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void teach() {
        System.out.println("...上课...");
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setName(String name) {
        System.out.println("...setName...");
        this.name = name;
    }

    public String getName() {
        System.out.println("...getName...");
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void showException() {
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        System.out.println(3/0);
    }

}
