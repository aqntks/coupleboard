package com.iph.web.dto;

import com.iph.domain.posts.CoupleProfile;
import com.iph.domain.posts.Memories;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class CoupleProfileSaveRequestDto {

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

    @Builder
    public CoupleProfileSaveRequestDto(String user1_name, String user1_job, Integer user1_year, Integer user1_month, Integer user1_date,
                                       String user1_address, String user1_instagram, String user1_facebook, String user1_email,
                                       String user1_img_path, String user1_about, String user2_name, String user2_job,
                                       Integer user2_year, Integer user2_month, Integer user2_date,
                                       String user2_address, String user2_instagram, String user2_facebook, String user2_email,
                                       String user2_img_path, String user2_about, Integer start_year, Integer start_month, Integer start_date){
        this.user1_name = user1_name;
        this.user1_job = user1_job;
        this.user1_year = user1_year;
        this.user1_month = user1_month;
        this.user1_date = user1_date;
        this.user1_address = user1_address;
        this.user1_instagram = user1_instagram;
        this.user1_facebook = user1_facebook;
        this.user1_email = user1_email;
        this.user1_img_path = user1_img_path;
        this.user1_about = user1_about;
        this.user2_name = user2_name;
        this.user2_job = user2_job;
        this.user2_year = user2_year;
        this.user2_month = user2_month;
        this.user2_date = user2_date;
        this.user2_address = user2_address;
        this.user2_instagram = user2_instagram;
        this.user2_facebook = user2_facebook;
        this.user2_email = user2_email;
        this.user2_img_path = user2_img_path;
        this.user2_about = user2_about;
        this.start_year = start_year;
        this.start_month = start_month;
        this.start_date = start_date;
        this.start_day = LocalDate.of(start_year, start_month, start_date);
    }

    public CoupleProfile toEntity(){
        return CoupleProfile.builder()
                .user1_name(user1_name)
                .user1_job(user1_job)
                .user1_year(user1_year)
                .user1_month(user1_month)
                .user1_date(user1_date)
                .user1_address(user1_address)
                .user1_instagram(user1_instagram)
                .user1_facebook(user1_facebook)
                .user1_email(user1_email)
                .user1_img_path(user1_img_path)
                .user1_about(user1_about)
                .user2_name(user2_name)
                .user2_job(user2_job)
                .user2_year(user2_year)
                .user2_month(user2_month)
                .user2_date(user2_date)
                .user2_address(user2_address)
                .user2_instagram(user2_instagram)
                .user2_facebook(user2_facebook)
                .user2_email(user2_email)
                .user2_img_path(user2_img_path)
                .user2_about(user2_about)
                .start_year(start_year)
                .start_month(start_month)
                .start_date(start_date)
                .build();
    }
}
