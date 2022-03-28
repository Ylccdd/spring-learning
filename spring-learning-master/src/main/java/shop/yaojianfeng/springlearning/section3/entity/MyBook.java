package shop.yaojianfeng.springlearning.section3.entity;

import lombok.Data;

/**
 * @author yaojianfeng
 */
@Data
public class MyBook {
    private String id;
    private String name;
    private int totalPageNumber;
    private double price;
}
