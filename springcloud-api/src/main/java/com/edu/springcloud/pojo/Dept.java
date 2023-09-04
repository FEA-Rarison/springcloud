package com.edu.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 张玉龙
 * 我亦无他，惟手熟尔~
 * 追求卓越，越努力越幸运！
 */
@NoArgsConstructor
@Data
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {//Dept 实体类 类表关系映射

    private Long deptno;//主键
    private String dname;
    //这个数据存在哪个数据库的字段
    //微服务的体现，一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }
    /*
     链式写法：
        Dept dept = new Dept();
        一般的写法就是一个对象.一个方法
        链式写法就是可以在后面一直点方法【注意是否有返回值】
        dept.setDeptNo(11).setDname('sss').setDb_source('001');

     */
    int i = 0;
    //做了一次更改------------------------------------------------
}
