package com.iph.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Plans2Repository extends JpaRepository<Plans2, Long>{

    @Query("SELECT p FROM Plans2 p ORDER BY p.id DESC")
    List<Plans2> findAllDesc();

    @Query(value = "SELECT * FROM plans2 p WHERE p.year = DATE_FORMAT(curdate() , '%Y') " +
            "AND p.month = DATE_FORMAT(curdate() , '%c') AND p.date = DATE_FORMAT(curdate() , '%d')", nativeQuery = true)
    List<Plans2> findTodayPlan();
}
