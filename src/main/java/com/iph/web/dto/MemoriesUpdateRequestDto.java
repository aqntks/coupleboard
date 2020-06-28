package com.iph.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemoriesUpdateRequestDto {
    private String year;
    private String month;
    private String date;
    private String place;
    private String content;

    @Builder
    public MemoriesUpdateRequestDto(String year, String month, String date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
    }
}
