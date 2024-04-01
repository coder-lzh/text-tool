package com.example.demo;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 *  <dependency>
 * 	    <groupId>com.google.code.gson</groupId>
 * 	    <artifactId>gson</artifactId>
 * 	    <version>2.8.8</version>
 * </dependency>
 */
public class Test {
    public static void main(String[] args) throws Exception {

        List<User> list = new ArrayList();
        User user = new User();
        user.setName("公众号：干货食堂");
        list.add(user);

        /**
         * 获取json字符串
         */
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
        /**
         * 解析json对象
         */
        List<User> jsonObject = gson.fromJson(json, new TypeToken<List<User>>(){}.getType());
        System.out.println(jsonObject);
    }

}
