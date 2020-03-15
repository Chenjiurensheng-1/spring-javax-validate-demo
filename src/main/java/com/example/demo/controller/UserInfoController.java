package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户测试用例
 * @author 程就人生
 * @Date
 */
@Api(tags = "用户信息", description = "UserInfoController")
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

	private static Logger log = LoggerFactory.getLogger(UserInfoController.class);
	
	@PostMapping
	@ApiOperation(value = "新增",notes="用户信息", httpMethod="POST")
	public UserInfo addUserInfo(@Validated UserInfo userInfo, BindingResult errors){
		//对表单进行验证
		if (errors.hasErrors()){
           //对错误集合进行遍历,有的话,直接放入map集合中
			errors.getFieldErrors().forEach(p->{
               throw new RuntimeException(p.getDefaultMessage());
           });
        }
		log.info("全部验证通过~！");
		return userInfo;
	}
}
