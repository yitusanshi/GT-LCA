package com.tyre.lca.service;

import com.alibaba.fastjson.JSONObject;
import com.tyre.lca.common.Constants;
import com.tyre.lca.domain.Maunfacturer;
import com.tyre.lca.domain.ParamException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class RegisterService  {
    public void judgeNormal(JSONObject json) throws ParamException {
        String username = json.getString("username");
        String password = json.getString("password");
        String firmname = json.getString("firm_name");
        String product = json.getString("product");
        String address = json.getString("address");
        String phone = json.getString("phone");
        String department = json.getString("department");
        String email = json.getString("email");
        String foundingTime = json.getString("founding_time");
        String desc = json.getString("desc");
        Maunfacturer maunfacturer = new Maunfacturer();
        if (StringUtils.isEmpty(username)){
            throw new ParamException(Constants.ERROR_CODE, "用户名为空");
        }
    }
}
