package com.demo.mapper;

import com.demo.bean.UserInfo;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/19 10:45
 */
public interface MybatisMapper {

    /**
     * 根据userId查询openId、userName，并返回一个UserInfo类
     * @param userId int
     * @return UserInfo
     */
    UserInfo selectUserById(int userId);

    /**
     * 根据userId查询openId、userName，并返回一个Map对象
     * @param userId int
     * @return Map<String,String>
     */
    Map<String,Object> selectUserInfoById(int userId);

    /**
     * 获取全部人员信息
     * @return List<UserInfo>
     */
    List<UserInfo> getAllUser();

    /**
     * 获取人员信息返回Map类型
     * @return Map<Integer,UserInfo> Map中主键为userId
     */
    @MapKey("userId")
    Map<Integer,UserInfo> getAllUserReturnMap();
}
