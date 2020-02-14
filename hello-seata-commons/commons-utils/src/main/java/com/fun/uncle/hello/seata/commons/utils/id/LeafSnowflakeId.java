package com.fun.uncle.hello.seata.commons.utils.id;



import com.fun.uncle.hello.seata.commons.utils.net.OkHttpClientUtil;

import java.io.IOException;
import java.text.ParseException;
import java.util.Objects;

/**
* @Description:   通过 Leaf 获取雪花 ID
* @Author:         Xian
* @CreateDate:     2020/2/14 23:46
* @Version:        0.0.1-SNAPSHOT
*/
public class LeafSnowflakeId {

    /**
     * 注意我这里写死了获取 Leaf 地址，只是为了方便演示
     */
    private static final String LEAF_HOST = "http://192.168.10.38:8080/api/snowflake/get/id";

    /**
     * 生成 ID
     *
     * @return {@code Long} 雪花 ID
     */
    public static Long genId() {
        try {
            String string = Objects.requireNonNull(OkHttpClientUtil.getInstance().getData(LEAF_HOST).body()).string();
            return Long.valueOf(string);
        } catch (IOException e) {
            return 0L;
        }
    }

    /**
     * 测试
     *
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        for (int i = 0; i < 100; i++) {
            System.out.println(LeafSnowflakeId.genId());
        }
    }

}
