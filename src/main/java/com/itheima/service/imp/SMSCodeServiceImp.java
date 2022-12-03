package com.itheima.service.imp;

import com.itheima.service.SMSCodeService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author yutong
 * @Description
 * @date 2022年12月03日 13:44
 */
@Service
public class SMSCodeServiceImp implements SMSCodeService {

    @CachePut(value = "smsCode",key = "#tele")//返回值放到缓存中key为SMSCode::tele
    @Override
    public String getCode(String tele) {
        String code = tele.substring(5);
        System.out.println(code);
        return code;
    }

    @Override
    public String checkCode(String smsCode, String code) {
        if(!Strings.isEmpty(smsCode)){
            return smsCode.equals(code)+"";
        }
        return "false";
    }

    @Cacheable(value = "smsCode",key = "#tele")
    @Override
    public String getCacheString(String tele){
        //如果缓存中有key为smsCode::tile 的值就返回缓存的数据，没有返回null
        return null;
    }
}
