package com.itheima.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yutong
 * @Description springMVC异常处理器
 * @date 2022年12月01日 15:35
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    /**
     * 拦截索所有异常信息
     * @param e
     * @return
     */
    @ExceptionHandler
    public Result doException(Exception e ){
        //记录日志
        //通知开发
        //通知运维
        e.printStackTrace();
        return new Result(false,"服务器故障，请联系服务人员");
    }

}
