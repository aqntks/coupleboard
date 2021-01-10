package com.iph.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Plans2Repository extends JpaRepository<Plans2, Long>{

    @Query("SELECT p FROM Plans2 p ORDER BY p.id DESC")
    List<Plans2> findAllDesc();
    
    //오늘 일정
    @Query("SELECT p FROM Plans2 p WHERE p.save_date = CURRENT_DATE()")
    List<Plans2> findTodayPlan();

    //다가오는 일정(+10일)
    @Query("SELECT p FROM Plans2 p WHERE p.save_date BETWEEN CURRENT_DATE() AND CURRENT_DATE()+10 ORDER BY save_date")
    List<Plans2> findNextPlan();

}


