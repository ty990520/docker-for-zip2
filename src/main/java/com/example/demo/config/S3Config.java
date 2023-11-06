//package com.example.demo.config;
//
//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class S3Config {
////
////    @Value("${credentials.accessKey}")
////    private String accessKey;
////
////    @Value("${credentials.secretKey}")
////    private String secretKey;
//
//    @Value("${s3.bucket}")
//    private String bucketName;
//
//    @Value("${region.static}")
//    private String region;
//
//    @Bean
//    public AmazonS3 amazonS3Client() {
////        AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
//        return AmazonS3ClientBuilder.standard()
//                .withRegion(region)
////                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
//                .build();
//    }
//
//    @Bean
//    public String s3BucketName() {
//        return bucketName;
//    }
//}
