//package com.example.demo.service;
//
//import com.example.demo.domain.Image;
//import com.example.demo.repository.ImageRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ImageService {
//
//    private final ImageRepository imageRepository;
//
//    @Autowired
//    public ImageService(ImageRepository imageRepository) {
//        this.imageRepository = imageRepository;
//    }
//
//    public Image saveImage(Image image) {
//        return imageRepository.save(image);
//    }
//
//    public Image getImage(Long id) {
//        return imageRepository.findById(id).orElseThrow(() -> new RuntimeException("Image not found with id: " + id));
//    }
//
//    public List<Image> getAllImages() {
//        return imageRepository.findAll();
//    }
//
//    public void deleteImage(Long id) {
//        imageRepository.deleteById(id);
//    }
//
//}
