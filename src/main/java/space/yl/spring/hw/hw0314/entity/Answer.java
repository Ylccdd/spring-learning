package space.yl.spring.hw.hw0314.entity;

/** 答案类
 * @author yaojianfeng
 */
public class Answer {
    private int aid;
    private String aname;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Answer{");
        sb.append("aid=").append(aid);
        sb.append(", aname='").append(aname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
