package com.kakaluote.weixinpublic.wx.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: Administrator
 * Project Name: weixin-public
 * File Name: WxConfig
 * Package Name: com.kakaluote.weixinpublic.wx.config
 * Date: 2020/5/16 16:38
 * Copyright (c) 2020,All Rights Reserved.
 * @Description 微信相关的配置类
 */
@Configuration
@PropertySource(value = {"classpath:wx-config.properties"})
@ConfigurationProperties(prefix = "wx")
public class WxConfig {
    public static String wxPublicAppid;
    public static String wxPublicAppsecret;
    public static String wxOpenAppid;
    public static String wxOpenAppsecret;
    public static String redirectUrl;

    public void setWxPublicAppid(String wxPublicAppid) {
        WxConfig.wxPublicAppid = wxPublicAppid;
    }

    public  void setWxPublicAppsecret(String wxPublicAppsecret) {
        WxConfig.wxPublicAppsecret = wxPublicAppsecret;
    }

    public  void setWxOpenAppid(String wxOpenAppid) {
        WxConfig.wxOpenAppid = wxOpenAppid;
    }

    public  void setWxOpenAppsecret(String wxOpenAppsecret) {
        WxConfig.wxOpenAppsecret = wxOpenAppsecret;
    }

    public  void setRedirectUrl(String redirectUrl) {
        WxConfig.redirectUrl = redirectUrl;
    }
}
