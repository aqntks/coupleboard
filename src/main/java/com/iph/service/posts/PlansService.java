package com.iph.service.posts;

import com.iph.domain.posts.MemoriesRepository;
import com.iph.domain.posts.Memories;
import com.iph.domain.posts.Plans;
import com.iph.domain.posts.PlansRepository;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PlansService {
    private final PlansRepository plansRepository;

    @Transactional
    public Long save(PlansSaveRequestDto requestDto) {
        return plansRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PlansUpdateRequestDto requestDto) {
        Plans plans = plansRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        plans.update(requestDto.getYear(), requestDto.getMonth(), requestDto.getDate(), requestDto.getPlace(), requestDto.getContent());

        return id;
    }

    @Transactional
    public void delete (Long id) {
        Plans plans = plansRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        plansRepository.delete(plans);
    }

    @Transactional(readOnly = true)
    public PlansResponseDto findById(Long id) {
        Plans entity = plansRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        return new PlansResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<PlansListResponseDto> findAllDesc() {
        return plansRepository.findAllDesc().stream()
                .map(PlansListResponseDto::new)
                .collect(Collectors.toList());
    }
}
