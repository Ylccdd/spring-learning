package shop.yaojianfeng.springlearning.section2.util;

import shop.yaojianfeng.springlearning.section2.interfacePackage.Printable;
import shop.yaojianfeng.springlearning.section2.interfacePackage.impl.PrintAImpl;
import shop.yaojianfeng.springlearning.section2.interfacePackage.impl.PrintBImpl;

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
