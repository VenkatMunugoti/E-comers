package com.uploadingImage.uploadingImageToS3.model;

import javax.validation.constraints.Min;

public class UploadProfile {

	@Min(value = 1, message = "userId should grater than 0")
	private Integer userId;
	private String filePath;
	private String image;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
