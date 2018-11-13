package com.tyre.lca.dao;

import com.tyre.lca.dao.mapper.MaunfacturerMapper;
import com.tyre.lca.domain.Maunfacturer;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class MaunfacturerDao {
    @Resource
    private MaunfacturerMapper maunfacturerMapper;
    public void insertMaunfacturer(Maunfacturer maunfacturer){
        maunfacturerMapper.insert(maunfacturer);
    }
}
