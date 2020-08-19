package com.demo.mapper;

import com.demo.bean.Book;

import java.util.List;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/19 20:27
 */
public interface MysqlMapper {

    /**
     * 获取所有图书
     * @return List<Book>
     */
    List<Book> getAllBook();
}
