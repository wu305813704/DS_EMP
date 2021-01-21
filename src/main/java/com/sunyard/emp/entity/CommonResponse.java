package com.sunyard.emp.entity;

import com.alibaba.fastjson.JSON;
import com.sunyard.emp.enumes.ErrorCodeEnum;
import com.sunyard.emp.exception.BaseException;

import java.io.Serializable;

public class CommonResponse<T> implements Serializable {

    private String recode;
    private String remsg;
    /** 中台返回的处理状态 */
    private String state;
    //private String code;
    //private String msg;
    //private String status;
    private T data;

    public CommonResponse() {
    }

    public CommonResponse(T data) {
        this.recode = ErrorCodeEnum.SUCCESS.getRecode();
        this.remsg = ErrorCodeEnum.SUCCESS.getRemsg();
        this.data = data;
    }

    public CommonResponse(String recode, String remsg) {
        this.recode = recode;
        this.remsg = remsg;
    }

    public CommonResponse success() {
        this.recode = ErrorCodeEnum.SUCCESS.getRecode();
        this.remsg = ErrorCodeEnum.SUCCESS.getRemsg();
        return this;
    }

    public Boolean isSuccess() {
        return ErrorCodeEnum.SUCCESS.getRecode().equals(this.recode);
    }

    public CommonResponse fail(Exception e) {
        if (e instanceof BaseException) {
            BaseException serviceException = (BaseException) e;
            this.recode = serviceException.getCode();
            this.remsg = serviceException.getMsg();
        } else {
            fail(ErrorCodeEnum.FAIL);
        }
        return this;
    }

    public CommonResponse<T> fail(ErrorCodeEnum errorCodeEnum) {
        this.recode = errorCodeEnum.getRecode();
        this.remsg = errorCodeEnum.getRemsg();
        return this;
    }

    public CommonResponse<T> fail(String message) {
        this.recode = ErrorCodeEnum.FAIL.getRecode();
        this.remsg = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public String getRecode() {
        return this.recode;
    }

    public String getRemsg() {
        return this.remsg;
    }

    public void setRecode(String recode) {
        this.recode = recode;
    }

    public CommonResponse setRemsg(String remsg) {
        this.remsg = remsg;
        return this;
    }

    public CommonResponse<T> setCode(String code) {
        if(ErrorCodeEnum.CUSTOMER_SUCCESS.getRecode().equals(code)){
            code = ErrorCodeEnum.SUCCESS.getRecode();
        }
        this.recode = code;
        return this;
    }

    public void setMsg(String msg) {
        this.remsg = msg;
    }

    public void setStatus(String status) {
        this.state = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setErrorCodeEnum(ErrorCodeEnum errorCodeEnum){
        this.setRemsg(errorCodeEnum.getRemsg());
        this.setRecode(errorCodeEnum.getRecode());
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


    public CommonResponse excuteData(T data) {
        this.data = data;
        this.recode = ErrorCodeEnum.SUCCESS.getRecode();
        this.remsg = ErrorCodeEnum.SUCCESS.getRemsg();
        if (data instanceof Boolean && ((Boolean) data).booleanValue() == false ){
            this.recode = ErrorCodeEnum.FAIL.getRecode();
            this.remsg = ErrorCodeEnum.FAIL.getRemsg();
        }
        return this;
    }


}
