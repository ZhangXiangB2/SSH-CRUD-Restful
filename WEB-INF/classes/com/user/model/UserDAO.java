package com.user.model;

import java.util.*;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class UserDAO implements UserDAO_interface{
	
	private static final String GETALL_STMT = "from UserVO order by id";
	
	private HibernateTemplate hibernateTemplate;    
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) { 
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void insert(UserVO auserVO) {
		hibernateTemplate.save(auserVO);
	}
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void update(UserVO auserVO) {
		hibernateTemplate.update(auserVO);
	}
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void delete(Integer aid) {
		UserVO userVO = new UserVO();
		userVO.setId(aid);
		hibernateTemplate.delete(userVO);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserVO> getAll() {
		return (List<UserVO>) hibernateTemplate.find(GETALL_STMT);
	}

	@Override
	public UserVO findByPrimaryKey(Integer aid) {
		return (UserVO) hibernateTemplate.get(UserVO.class, aid);
	}


}
