package com.tyre.lca.controller;

import com.alibaba.fastjson.JSONObject;
import com.tyre.lca.common.Constants;
import com.tyre.lca.dao.mapper.MaunfacturerMapper;
import com.tyre.lca.domain.Maunfacturer;
import com.tyre.lca.domain.ParamException;
import com.tyre.lca.service.RegisterService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
@RequestMapping(value = "/user")
public class UserRegisterController {
    @Resource
    private MaunfacturerMapper maunfacturerMapper;
    @Resource
    private RegisterService registerService;
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ParamException usrRegister(@RequestBody String str){
        if (StringUtils.isEmpty(str)){
            return new ParamException(Constants.ERROR_CODE, "请输入数据");
        }
        JSONObject json = null;
        try{
            json = JSONObject.parseObject(str);
        }catch (Exception e){
            return new ParamException(Constants.ERROR_CODE, "注册失败，请联系管理员");
        }
        try {
            registerService.judgeNormal(json);
        } catch (ParamException e) {
            return e;
        }
        return new ParamException(Constants.RIGHT_CODE, "注册成功");
    }


}
