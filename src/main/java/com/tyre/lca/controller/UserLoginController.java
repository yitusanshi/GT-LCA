package com.tyre.lca.controller;

import com.alibaba.fastjson.JSONObject;
import com.tyre.lca.common.Constants;
import com.tyre.lca.dao.mapper.MaunfacturerMapper;
import com.tyre.lca.domain.Maunfacturer;
import com.tyre.lca.domain.ParamException;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserLoginController {
    private  static Logger logger = LoggerFactory.getLogger(UserLoginController.class);
    @Resource
    private MaunfacturerMapper maunfacturerMapper;
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ParamException userLogin(@RequestBody String str){
        if (StringUtils.isEmpty(str)){
            return new ParamException(Constants.ERROR_CODE, "请输入用户名");
        }
        JSONObject json = null;
        try{
            json = JSONObject.parseObject(str);
        }catch (Exception e){
            logger.error("parse json error, user login msg is {}, error: {}", str, e);
            return new ParamException(Constants.ERROR_CODE, "登录失败");
        }
        String username = json.getString("username");
        String password = json.getString("password");
        logger.info("user is logining:{}, time is {}", username, new Date());
        Maunfacturer maunfacturer = maunfacturerMapper.selectUser(username);
        if (maunfacturer == null){
            return new ParamException(Constants.ERROR_CODE, "用户名错误");
        }
        if (!maunfacturer.getPassword().equals(password)){
            return new ParamException(Constants.ERROR_CODE, "密码错误");
        }
        return new ParamException(Constants.RIGHT_CODE, "登录成功");
    }
}
