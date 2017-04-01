package com.user.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserVO implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Integer age;
	private Date create_date;
	private String create_date_format;
	
	public UserVO(){}
	
	public UserVO(Integer aid, String aname, Integer aage, String create_date_format){
		this.id = aid;
		this.name = aname;
		this.age = aage;
		this.create_date_format = create_date_format;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer aid) {
		this.id = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String aname) {
		this.name = aname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer aage) {
		this.age = aage;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date acreate_date) {
		this.create_date = acreate_date;
	}
	public String getCreate_date_format() {
		return create_date_format;
	}
	public void setCreate_date_format(String acreate_date_format) {
		this.create_date_format = acreate_date_format;
	}
	
	
}
