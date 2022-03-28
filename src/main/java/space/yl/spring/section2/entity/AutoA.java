package space.yl.spring.section2.entity;

/**
 * @author yaojianfeng
 */
public class AutoA {
   private AutoB b;

    public AutoA() {
        System.out.println("AutoA was created");
    }

    public AutoA(AutoB b) {
        this.b = b;
    }

    public void setB(AutoB b) {
        this.b = b;
    }

    public AutoB getB() {
        return b;
    }
    public void print(){
        System.out.println("hello AutoA");
    }
    public void display(){
        print();
        b.print();
    }
}
