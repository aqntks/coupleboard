package com.iph.service.posts;

import com.iph.domain.posts.CoupleProfile;
import com.iph.domain.posts.CoupleProfileRepository;
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
public class CoupleProfileService {
    private final CoupleProfileRepository coupleProfileRepository;

    @Transactional
    public Long save(CoupleProfileSaveRequestDto requestDto) {
        return coupleProfileRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, CoupleProfileUpdateRequestDto requestDto) {
        CoupleProfile coupleProfile = coupleProfileRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        coupleProfile.update(requestDto.getUser1_name(), requestDto.getUser1_job(), requestDto.getUser1_year(), requestDto.getUser1_month(),
                requestDto.getUser1_date(), requestDto.getUser1_address(), requestDto.getUser1_instagram(), requestDto.getUser1_facebook(),
                requestDto.getUser1_email(), requestDto.getUser1_img_path(), requestDto.getUser1_about(), requestDto.getUser2_name(),
                requestDto.getUser2_job(), requestDto.getUser2_year(), requestDto.getUser2_month(),
                requestDto.getUser2_date(), requestDto.getUser2_address(), requestDto.getUser2_instagram(), requestDto.getUser2_facebook(),
                requestDto.getUser2_email(), requestDto.getUser2_img_path(), requestDto.getUser2_about());

        return id;
    }

    @Transactional
    public void delete (Long id) {
        CoupleProfile coupleProfile = coupleProfileRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        coupleProfileRepository.delete(coupleProfile);
    }

    @Transactional(readOnly = true)
    public CoupleProfileResponseDto findById(Long id) {
        CoupleProfile entity = coupleProfileRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new CoupleProfileResponseDto(entity);
    }
}
