package com.myself.pattern5strategy.pay.payport;

public enum PayTypeEnum {
    ALI_PAY(new AliPay()), JD_PAY(new JDPay()), WECHAT_PAY(new WeChatPay());

    private final PayMent payMent;

    PayTypeEnum(PayMent payMent) {
        this.payMent = payMent;
    }

    public PayMent getPayMent() {
        return payMent;
    }
}
