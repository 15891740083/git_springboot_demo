package com.itheima.controller;

import com.itheima.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yutong
 * @Description
 * @date 2022年12月03日 13:42
 */
@RestController
@RequestMapping("/sms")
public class SMSCodeController {

    @Autowired
    private SMSCodeService smsCodeService;

    @GetMapping
    public String getCode(String tele){
        String code = smsCodeService.getCode(tele);
        return code;
    }

    @PostMapping
    public String checkCode(String tele,String code){
        String smsCode = smsCodeService.getCacheString(tele);
        String result = smsCodeService.checkCode(smsCode,code);
        return result;
    }




}
