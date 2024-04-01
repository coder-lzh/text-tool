package com.example.demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * <dependency>
 *     <groupId>com.fasterxml.jackson.core</groupId>
 *     <artifactId>jackson-databind</artifactId>
 *     <version>2.12.4</version>
 *   </dependency>
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
        //创建objectmapper对象
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);
        /**
         * 解析json对象
         */
        List<User> jsonObject = new ObjectMapper().readValue(json, new TypeReference<List<User>>(){});
        System.out.println(jsonObject);
    }

}
