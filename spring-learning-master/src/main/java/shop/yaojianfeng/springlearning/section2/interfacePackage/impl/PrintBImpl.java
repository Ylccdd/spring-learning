package shop.yaojianfeng.springlearning.section2.interfacePackage.impl;

import shop.yaojianfeng.springlearning.section2.interfacePackage.Printable;

/**打印实现类 B
 * @author yaojianfeng
 */
public class PrintBImpl implements Printable {
    @Override
    public void print() {
        System.out.println("printBImpl...");
    }
}
