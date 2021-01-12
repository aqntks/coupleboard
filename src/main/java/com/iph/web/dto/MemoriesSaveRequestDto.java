package com.iph.web.dto;

import com.iph.domain.posts.Memories;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class MemoriesSaveRequestDto {
    private Integer year;
    private Integer month;
    private Integer date;
    private LocalDate save_date;
    private String place;
    private String content;
    private String img_path;

    @Builder
    public MemoriesSaveRequestDto(Integer year, Integer month, Integer date, String place, String content, String img_path){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.img_path = img_path;
        this.save_date = LocalDate.of(year, month, date);
    }

    public Memories toEntity(){
        return Memories.builder()
                .year(year)
                .month(month)
                .date(date)
                .place(place)
                .content(content)
                .img_path(img_path)
                .build();
    }
}
