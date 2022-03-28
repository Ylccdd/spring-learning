package shop.yaojianfeng.springlearning.section3.service.impl;

import shop.yaojianfeng.springlearning.section3.service.SysLogService;

/**系统日志实现类
 * @author yaojianfeng
 */
public class SyslogImpl implements SysLogService {


    @Override
    public void insert() {
        System.out.println("---插入日志----");
    }

    @Override
    public void delete() {
        System.out.println("---删除日志----");
    }
}
