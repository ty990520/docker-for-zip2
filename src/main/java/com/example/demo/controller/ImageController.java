//package com.example.demo.controller;
//
//import com.example.demo.domain.Image;
//import com.example.demo.service.ImageService;
//import com.example.demo.service.S3Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@RequestMapping("/api/images")
//public class ImageController {
//
//    private final ImageService imageService;
//    private final S3Service s3Service;
//
//    @Autowired
//    public ImageController(ImageService imageService, S3Service s3Service) {
//        this.imageService = imageService;
//        this.s3Service = s3Service;
//    }
//
//    @PostMapping
//    public void uploadImage(@RequestParam("title") String title,
//                            @RequestParam("file") MultipartFile file,
//                            HttpServletResponse response) throws IOException {
//        try {
//            // 파일을 처리하고 이미지 URL을 생성하는 로직
//            String fileName = generateUniqueFileName(file.getOriginalFilename());
//            String imageUrl = s3Service.uploadFile(fileName, file);
//
//            // 이미지 객체를 생성하고 저장
//            Image image = new Image(title, imageUrl);
//            Image savedImage = imageService.saveImage(image);
//
//            // 성공 시 /redirect 경로로 리다이렉트
//            response.sendRedirect("/redirect");
//        } catch (Exception e) { // IOException 외에 다른 예외도 발생할 수 있으므로 Exception으로 처리합니다.
//            // 파일 처리 중 오류 발생 시 적절한 예외 처리를 구현해야 합니다.
//            // 로그를 남기는 것이 좋습니다.
//            e.printStackTrace(); // 로그로 대체해야 합니다.
//            response.sendRedirect("/error.html");
//        }
//    }
//
//
//    private String generateUniqueFileName(String originalFilename) {
//        // 파일명 중복 방지를 위해 UUID를 파일명에 추가합니다.
//        return UUID.randomUUID().toString() + "_" + originalFilename;
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Image> getImage(@PathVariable Long id) {
//        Image image = imageService.getImage(id);
//        return ResponseEntity.ok(image);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Image>> listImages() {
//        List<Image> images = imageService.getAllImages();
//        return ResponseEntity.ok(images);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteImage(@PathVariable Long id) {
//        imageService.deleteImage(id);
//        return ResponseEntity.ok().build();
//    }
//
//}