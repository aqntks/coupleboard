package com.iph.web.dto;

import com.iph.domain.posts.Gallery;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class GalleryListResponseDto {
    private Long id;
    private String title;
    private String img_path;
    private LocalDateTime modifiedDate;

    public GalleryListResponseDto(Gallery entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.img_path = entity.getImg_path();
        this.modifiedDate = entity.getModifiedDate();
    }
}
