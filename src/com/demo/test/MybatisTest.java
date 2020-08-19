package com.demo.test;

import com.demo.bean.UserInfo;
import com.demo.mapper.MybatisMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/19 10:24
 */
public class MybatisTest {

    private final SqlSessionFactory sqlSessionFactory = getSqlSession();

    public SqlSessionFactory getSqlSession() {
        String resource = "conf/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            System.out.println("加载失败...");
        }
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void mybatisTest() {
        //try()...catch括号内的资源可以在执行完语句之后自动关闭
        try (SqlSession session = sqlSessionFactory.openSession()) {
            MybatisMapper mapper = session.getMapper(MybatisMapper.class);
            UserInfo openId = mapper.selectUserNameByUserId(42485);
            System.out.println(openId);
        }
    }
}
