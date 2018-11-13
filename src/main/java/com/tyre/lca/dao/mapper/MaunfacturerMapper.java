package com.tyre.lca.dao.mapper;

import com.tyre.lca.domain.Maunfacturer;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;

@Resource(name = "maunfacturerMapper")
public interface MaunfacturerMapper {
    int insert(Maunfacturer record);
}