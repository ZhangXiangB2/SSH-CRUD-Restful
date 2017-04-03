package com.user.model;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;

public class UserService {
	
	private UserDAO_interface dao;
	
	public UserService() {
		ApplicationContext context = tools.ListenerClass.Listener_ForApplicationContext.context;
		dao = (UserDAO_interface) context.getBean("userDAO");
	}
	
	public UserVO insertUser(String aname , Integer aage, Date acreate_date){
		
		UserVO userVO = new UserVO();
		userVO.setName(aname);
		userVO.setAge(aage);
		userVO.setCreate_date(acreate_date);
		dao.insert(userVO);
		
		return userVO;
	}
	
	public UserVO insertUser(UserVO userVO){
		dao.insert(userVO);
		return userVO;
	}
	
	public UserVO updateUser(Integer aid , String aname , Integer aage, Date acreate_date){
		
		UserVO userVO = new UserVO();
		userVO.setId(aid);
		userVO.setName(aname);
		userVO.setAge(aage);
		userVO.setCreate_date(acreate_date);
		dao.update(userVO);
		
		return userVO;
	}
	
	public UserVO updateUser(UserVO userVO){
		dao.update(userVO);
		return userVO;
	}
	
	public void deleteUser(Integer aid){
		dao.delete(aid);
	}	
	
	public List<UserVO> getAll(){
		return dao.getAll();
	}
	
	public UserVO getOneUser(Integer aid){
		return dao.findByPrimaryKey(aid);
	}
	
}
