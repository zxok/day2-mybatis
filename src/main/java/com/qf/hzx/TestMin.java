package com.qf.hzx;

import com.qf.hzx.entity.Order;
import com.qf.hzx.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;

import java.util.List;

/**
 * @program: day2-mybatis
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-10-27 19:43
 **/
public class TestMin {

    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
            TestMin.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
    );
    SqlSession sqlSession = ssf.openSession(true);

    @Test
    public void selectByOrderNoTest() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.selectByNo(10001);
        System.out.println(order);
    }

    @Test
    public void selectByUserIdTest() {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.selectByUserIdList(1);
        System.out.println(orders);
    }

}
