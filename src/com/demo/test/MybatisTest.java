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

    /**
     * 一级缓存：是SqlSession级别的缓存；sqlSessionFactory.openSession()开启一个新的SqlSession
     *  1、不同的SqlSession使用的是不同的一级缓存
     *      只有在同一个SqlSession期间查询到的数据会保存这个SqlSession的缓存中
     *      下次使用这个SqlSession查询会从缓存中取
     *  2、同一个方法不同的参数，由于没有查询过，所以还是会发新的sql
     *  3、在这个SqlSession期间执行过一次增删改操作会把缓存清空
     *  4、手动清空一级缓存session.clearCache();
     *
     * 二级缓存：全局作用域级别的缓存；SqlSession关闭或者提交之后，一级缓存的数据会存放在二级缓存中；mybatis默认不使用
     *  1、mybatis-config.xml文件 开启全局缓存开关<setting name="cacheEnabled" value="true"/>
     *  2、相应的mapper.xml加入 使用二级缓存的标签<cache/>
     *     是因为每一个mapper都有自己的二级缓存，二级缓存是namespace命名空间级别的
     *  3、相应的bean实体类需要实现Serializable序列化类
     *
     * 缓存的查询顺序：二级缓存->一级缓存->数据库
     */

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
