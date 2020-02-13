package com.fun.uncle.hello.seata.provider.service;

import com.fun.uncle.hello.seata.provider.domain.TbOrder;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/2/13  13:17
* @Version:        0.0.1-SNAPSHOT
*/
public interface TbOrderService {

    /**
     * 插入订单ID
     * @param tbOrder {@link TbOrder}
     */
    void insert(TbOrder tbOrder);
}
