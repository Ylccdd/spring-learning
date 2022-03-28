package space.yl.spring.section2.util;

import space.yl.spring.section2.interfacePackage.Printable;
import space.yl.spring.section2.interfacePackage.impl.PrintAImpl;

/**
 * 打印功能实例工厂
 * @author yaojianfeng
 */
public class PrintableFactory {
    public static Printable getPrintable(){
        return new PrintAImpl();
//        return new PrintBImpl();
    }
    public  Printable showPrint(){
        return new PrintAImpl();
//        return new PrintBImpl();
    }
}
