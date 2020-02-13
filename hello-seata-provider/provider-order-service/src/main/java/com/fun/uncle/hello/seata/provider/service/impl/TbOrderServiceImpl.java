package com.fun.uncle.hello.seata.provider.service.impl;

import javax.annotation.Resource;

import com.fun.uncle.hello.seata.provider.domain.TbOrder;
import com.fun.uncle.hello.seata.provider.mapper.TbOrderMapper;
import com.fun.uncle.hello.seata.provider.service.TbOrderService;
import org.apache.dubbo.config.annotation.Service;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/2/13  13:17
* @Version:        0.0.1-SNAPSHOT
*/
@Service(version = "1.0.0")
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;


    @Override
    public void insert(TbOrder tbOrder) {
        tbOrderMapper.insert(tbOrder);
    }
}
