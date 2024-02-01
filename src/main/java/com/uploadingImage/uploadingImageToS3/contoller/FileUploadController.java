package com.uploadingImage.uploadingImageToS3.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uploadingImage.uploadingImageToS3.dto.UploadImageResponse;
import com.uploadingImage.uploadingImageToS3.model.UploadProfile;
import com.uploadingImage.uploadingImageToS3.service.UploadImageService;

@RestController
@RequestMapping("upload")
public class FileUploadController {
	
	@Autowired
	private UploadImageService uploadImageService;
	
	@PostMapping("/image")
	public UploadImageResponse uploadImage(@RequestBody UploadProfile request){
		return uploadImageService.uploadFile(request);
	}
	
	@GetMapping("/get-image/{userId}")
	public UploadImageResponse getImage(@PathVariable Integer userId){
		return uploadImageService.getImage(userId);
	}
	

}
