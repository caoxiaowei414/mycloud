package com.xiaowei.eurekaprovider8001.service.impl.demo;

import com.xiaowei.eurekaprovider8001.dao.mapper.demo.MyDemoMapper;
import com.xiaowei.eurekaprovider8001.entity.demo.MyDemo;
import com.xiaowei.eurekaprovider8001.service.demo.MyDemoService;
import com.xiaowei.common.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by cxw on 2019/04/14.
 */
@Service
public class MyDemoServiceImpl extends AbstractService<MyDemo> implements MyDemoService {

    @Autowired
    private MyDemoMapper myDemoMapper;

}
