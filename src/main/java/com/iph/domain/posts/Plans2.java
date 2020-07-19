package com.iph.domain.posts;

import com.iph.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Plans2 extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String year;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String month;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String date;

    @Column(columnDefinition = "TEXT")
    private String place;

    @Column
    private String content;

    @Builder
    public Plans2(String year, String month, String date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
    }

    public void update(String year, String month,String date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
    }
}
