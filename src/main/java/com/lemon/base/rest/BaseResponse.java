package com.lemon.base.rest;

/**
 * rest 统一返回类 <br/>
 * 
 * @author lemo
 * @date 2017/04/20
 */
public class BaseResponse<T> {

    private static final String CODE_SUCCESS = "0";
    public static final BaseResponse SIMPLE_SUCCESS = (new BaseResponse()).success();

    /** 消息头 */
    private BaseResponse<T>.Meta meta;
    /** 数据载体 */
    private T data;

    public BaseResponse() {
    }

    public BaseResponse success() {
        this.meta = new BaseResponse.Meta(CODE_SUCCESS);
        return this;
    }

    public BaseResponse success(T data) {
        this.meta = new BaseResponse.Meta(CODE_SUCCESS);
        this.data = data;
        return this;
    }

    public BaseResponse failure(String code, String msg) {
        return this.failure(code, msg, null, false);
    }

    public BaseResponse failure(String code, String[] msgs) {
        return this.failure(code, null, msgs, false);
    }

    public BaseResponse failure(String code, String msg, String[] msgs, boolean filter) {
        this.meta = new BaseResponse.Meta(code, msg, msgs, filter);
        return this;
    }

    /**
     * 设置特殊标识
     */
    public void setFilter() {
        this.meta.setFilter(true);
    }

    public Meta getMeta() {
        return this.meta;
    }

    public T getData() {
        return this.data;
    }

    /**
     * 消息头
     */
    public class Meta {
        /** 返回码 */
        private String code;
        /** 错误提示 */
        private String msg;
        /** 错误提示组 */
        private String[] msgs;
        /** 特殊标识 */
        private boolean filter = false;

        public Meta(String code) {
            this(code, null, null, false);
        }

        public Meta(String code, String msg) {
            this(code, msg, null, false);
        }

        public Meta(String code, String msg, String[] msgs) {
            this(code, msg, msgs, false);
        }

        public Meta(String code, String msg, String[] msgs, boolean filter) {
            this.code = code;
            this.msg = msg;
            this.msgs = msgs;
            this.filter = filter;
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

        public String[] getMsgs() {
            return msgs;
        }

        public void setMsgs(String[] msgs) {
            this.msgs = msgs;
        }

        public boolean isFilter() {
            return filter;
        }

        public void setFilter(boolean filter) {
            this.filter = filter;
        }
    }
}
