import cn.itcast.Dao.UserDao;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args)
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //由于spring new出的对象是object型的故要强行转换
        UserDao userDao = (UserDao) app.getBean("userDao");
    }
}
