package com.lemon.rest;

import java.util.List;

import javax.annotation.Resource;

import com.lemon.pojo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.base.rest.BaseResponse;
import com.lemon.base.rest.BaseRest;
import com.lemon.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "用户信息服务")
@RestController
@RequestMapping("/api/userInfo")
public class UserInfoRest extends BaseRest {

    @Resource(name = "userService")
    private IUserService userService;

    @ApiOperation(value = "用户信息", notes = "根据ID获取")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<User>> getUserInfoById(@ApiParam(required = true, value = "用户id") @PathVariable(value = "id") Long userId) {
        User user = this.userService.getUserById(userId);
        BaseResponse<User> data = new BaseResponse<User>().success(user);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @ApiOperation(value = "用户列表", notes = "获取用户列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<List<User>>> listUserInfo() {
        List<User> userList = this.userService.listUsers();
        BaseResponse<List<User>> data = new BaseResponse<List<User>>().success(userList);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
