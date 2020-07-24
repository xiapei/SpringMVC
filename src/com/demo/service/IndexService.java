package com.demo.service;

import com.demo.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/24 11:03
 */
@Service
public class IndexService {

    @Autowired
    private IndexDao indexDao;

    public String doSomething(){
        return "do";
    }
}
