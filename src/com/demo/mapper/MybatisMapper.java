package com.demo.mapper;

import com.demo.bean.UserInfo;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/19 10:45
 */
public interface MybatisMapper{

    /**
     * 根据userId查询openId、userName，并返回一个UserInfo类
     * @param userId int
     * @return UserInfo
     */
    UserInfo selectUserNameByUserId(int userId);
}
