package com.peng.domain.table.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Author Zhaofengtao
 * @Date 2020/7/20 11:51
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class TestDto {
    private String id ;
    private String title ;
    private String author ;
    private Date display_time ;
    private String pageviews ;

    public TestDto(){
        this.id = "100001";
        this.title = "测试标题";
        this.author = "测试人01";
        this.display_time = new Date();
        this.pageviews = "12";
    }
}
