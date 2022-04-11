package space.yl.spring.hw.hw0314.interfacePackage.impl;

import space.yl.spring.hw.hw0314.interfacePackage.Printable;

/**打印接口实现类 A
 * @author yaojianfeng
 */
public class PrintAImpl implements Printable {
    @Override
    public void print() {
        System.out.println("printAImpl...");
    }
}
