package com.uploadingImage.uploadingImageToS3.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uploadingImage.uploadingImageToS3.model.UploadFile;

@Repository
public interface UploadImageRepositary extends JpaRepository<UploadFile, Integer> {

}
