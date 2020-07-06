package com.iph.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GalleryUpdateRequestDto {
    private String title;
    private String img_path;


    @Builder
    public GalleryUpdateRequestDto(String title, String img_path){
        this.title = title;
        this.img_path = img_path;
    }
}
