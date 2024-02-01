package com.uploadingImage.uploadingImageToS3.dto;

import org.springframework.stereotype.Component;

@Component
public class UploadImageResponse {

	private Integer userId;
	private String message;
	private Boolean success;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
}
