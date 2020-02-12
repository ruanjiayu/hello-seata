package com.fun.uncle.hello.seata.provider.service.impl;

import javax.annotation.Resource;

import com.fun.uncle.hello.seata.provider.domian.TbOrderItem;
import com.fun.uncle.hello.seata.provider.mapper.TbOrderItemMapper;
import com.fun.uncle.hello.seata.provider.service.TbOrderItemService;
import org.apache.dubbo.config.annotation.Service;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/2/12  22:43
* @Version:        0.0.1-SNAPSHOT
*/
@Service(version = "1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem tbOrderItem) {
        tbOrderItemMapper.insert(tbOrderItem);
    }
}
