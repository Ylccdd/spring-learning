package space.yl.spring.section4.entity;

import java.io.Serializable;

/**
 * 简单学生信息表(Student)实体类
 *
 * @author 
 * @since 2022-03-29 17:42:09
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 428098660646448500L;
    /**
     * 编码id
     */
    private String sid;
    /**
     * 中文名字
     */
    private String name;
    /**
     * 英文名字
     */
    private String englishName;
    /**
     * 家庭住址
     */
    private String address;
    /**
     * 手机号码
     */
    private String phoneNumber;
    /**
     * 生日
     */
    private String birthday;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

