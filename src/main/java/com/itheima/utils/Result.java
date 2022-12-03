package com.itheima.utils;

import lombok.Data;

/**
 * @author yutong
 * @Description
 * @date 2022年12月01日 1:08
 */
@Data
public class Result {
    private boolean flag;
    private Object data;
    private String msg;

    public Result() {
    }


    public Result(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
    public Result(boolean flag, Object data,String msg) {
        this.flag = flag;
        this.data = data;
    }
}
