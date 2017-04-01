package com.user.model;

import java.util.List;

public interface UserDAO_interface {
	public void insert(UserVO auserVO);
	public void update(UserVO auserVO);
	public void delete(Integer aid);
	
	public UserVO findByPrimaryKey(Integer aid);
	public List<UserVO> getAll();
}
