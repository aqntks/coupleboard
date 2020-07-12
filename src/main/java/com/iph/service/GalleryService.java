/*
package com.iph.service;

import com.iph.domain.posts.Gallery;
import com.iph.domain.posts.GalleryRepository;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GalleryService {
    private final GalleryRepository galleryRepository;

    @Transactional
    public Long save(GallerySaveRequestDto requestDto) {
        return galleryRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, GalleryUpdateRequestDto requestDto) {
        Gallery gallery = galleryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        gallery.update(requestDto.getTitle(), requestDto.getImg_path());

        return id;
    }

    @Transactional
    public void delete (Long id) {
        Gallery gallery = galleryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        galleryRepository.delete(gallery);
    }

    @Transactional(readOnly = true)
    public GalleryResponseDto findById(Long id) {
        Gallery entity = galleryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. id=" + id));

        return new GalleryResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<GalleryListResponseDto> findAllDesc() {
        return galleryRepository.findAllDesc().stream()
                .map(GalleryListResponseDto::new)
                .collect(Collectors.toList());
    }
}
*/