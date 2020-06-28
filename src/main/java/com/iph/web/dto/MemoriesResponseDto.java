package com.iph.web.dto;

import com.iph.domain.posts.Memories;
import lombok.Getter;

@Getter
public class MemoriesResponseDto {

    private Long id;
    private String year;
    private String month;
    private String date;
    private String place;
    private String content;

    public MemoriesResponseDto(Memories entity){
        this.id = entity.getId();
        this.year = entity.getYear();
        this.month = entity.getMonth();
        this.date = entity.getDate();
        this.place = entity.getPlace();
        this.content = entity.getContent();

    }
}
