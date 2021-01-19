package com.iph.web.dto;

import com.iph.domain.posts.Gallery;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NewProfileTempDto {
    private String user1_name;
    private String user2_name;
    private Integer start_year;
    private Integer start_month;
    private Integer start_date;

    @Builder
    public NewProfileTempDto(String user1_name, String user2_name, Integer start_year, Integer start_month, Integer start_date){
        this.user1_name = user1_name;
        this.user2_name = user2_name;
        this.start_year = start_year;
        this.start_month = start_month;
        this.start_date = start_date;
    }
}
