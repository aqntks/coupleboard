package com.iph.domain.posts;

import com.iph.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class CoupleProfile extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String user1_name;

    @Column(columnDefinition = "TEXT")
    private String user1_job;

    @Column(columnDefinition = "TEXT")
    private String user1_year;

    @Column(columnDefinition = "TEXT")
    private String user1_month;

    @Column(columnDefinition = "TEXT")
    private String user1_date;

    @Column(columnDefinition = "TEXT")
    private String user1_address;

    @Column(columnDefinition = "TEXT")
    private String user1_instagram;

    @Column(columnDefinition = "TEXT")
    private String user1_facebook;

    @Column(columnDefinition = "TEXT")
    private String user1_email;

    @Column(columnDefinition = "TEXT")
    private String user1_img_path;

    @Column
    private String user1_about;

    @Column(columnDefinition = "TEXT")
    private String user2_name;

    @Column(columnDefinition = "TEXT")
    private String user2_job;

    @Column(columnDefinition = "TEXT")
    private String user2_year;

    @Column(columnDefinition = "TEXT")
    private String user2_month;

    @Column(columnDefinition = "TEXT")
    private String user2_date;

    @Column(columnDefinition = "TEXT")
    private String user2_address;

    @Column(columnDefinition = "TEXT")
    private String user2_instagram;

    @Column(columnDefinition = "TEXT")
    private String user2_facebook;

    @Column(columnDefinition = "TEXT")
    private String user2_email;

    @Column(columnDefinition = "TEXT")
    private String user2_img_path;

    @Column
    private String user2_about;

    @Builder
    public CoupleProfile(String user1_name, String user1_job, String user1_year, String user1_month, String user1_date,
                         String user1_address, String user1_instagram, String user1_facebook, String user1_email,
                         String user1_img_path, String user1_about, String user2_name, String user2_job,
                         String user2_year, String user2_month, String user2_date,
                         String user2_address, String user2_instagram, String user2_facebook, String user2_email,
                         String user2_img_path, String user2_about){
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

    }

    public void update(String user1_name, String user1_job, String user1_year, String user1_month, String user1_date,
                       String user1_address, String user1_instagram, String user1_facebook, String user1_email,
                       String user1_img_path, String user1_about, String user2_name, String user2_job,
                       String user2_year, String user2_month, String user2_date,
                       String user2_address, String user2_instagram, String user2_facebook, String user2_email,
                       String user2_img_path, String user2_about){
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
    }
}
