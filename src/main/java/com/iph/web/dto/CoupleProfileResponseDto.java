package com.iph.web.dto;

import com.iph.domain.posts.CoupleProfile;
import com.iph.domain.posts.Memories;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class CoupleProfileResponseDto {

    private Long id;
    private String user1_name;
    private String user1_job;
    private Integer user1_year;
    private Integer user1_month;
    private Integer user1_date;
    private String user1_address;
    private String user1_instagram;
    private String user1_facebook;
    private String user1_email;
    private String user1_img_path;
    private String user1_about;
    private String user2_name;
    private String user2_job;
    private Integer user2_year;
    private Integer user2_month;
    private Integer user2_date;
    private String user2_address;
    private String user2_instagram;
    private String user2_facebook;
    private String user2_email;
    private String user2_img_path;
    private String user2_about;
    private Integer start_year;
    private Integer start_month;
    private Integer start_date;
    private LocalDate start_day;

    public CoupleProfileResponseDto(CoupleProfile entity){
        this.id = entity.getId();
        this.user1_name = entity.getUser1_name();
        this.user1_job = entity.getUser1_job();
        this.user1_year = entity.getUser1_year();
        this.user1_month = entity.getUser1_month();
        this.user1_date = entity.getUser1_date();
        this.user1_address = entity.getUser1_address();
        this.user1_instagram = entity.getUser1_instagram();
        this.user1_facebook = entity.getUser1_facebook();
        this.user1_email = entity.getUser1_email();
        this.user1_img_path = entity.getUser1_img_path();
        this.user1_about = entity.getUser1_about();
        this.user2_name = entity.getUser2_name();
        this.user2_job = entity.getUser2_job();
        this.user2_year = entity.getUser2_year();
        this.user2_month = entity.getUser2_month();
        this.user2_date = entity.getUser2_date();
        this.user2_address = entity.getUser2_address();
        this.user2_instagram = entity.getUser2_instagram();
        this.user2_facebook = entity.getUser2_facebook();
        this.user2_email = entity.getUser2_email();
        this.user2_img_path = entity.getUser2_img_path();
        this.user2_about = entity.getUser2_about();
        this.start_year = entity.getStart_year();
        this.start_month = entity.getStart_month();
        this.start_date = entity.getStart_date();
        this.start_day = entity.getStart_day();
    }
}
