package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 *  <dependency>
 *     <groupId>com.alibaba</groupId>
 *     <artifactId>fastjson</artifactId>
 *     <version>1.2.76</version>
 * </dependency>
 */
public class Test {
    public static void main(String[] args) throws Exception {

            List<User> list = new ArrayList<User>(){{
                User user = new User();
                user.setName("公众号：干货食堂");
                add(user);
            }};
            /**
             * 获取json字符串
             */
            String json = JSON.toJSONString(list);
            System.out.println(json);
            /**
             * 解析json对象
             */
            List<User> jsonObject = JSON.parseObject(json, new TypeReference<List<User>>() {});
            System.out.println(jsonObject);
        }

        @Data
        static class User{
            private String name;
        }

}
