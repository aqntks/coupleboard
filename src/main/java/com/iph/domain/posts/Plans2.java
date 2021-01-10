package com.iph.domain.posts;

import com.iph.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@NoArgsConstructor
@Entity
public class Plans2 extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private Integer month;

    @Column(nullable = false)
    private Integer date;

    @Column
    private LocalDate save_date;

    @Column(columnDefinition = "TEXT")
    private String place;

    @Column
    private String content;

    @Builder
    public Plans2(Integer year, Integer month, Integer date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.save_date = LocalDate.of(year, month, date);
    }

    public void update(Integer year, Integer month, Integer date, String place, String content){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.save_date = LocalDate.of(year, month, date);
    }
}
