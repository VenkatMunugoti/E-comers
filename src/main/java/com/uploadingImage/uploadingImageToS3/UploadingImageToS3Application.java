package com.uploadingImage.uploadingImageToS3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class UploadingImageToS3Application {

	public static void main(String[] args) {
		SpringApplication.run(UploadingImageToS3Application.class, args);
	}
	
	@Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames(
                "classpath:/messages"
        );
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}
