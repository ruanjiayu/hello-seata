package com.fun.uncle.hello.seata.provider.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/2/13  13:17
* @Version:        0.0.1-SNAPSHOT
*/
@Data
@Table(name = "tb_order")
public class TbOrder implements Serializable {

    private static final long serialVersionUID = 7341571997332211887L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_id")
    private Long userId;

}