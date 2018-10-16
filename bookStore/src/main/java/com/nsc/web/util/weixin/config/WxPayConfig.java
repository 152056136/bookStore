package com.nsc.web.util.weixin.config;

/**
 * @Description:
 * @Date: 2018/4/8
 * @Author: wcf
 */
public class WxPayConfig {
    //小程序appid
    public static final String appid = "wxe166a8932b206268";
    //微信支付的商户id
    public static final String mch_id = "1349830601";
    //微信支付的商户密钥
    public static final String key = "BeiJingNanSheCunSoftwareCoLtddcb";
    //支付成功后的服务器回调url(本地测试使用http)
    public static final String notify_url = "https://www.titwdj.cn/bookStore/weixin/wxNotify";
    //public static final String notify_url = "http://wxpay.wxutil.com/pub_v2/pay/notify.v2.php";
    //签名方式
    public static final String SIGNTYPE = "MD5";
    //交易类型
    public static final String TRADETYPE = "JSAPI";
    //微信统一下单接口地址
    public static final String pay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
}
