package space.yl.spring.section2.interfacePackage.impl;

import space.yl.spring.section2.interfacePackage.Printable;

/**打印实现类 B
 * @author yaojianfeng
 */
public class PrintBImpl implements Printable {
    @Override
    public void print() {
        System.out.println("printBImpl...");
    }
}
