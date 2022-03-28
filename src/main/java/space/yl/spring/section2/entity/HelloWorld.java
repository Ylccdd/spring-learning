package space.yl.spring.section2.entity;

/**
 * @author yaojianfeng
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void display(){
        System.out.println("Hello World! "+message);
    }
}
