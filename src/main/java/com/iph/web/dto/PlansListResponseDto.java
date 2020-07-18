package com.iph.web.dto;

import com.iph.domain.posts.Memories;
import com.iph.domain.posts.Plans;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class PlansListResponseDto {
    private Long id;
    private String year;
    private String month;
    private String date;
    private String place;
    private String content;
    private LocalDateTime modifiedDate;

    public PlansListResponseDto(Plans entity) {
        this.id = entity.getId();
        this.year = entity.getYear();
        this.month = entity.getMonth();
        this.date = entity.getDate();
        this.place = entity.getPlace();
        this.content = entity.getContent();
        this.modifiedDate = entity.getModifiedDate();
    }
}
