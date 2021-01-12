package com.iph.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class MemoriesUpdateRequestDto {
    private Integer year;
    private Integer month;
    private Integer date;
    private LocalDate save_date;
    private String place;
    private String content;
    private String img_path;

    @Builder
    public MemoriesUpdateRequestDto(Integer year, Integer month, Integer date, String place, String content, String img_path){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.img_path = img_path;
        this.save_date = LocalDate.of(year, month, date);
    }
}
