package com.qf.hzx;

import com.qf.hzx.entity.Order;
import com.qf.hzx.entity.UserAddress;
import com.qf.hzx.mapper.OrderMapper;
import com.qf.hzx.mapper.UserAddressMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

/**
 * @program: day2-mybatis
 * @author: hzx
 * @since: JDK 1.8
 * @create: 2020-10-27 19:43
 **/
public class TestMinHomework {

    SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(
            TestMinHomework.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
    );
    SqlSession sqlSession = ssf.openSession(true);

    @Test
    public void selectUserAddressByUserIdTest() {
        UserAddressMapper addressMapper = sqlSession.getMapper(UserAddressMapper.class);
        List<UserAddress> userAddressList = addressMapper.selectUserAddressByUserId(1);
        System.out.println(userAddressList);
    }

}
