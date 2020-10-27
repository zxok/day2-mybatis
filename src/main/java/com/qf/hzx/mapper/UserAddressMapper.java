package com.qf.hzx.mapper;

import com.qf.hzx.entity.UserAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAddressMapper {

    List<UserAddress> selectUserAddressByUserId(@Param("uid") int uid);
}
