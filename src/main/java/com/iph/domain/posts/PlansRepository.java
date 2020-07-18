package com.iph.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PlansRepository extends JpaRepository<Plans, Long>{

    @Query("SELECT m FROM Plans m ORDER BY m.id DESC")
    List<Plans> findAllDesc();
}
