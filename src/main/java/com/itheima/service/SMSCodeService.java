package com.itheima.service;

/**
 * @author yutong
 * @Description
 * @date 2022年12月03日 13:44
 */
public interface SMSCodeService {

    String getCode(String tele);

    String checkCode(String smsCode, String code);

    String getCacheString(String tele);
}
