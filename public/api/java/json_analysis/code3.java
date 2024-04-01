package com.example.demo;

import com.google.gson.Gson;

/**
 *  <dependency>
 * 	    <groupId>com.google.code.gson</groupId>
 * 	    <artifactId>gson</artifactId>
 * 	    <version>2.8.8</version>
 * </dependency>
 */
public class Test {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setName("公众号：干货食堂");
        /**
         * 获取json字符串
         */
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
        /**
         * 解析json对象
         */
        User jsonObject = gson.fromJson(json,User.class);
        System.out.println(jsonObject);
    }

}

