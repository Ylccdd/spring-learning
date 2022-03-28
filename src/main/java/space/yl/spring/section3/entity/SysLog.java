package space.yl.spring.section3.entity;

import lombok.Data;

import java.util.Date;

/**
 * 系统日志
 * @author yaojianfeng
 */
@Data
public class SysLog {
    private int id;
    private int totalTime;
    private Date beginTime;
}
