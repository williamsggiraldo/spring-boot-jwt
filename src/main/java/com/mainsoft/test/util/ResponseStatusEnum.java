package com.mainsoft.test.util;

public enum ResponseStatusEnum {

	SUCCESS(1,"Request Received"),
	UNAUTHORIZED(-1,"Authentication Error"),
	BAD_REQUEST(-2,"Bad Request"),
	NOT_DATA_FOUND(-3,"No Data Found");
	
	private int code;
	private String description;
	
	ResponseStatusEnum(int code, String description){
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
