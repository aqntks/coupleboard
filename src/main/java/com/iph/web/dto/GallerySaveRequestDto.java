package com.iph.web.dto;

import com.iph.domain.posts.Gallery;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GallerySaveRequestDto {
    private String title;
    private String img_path;

    @Builder
    public GallerySaveRequestDto(String title, String img_path){
        this.title = title;
        this.img_path = img_path;
    }

    public Gallery toEntity(){
        return Gallery.builder()
                .title(title)
                .img_path(img_path)
                .build();
    }
}
