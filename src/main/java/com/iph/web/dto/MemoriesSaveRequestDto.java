package com.iph.web.dto;

import com.iph.domain.posts.Memories;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemoriesSaveRequestDto {
    private String year;
    private String month;
    private String date;
    private String place;
    private String content;
    @Builder
    public MemoriesSaveRequestDto(String year, String month, String date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
    }

    public Memories toEntity(){
        return Memories.builder()
                .year(year)
                .month(month)
                .date(date)
                .place(place)
                .content(content)
                .build();
    }
}
