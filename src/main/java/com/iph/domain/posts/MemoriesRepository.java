package com.iph.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MemoriesRepository extends JpaRepository<Memories, Long>{

    @Query("SELECT m FROM Memories m ORDER BY m.save_date DESC")
    List<Memories> findAllDesc();
}
