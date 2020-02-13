package com.fun.uncle.hello.seata.provider.service;

import com.fun.uncle.hello.seata.provider.domain.TbOrder;
import com.fun.uncle.hello.seata.provider.domian.TbOrderItem;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/2/13  13:53
 * @Version: 0.0.1-SNAPSHOT
 */
public interface ProviderTransactionService {

    /**
     * 创建订单
     * @param tbOrder {@link TbOrder}
     * @param tbOrderItem {@link TbOrderItem}
     */
    void createOrder(TbOrder tbOrder, TbOrderItem tbOrderItem);
}
