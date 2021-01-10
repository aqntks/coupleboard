package com.iph.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class Plans2UpdateRequestDto {
    private Integer year;
    private Integer month;
    private Integer date;
    private LocalDate save_date;
    private String place;
    private String content;

    @Builder
    public Plans2UpdateRequestDto(Integer year, Integer month, Integer date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.save_date = LocalDate.of(year, month, date);
    }
}
