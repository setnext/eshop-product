package com.setnext.eshop.products.services;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.setnext.eshop.products.interfaces.FileUploadSevice;

@Primary
@Service
public class S3FileUploadService implements FileUploadSevice {
	
	AWSCredentials awsCredentials = null;
	AmazonS3 s3Client = null;

	@Value("${amazonProperties.accessKey}")
    private String accessKey;
    @Value("${amazonProperties.secretKey}")
    private String secretKey;
    @Value("${amazonProperties.region}")
    private String region;
    
	
	
public S3FileUploadService() {
	this.awsCredentials = new BasicAWSCredentials("AKIA3D6CCC5F2TGMJMO4", "xoFbtT/cOBhBV7ZZSPJ1GqheiK3Lv7eMORVHScFD");
	this.s3Client = AmazonS3ClientBuilder.standard()
            .withRegion("us-east-1")
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .build();
	
}
	
   


	
	 

	@Override
	public void init() {

		

	}

	

	@Override
	public Resource load(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<Path> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}







	@Override
	public void save(MultipartFile file, String fileName) {

		ObjectMetadata objectMetadata = new ObjectMetadata();
		
		fileName = fileName.replace(' ', '_');
        
		
		try {
			s3Client.putObject("setnext-eshop","images/"+fileName,file.getInputStream(),objectMetadata);
			
		} catch (SdkClientException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
