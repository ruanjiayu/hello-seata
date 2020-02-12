package com.fun.uncle.hello.seata.provider.domian;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/2/12  22:43
* @Version:        0.0.1-SNAPSHOT
*/
@Data
@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {

    private static final long serialVersionUID = -7580923327126792654L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_item_id")
    private Long orderItemId;

}