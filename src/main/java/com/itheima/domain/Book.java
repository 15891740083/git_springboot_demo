package com.itheima.domain;

import lombok.Data;

//lombok:用法@data自动生成getset方法
@Data
public class Book {
    private Integer id;
    private String name ;
    private String type;
    private String discription;
}
