//package com.example.demo.domain;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "image")
//@Getter
//@Setter
//@NoArgsConstructor
//@EntityListeners(AuditingEntityListener.class)
//public class Image {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "title", nullable = false)
//    private String title;
//
//    @Column(name = "image_url", nullable = false)
//    private String imageUrl;
//
//
//    @CreatedDate
//    @Column(name = "upload_date")
//    private LocalDateTime uploadDate;
//
//    public Image(String title, String imageUrl) {
//        this.title = title;
//        this.imageUrl = imageUrl;
//    }
//
//
//}
