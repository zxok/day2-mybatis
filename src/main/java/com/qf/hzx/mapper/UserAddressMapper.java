package com.qf.hzx.mapper;

import com.qf.hzx.entity.UserAddress;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {

    UserAddress selectByUserId(@Param("uid") int uid);
}
