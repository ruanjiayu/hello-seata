package com.fun.uncle.hello.seata.provider.service.impl;

import com.fun.uncle.hello.seata.provider.domain.TbOrder;
import com.fun.uncle.hello.seata.provider.domian.TbOrderItem;
import com.fun.uncle.hello.seata.provider.service.ProviderTransactionService;
import com.fun.uncle.hello.seata.provider.service.TbOrderItemService;
import com.fun.uncle.hello.seata.provider.service.TbOrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/2/13  14:00
 * @Version: 0.0.1-SNAPSHOT
 */
@Slf4j
@Service(version = "1.0.0")
public class ProviderTransactionServiceImpl implements ProviderTransactionService {

    @Reference(version = "1.0.0")
    TbOrderService tbOrderService;

    @Reference(version = "1.0.0")
    TbOrderItemService tbOrderItemService;

    @Override
    @GlobalTransactional  //表示事务发起者
    public void createOrder(TbOrder tbOrder, TbOrderItem tbOrderItem) {

        log.info("【开启全局事务，事务XID为】：{}", RootContext.getXID());

        tbOrderService.insert(tbOrder);
        tbOrderItemService.insert(tbOrderItem);

        if (tbOrder.getUserId().equals(2L)) {
            throw  new RuntimeException("【Exception for seata】");
        }
    }
}
