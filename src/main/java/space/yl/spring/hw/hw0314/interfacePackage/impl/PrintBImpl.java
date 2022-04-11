package space.yl.spring.hw.hw0314.interfacePackage.impl;

import space.yl.spring.hw.hw0314.interfacePackage.Printable;

/**打印实现类 B
 * @author yaojianfeng
 */
public class PrintBImpl implements Printable {
    @Override
    public void print() {
        System.out.println("printBImpl...");
    }
}
