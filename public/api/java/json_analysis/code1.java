package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;

/**
 *  <dependency>
 *     <groupId>com.alibaba</groupId>
 *     <artifactId>fastjson</artifactId>
 *     <version>1.2.76</version>
 * </dependency>
 */
public class Test {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("公众号：干货食堂");
        /**
         * 获取json字符串
         */
        String json = JSON.toJSONString(user,SerializerFeature.SerializeNulls);
        System.out.println(json);
        /**
         * 解析json对象
         */
        User jsonObject = JSON.parseObject(json, User.class);
        System.out.println(jsonObject);
    }

    @Data
    static class User{
        private String name;
    }

}
