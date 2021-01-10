package com.iph.web.dto;

import com.iph.domain.posts.Plans2;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class Plans2SaveRequestDto {
    private Integer year;
    private Integer month;
    private Integer date;
    private LocalDate save_date;
    private String place;
    private String content;
    @Builder
    public Plans2SaveRequestDto(Integer year, Integer month, Integer date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.save_date = LocalDate.of(year, month, date);
    }

    public Plans2 toEntity(){
        return Plans2.builder()
                .year(year)
                .month(month)
                .date(date)
                .place(place)
                .content(content)
                .build();
    }
}
