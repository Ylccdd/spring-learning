package shop.yaojianfeng.springlearning.section2.entity;

/**
 * 员工类 添加泛型 提高复用性
 *
 * @author yaojianfeng
 */
public class Employee<T> {
    private int eid;
    private String ename;
    private T obj;

    public Employee() {
        System.out.println("默认无参构造函数...执行了...");
    }

    public Employee(int eid) {
        this.eid = eid;
    }

    public Employee(String ename) {
        this.ename = ename;
    }

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public Employee(int eid, String ename, T obj) {
        this.eid = eid;
        this.ename = ename;
        this.obj = obj;
    }



    public void show() {
        System.out.println(eid + "==88888==" + ename);
        if (obj != null) {
            System.out.println(obj.toString());
        }
    }


}
