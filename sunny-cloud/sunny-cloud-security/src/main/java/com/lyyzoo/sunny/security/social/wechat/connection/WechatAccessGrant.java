package com.lyyzoo.sunny.security.social.wechat.connection;

import org.springframework.social.oauth2.AccessGrant;

/**
 * 获取微信令牌时，同时将用户 openId 返回来了，所以需要定制化 AccessGrant，封装 openId
 *
 * @author bojiangzhou 2018/10/28
 */
public class WechatAccessGrant extends AccessGrant {

    /**
     * 微信 openId
     */
    private String openId;

    public WechatAccessGrant(String accessToken, String openId) {
        super(accessToken);
        this.openId = openId;
    }

    public WechatAccessGrant(String accessToken, String scope, String refreshToken, Long expiresIn, String openId) {
        super(accessToken, scope, refreshToken, expiresIn);
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
    }

}
