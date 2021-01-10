package com.iph.web.dto;

import com.iph.domain.posts.Plans2;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Plans2ResponseDto {

    private Long id;
    private Integer year;
    private Integer month;
    private Integer date;
    private LocalDate save_date;
    private String place;
    private String content;

    public Plans2ResponseDto(Plans2 entity){
        this.id = entity.getId();
        this.year = entity.getYear();
        this.month = entity.getMonth();
        this.date = entity.getDate();
        this.save_date = entity.getSave_date();
        this.place = entity.getPlace();
        this.content = entity.getContent();

    }
}
