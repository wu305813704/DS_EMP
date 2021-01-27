package com.sunyard.emp.enumes;

/**
 *
 */
public enum ErrorCodeEnum {

    SUCCESS("000000", "处理成功"),

    FAIL("99999", "系统繁忙，请稍后再试"),

    REMOTE_ERROR("99998", "远程调用异常"),
    ;

    String recode;
    String remsg;

    ErrorCodeEnum(String recode, String remsg) {
        this.recode = recode;
        this.remsg = remsg;
    }

    public String getRecode() {
        return recode;
    }

    public String getRemsg() {
        return remsg;
    }

    @Override
    public String toString() {
        return "{"
                + "\"code\":\""
                + recode + '\"'
                + ",\"msg\":\""
                + remsg + '\"'
                + "}";

    }
}
