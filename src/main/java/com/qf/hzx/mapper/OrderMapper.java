package com.qf.hzx.mapper;

import com.qf.hzx.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    Order selectByNo(@Param("no") int no);

    List<Order> selectByUserIdList(@Param("uid") int uid);

}
