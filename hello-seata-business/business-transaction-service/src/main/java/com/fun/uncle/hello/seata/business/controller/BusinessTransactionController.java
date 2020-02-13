package com.fun.uncle.hello.seata.business.controller;


import com.fun.uncle.hello.seata.provider.domain.TbOrder;
import com.fun.uncle.hello.seata.provider.domian.TbOrderItem;
import com.fun.uncle.hello.seata.provider.service.ProviderTransactionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/2/13  14:57
 * @Version: 0.0.1-SNAPSHOT
 */

@RestController
@RequestMapping(value = "transaction")
public class BusinessTransactionController {


    @Reference(version = "1.0.0")
    private ProviderTransactionService providerTransactionService;

    @GetMapping(value = "create/order")
    public String createOrder() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(1L);
        tbOrder.setUserId(2L);

        TbOrderItem tbOrderItem = new TbOrderItem();
        tbOrderItem.setUserId(1L);
        tbOrderItem.setOrderId(1L);
        tbOrderItem.setOrderItemId(1L);
        providerTransactionService.createOrder(tbOrder, tbOrderItem);
        return "ok";

    }

}
