package com.qf.hzx.mapper;

import com.qf.hzx.entity.Roles;
import org.apache.ibatis.annotations.Param;

public interface RolesMapper {

    Roles selectByUserId(@Param("uid") int userId);
}
