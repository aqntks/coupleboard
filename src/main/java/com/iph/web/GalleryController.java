/*
package com.iph.web;

import com.iph.service.GalleryService;
import com.iph.service.S3Service;
import com.iph.web.dto.GallerySaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@AllArgsConstructor
public class GalleryController {
    private S3Service s3Service;
    private GalleryService galleryService;

    @GetMapping("/gallery")
    public String dispWrite() {

        return "gallery";
    }

    @PostMapping("/gallery")
    public String execWrite(GallerySaveRequestDto requestDto, MultipartFile file) throws IOException {
        String imgPath = s3Service.upload(file);
        requestDto.setImg_path(imgPath);
        galleryService.save(requestDto);

        return "redirect:gallery";
    }
}

 */
