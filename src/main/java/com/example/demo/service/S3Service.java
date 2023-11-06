//package com.example.demo.service;
//
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.model.ObjectMetadata;
//import com.amazonaws.services.s3.model.PutObjectRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//@Service
//public class S3Service {
//
//    private final AmazonS3 s3Client;
//    private final String bucketName;
//
//    @Autowired
//    public S3Service(AmazonS3 s3Client, @Value("${s3.bucket}") String bucketName) {
//        this.s3Client = s3Client;
//        this.bucketName = bucketName;
//    }
//
//
//    public String uploadFile(String fileName, MultipartFile file) {
//        // 파일을 업로드하는 PutObjectRequest를 생성합니다.
//        ObjectMetadata metadata = new ObjectMetadata();
//        metadata.setContentLength(file.getSize());
//        metadata.setContentType(file.getContentType());
//
//        try (InputStream fileInputStream = file.getInputStream()) {
//            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName, fileInputStream, metadata);
//
//            // S3 버킷에 파일을 업로드합니다.
//            s3Client.putObject(putObjectRequest);
//
//            // 업로드 성공 여부를 확인할 수 있습니다.
//            // URL 인코딩은 파일 이름에 특수 문자가 포함될 경우를 대비합니다.
//            return s3Client.getUrl(bucketName, fileName).toString();
//        } catch (IOException e) {
//            // 적절한 예외 처리를 해야 합니다. 예를 들면, 로그를 기록하고 사용자 정의 예외를 던질 수 있습니다.
//            throw new RuntimeException("S3 파일 업로드 중 오류 발생", e);
//        }
//    }
//}
