package com.iph.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CoupleProfileRepository extends JpaRepository<CoupleProfile, Long>{
}
