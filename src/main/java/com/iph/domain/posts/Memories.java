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
public class Memories extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private Integer year;

    @Column(columnDefinition = "TEXT", nullable = false)
    private Integer month;

    @Column(columnDefinition = "TEXT", nullable = false)
    private Integer date;

    @Column
    private LocalDate save_date;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String place;

    @Column
    private String content;

    @Column
    private String img_path;

    @Builder
    public Memories(Integer year, Integer month, Integer date, String place, String content, String img_path){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.img_path = img_path;
        this.save_date = LocalDate.of(year, month, date);
    }

    public void update(Integer year, Integer month, Integer date, String place, String content, String img_path){
        this.year = year;
        this.month = month;
        this.date = date;
        this.place = place;
        this.content = content;
        this.img_path = img_path;
        this.save_date = LocalDate.of(year, month, date);
    }
}
