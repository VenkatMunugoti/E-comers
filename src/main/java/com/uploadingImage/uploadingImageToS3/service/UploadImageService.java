package com.uploadingImage.uploadingImageToS3.service;

import com.uploadingImage.uploadingImageToS3.dto.UploadImageResponse;
import com.uploadingImage.uploadingImageToS3.model.UploadProfile;

public interface UploadImageService {

	public UploadImageResponse  uploadFile(UploadProfile request);
	
	public UploadImageResponse getImage(Integer userId);
	
}
