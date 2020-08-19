package com.demo.test;

import com.demo.bean.Book;
import com.demo.bean.UserInfo;
import com.demo.mapper.MybatisMapper;
import com.demo.mapper.MysqlMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

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
        //try(){}...catch{}括号内的资源可以在执行完语句之后自动关闭
        try (SqlSession session = sqlSessionFactory.openSession()) {
//            MybatisMapper mapper = session.getMapper(MybatisMapper.class);
            MysqlMapper mapper = session.getMapper(MysqlMapper.class);
//            Map<String,Object> openId = mapper.selectUserInfoById(42485);
//            List<UserInfo> allUser = mapper.getAllUser();
//            Map<Integer, UserInfo> allUserReturnMap = mapper.getAllUserReturnMap();
            List<Book> allBook = mapper.getAllBook();
            System.out.println(allBook);
        }
    }
}
