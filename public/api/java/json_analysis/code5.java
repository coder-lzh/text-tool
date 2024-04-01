package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <dependency>
 *     <groupId>com.fasterxml.jackson.core</groupId>
 *     <artifactId>jackson-databind</artifactId>
 *     <version>2.12.4</version>
 *   </dependency>
 */
public class Test {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("公众号：干货食堂");
        /**
         * 获取json字符串
         */
        //创建objectmapper对象
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        System.out.println(json);
        /**
         * 解析json对象
         */
        User jsonObject = mapper.readValue(json,User.class);
        System.out.println(jsonObject);
    }

}
