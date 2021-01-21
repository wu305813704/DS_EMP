package com.sunyard.emp.exception;

import com.sunyard.emp.enumes.ErrorCodeEnum;

public class BaseException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7654774193130809084L;

    private String code;
    private String msg;

    public BaseException() {
    }

    public BaseException(String code, String msg) {
        super("【code=" + code + ",msg=" + msg + "】");
        this.code = code;
        this.msg = msg;
    }

    public BaseException(ErrorCodeEnum errorCodeEnum) {
        super("【code=" + errorCodeEnum.getRecode() + ",msg=" + errorCodeEnum.getRemsg() + "】");
        this.code = errorCodeEnum.getRecode();
        this.msg = errorCodeEnum.getRemsg();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BaseException(Throwable ex) {
        super(ex);
        if (ex instanceof BaseException) {
            BaseException e = (BaseException) ex;
            this.code = e.getCode();
            this.msg = e.getMsg();
        } else {
            this.code = ErrorCodeEnum.FAIL.getRecode();
            this.msg = ex.getMessage();
        }
    }

    public BaseException(String message) {
        super(message);
        this.code = ErrorCodeEnum.FAIL.getRecode();
        this.msg = message;
    }

    public BaseException(String message, Throwable ex) {
        super(message, ex);
    }


}
