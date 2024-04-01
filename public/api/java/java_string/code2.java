package com.ganhuoshitang.kong.utils;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.util.AntPathMatcher;

import java.util.LinkedList;
import java.util.List;

/**
 * url通配符匹配
 * 公众号：干货食堂
 */
public class UrlWildcardMatcher {


    /**
     * 判断指定url地址是否匹配指定url集合中的任意一个
     *
     * @param urlPath 指定url地址
     * @param urls    需要检查的url集合
     * @return 是否匹配  匹配返回true，不匹配返回false
     */
    public static boolean matches(String urlPath, List<String> urls) {
        if (StringUtils.isEmpty(urlPath) || CollectionUtils.isEmpty(urls)) {
            return false;
        }
        for (String url : urls) {
           return isMatch(url, urlPath);
        }
        return false;
    }

    /**
     * 判断指定url地址是否匹配指定url
     * @param urlPath
     * @param url
     * @return
     */
    public static boolean matches(String urlPath, String url) {
        if (StringUtils.isEmpty(urlPath) || StringUtils.isEmpty(url)) {
            return false;
        }
        return isMatch(url, urlPath);
    }


    /**
     * 判断url是否与规则配置:
     * ? 表示单个字符
     * * 表示一层路径内的任意字符串，不可跨层级
     * ** 表示任意层路径
     *
     * @param url     匹配规则
     * @param urlPath 需要匹配的url
     * @return
     */
    public static boolean isMatch(String url, String urlPath) {
        AntPathMatcher matcher = new AntPathMatcher();
        return matcher.match(url, urlPath);
    }

    public static void main(String[] args) {
        // 测试示例
        String pattern = "/api/*/user";
        String pattern2 = "/api/**";
        String url1 = "/api/v1/user";
        String url2 = "/api/v2/user";
        String url3 = "/api/admin/user";
        String url4 = "/api/user";
        String url5 = "/api/v1/users";
        String url6 = "/api/v1/user/profile";
        String url7 = "/api/v1/user/123";

        System.out.println(matches(url1, pattern)); // true
        System.out.println(matches(url2, pattern)); // true
        System.out.println(matches(url3, pattern)); // true
        System.out.println(matches(url4, pattern)); // false
        System.out.println(matches(url5, pattern)); // false

        System.out.println(matches(url1, pattern2)); // true
        System.out.println(matches(url6, pattern2)); // true
        System.out.println(matches(url7, pattern2)); // true
        System.out.println(matches(url4, pattern2)); // true

        System.out.println("=======================测试集合====================");
        List list = new LinkedList();
        list.add("/api/**/insert/**");
        String url = "/api/ces11/insert/11";
        System.out.println(matches(url, list)); //true
    }
}
