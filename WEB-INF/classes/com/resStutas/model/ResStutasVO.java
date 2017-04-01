package com.resStutas.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResStutasVO implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private String success;
	private String error;
	
	public ResStutasVO(String asuccess, String aerror){
		this.success = asuccess;
		this.error = aerror;
	}

	public String getError() {
		return error;
	}
	public void setError(String aerror) {
		this.error = aerror;
	}

	public String getSuccess() {
		return success;
	}
	public void setSuccess(String asuccess) {
		this.success = asuccess;
	}
}
