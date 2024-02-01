package com.uploadingImage.uploadingImageToS3.serviceImpl;

import com.uploadingImage.uploadingImageToS3.dto.UploadImageResponse;
import com.uploadingImage.uploadingImageToS3.model.UploadFile;
import com.uploadingImage.uploadingImageToS3.model.UploadProfile;
import com.uploadingImage.uploadingImageToS3.repositary.UploadImageRepositary;
import com.uploadingImage.uploadingImageToS3.service.UploadImageService;
import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class UploadImageServiceImple implements UploadImageService {
	
	@Autowired
	private UploadImageRepositary uploadImageRepositary;
	
	@Autowired
	UploadImageResponse response;
	
	@Autowired
	MessageSource messages;

	@Override
	public UploadImageResponse uploadFile(UploadProfile request) {
		UploadFile uploadFile = new UploadFile();
		byte[] image = null;
		image = isNotEmpty(request
				.getImage()) ? Base64.getDecoder().decode(request.getImage().split(",")[1].trim().getBytes(StandardCharsets.UTF_8)):null;
		uploadFile.setImage(image);
		System.out.println(image);
		uploadFile.setUserId(request.getUserId());
		uploadImageRepositary.save(uploadFile);
		response.setMessage(messages.getMessage("IMAGE_UPLOADED_SUCCESSFULLY", null, Locale.ENGLISH));
		response.setSuccess(true);
		response.setUserId(request.getUserId());
		return response;
	}
	
	public UploadImageResponse getImage(Integer userId) {
		UploadFile uploadFile = uploadImageRepositary.findById(userId).get();
		System.out.println(uploadFile.getImage());
		String encodeedImage = isNotEmpty(uploadFile.getImage()) ? Base64.getEncoder().encodeToString(uploadFile.getImage()):null;
		System.out.println(encodeedImage);
		response.setMessage(encodeedImage);
		response.setSuccess(true);
		response.setUserId(userId);
		return response;
		
	}

}
