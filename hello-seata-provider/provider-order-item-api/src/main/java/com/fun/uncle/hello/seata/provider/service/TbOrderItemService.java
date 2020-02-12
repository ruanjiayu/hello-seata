package com.fun.uncle.hello.seata.provider.service;

import com.fun.uncle.hello.seata.provider.domian.TbOrderItem;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/2/12  22:43
* @Version:        0.0.1-SNAPSHOT
*/
public interface TbOrderItemService {

    /**
     * 插入数据
     * @param tbOrderItem {@link TbOrderItem}
     */
    void insert(TbOrderItem tbOrderItem);
}
