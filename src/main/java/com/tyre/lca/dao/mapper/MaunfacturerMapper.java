package com.tyre.lca.dao.mapper;

import com.tyre.lca.domain.Maunfacturer;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaunfacturerMapper {
    int insert(Maunfacturer record);
}