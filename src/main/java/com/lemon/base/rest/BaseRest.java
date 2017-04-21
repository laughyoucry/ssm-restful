package com.lemon.base.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * 基础 rest 类
 *
 * @author lemo
 * @date 2017/4/20
 */
public abstract class BaseRest {

    public BaseRest() {
    }

    protected ResponseEntity<BaseResponse> success() {
        BaseResponse response = BaseResponse.SIMPLE_SUCCESS;
        return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);
    }
}
