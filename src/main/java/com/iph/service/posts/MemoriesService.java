package com.iph.service.posts;

import com.iph.domain.posts.MemoriesRepository;
import com.iph.domain.posts.Memories;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MemoriesService {
    private final MemoriesRepository memoriesRepository;

    @Transactional
    public Long save(MemoriesSaveRequestDto requestDto) {
        return memoriesRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, MemoriesUpdateRequestDto requestDto) {
        Memories memories = memoriesRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        memories.update(requestDto.getYear(), requestDto.getMonth(), requestDto.getDate(), requestDto.getPlace(), requestDto.getContent(), requestDto.getImg_path());

        return id;
    }

    @Transactional
    public void delete (Long id) {
        Memories memories = memoriesRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        memoriesRepository.delete(memories);
    }

    @Transactional(readOnly = true)
    public MemoriesResponseDto findById(Long id) {
        Memories entity = memoriesRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        return new MemoriesResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<MemoriesListResponseDto> findAllDesc() {
        return memoriesRepository.findAllDesc().stream()
                .map(MemoriesListResponseDto::new)
                .collect(Collectors.toList());
    }
}
