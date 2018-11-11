package com.tyre.lca.controller;

import com.alibaba.fastjson.JSONObject;
import com.tyre.lca.dao.mapper.MaunfacturerMapper;
import com.tyre.lca.domain.Maunfacturer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping(value = "/user")
public class UserRegisterController {
    @Resource
    private MaunfacturerMapper maunfacturerMapper;
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String usrRegister(@RequestParam(value = "data") String str){
        Maunfacturer maunfacturer = new Maunfacturer();
        System.out.println(str);
        maunfacturer.setUsername(str);
        maunfacturerMapper.insert(maunfacturer);
        //JSONObject json = JSONObject.parseObject()
        return null;
    }
}
