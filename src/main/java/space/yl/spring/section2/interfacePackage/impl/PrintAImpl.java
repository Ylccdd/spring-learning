package space.yl.spring.section2.interfacePackage.impl;

import space.yl.spring.section2.interfacePackage.Printable;

/**打印接口实现类 A
 * @author yaojianfeng
 */
public class PrintAImpl implements Printable {
    @Override
    public void print() {
        System.out.println("printAImpl...");
    }
}
