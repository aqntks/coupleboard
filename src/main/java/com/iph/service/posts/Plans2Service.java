package com.iph.service.posts;

import com.iph.domain.posts.Plans2;
import com.iph.domain.posts.Plans2Repository;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class Plans2Service {
    private final Plans2Repository plans2Repository;

    @Transactional
    public Long save(Plans2SaveRequestDto requestDto) {
        return plans2Repository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, Plans2UpdateRequestDto requestDto) {
        Plans2 plans2 = plans2Repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        plans2.update(requestDto.getYear(), requestDto.getMonth(), requestDto.getDate(), requestDto.getPlace(), requestDto.getContent());

        return id;
    }

    @Transactional
    public void delete (Long id) {
        Plans2 plans2 = plans2Repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        plans2Repository.delete(plans2);
    }

    @Transactional(readOnly = true)
    public Plans2ResponseDto findById(Long id) {
        Plans2 entity = plans2Repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        return new Plans2ResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<Plans2ListResponseDto> findAllDesc() {
        return plans2Repository.findAllDesc().stream()
                .map(Plans2ListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<Plans2ListResponseDto> findTodayPlan() {
        return plans2Repository.findTodayPlan().stream()
                .map(Plans2ListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<Plans2ListResponseDto> findNextPlan() {
        return plans2Repository.findNextPlan().stream()
                .map(Plans2ListResponseDto::new)
                .collect(Collectors.toList());
    }
}
