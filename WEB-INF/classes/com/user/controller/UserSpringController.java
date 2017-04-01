package com.user.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.user.model.*;
import com.user.resStutas.model.*;

@RestController
@RequestMapping("/user") 
public class UserSpringController {
	
	UserService userSvc = new UserService();
	
	@RequestMapping(method = RequestMethod.POST, value = "/create")
	public Object insertUser(@RequestBody UserVO userVO) {
		
		if(userVO.getName() == null || userVO.getName().trim().length() == 0){
			return new ResStutasVO(null, "Name can't be Null");
		}
			
		userVO.setCreate_date(new Date(System.currentTimeMillis()));
		userSvc.insertUser(userVO);
		
		return new ResStutasVO("true", null);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/update")
	public Object updateUser(@RequestBody UserVO userVO) {
		
		UserVO updateUserVO = userSvc.getOneUser(userVO.getId());
		
		if(updateUserVO == null){
			return new ResStutasVO(null, "User isn't exists");
		}
		
		if(userVO.getName() != null || userVO.getName().trim().length() != 0)
		updateUserVO.setName(userVO.getName());
		
		if(userVO.getAge() != null)
		updateUserVO.setAge(userVO.getAge());
		userSvc.updateUser(updateUserVO);
		
		return new ResStutasVO("true", null);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/delete")
	public Object deleteUser(@RequestBody UserVO userVO) {
		
		userSvc.deleteUser(userVO.getId());
		return new ResStutasVO("true", null);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/find-by-id")
	public Object getOneUser(@RequestBody UserVO userVO) {
		
		userVO = userSvc.getOneUser(userVO.getId());
		
		if(userVO == null){
			return new ResStutasVO(null, "User isn't exists");
		}
		
		return new UserVO(null, userVO.getName(), userVO.getAge(), new SimpleDateFormat("yyyy/MM/dd").format(userVO.getCreate_date()));
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/all")
	public Object getAllUser(){
		
		List<UserVO> user_list = userSvc.getAll();
		
		if(user_list.size() == 0 || user_list == null){
			return new ResStutasVO(null, "No User in DB");
		}
		
		return user_list;
	}
	
	
}
