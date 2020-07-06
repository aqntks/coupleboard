package com.iph.web.dto;

import com.iph.domain.posts.Gallery;
import lombok.Getter;

@Getter
public class GalleryResponseDto {

    private Long id;
    private String title;
    private String img_path;

    public GalleryResponseDto(Gallery entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.img_path = entity.getImg_path();
    }
}
