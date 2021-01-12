package com.iph.web.dto;

import com.iph.domain.posts.Memories;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MemoriesResponseDto {

    private Long id;
    private Integer year;
    private Integer month;
    private Integer date;
    private LocalDate save_date;
    private String place;
    private String content;
    private String img_path;

    public MemoriesResponseDto(Memories entity){
        this.id = entity.getId();
        this.year = entity.getYear();
        this.month = entity.getMonth();
        this.date = entity.getDate();
        this.save_date = entity.getSave_date();
        this.place = entity.getPlace();
        this.content = entity.getContent();
        this.img_path = entity.getImg_path();

    }
}
