package space.yl.spring.section2.entity;

/** 问题类 通过泛型提升代码灵活性
 * @author yaojianfeng
 */
public class Question<T> {
    private int qid;
    private String qname;
    private T answers;

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public T getAnswers() {
        return answers;
    }

    public void setAnswers(T answers) {
        this.answers = answers;
    }

    public void display(){
        System.out.println(qid + " ." + qname);
        System.out.println("answers are: " +answers.toString());

    }

}
