package com.iph.web;

import com.iph.service.posts.CoupleProfileService;
import com.iph.service.posts.MemoriesService;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CoupleProfileApiController {

    private final CoupleProfileService coupleProfileService;

    @PostMapping("/api/v1/couple_profile")
    public Long save(@RequestBody CoupleProfileSaveRequestDto requestDto) {
        return coupleProfileService.save(requestDto);
    }

    @PutMapping("/api/v1/couple_profile/{id}")
    public Long update(@PathVariable Long id, @RequestBody CoupleProfileUpdateRequestDto requestDto) {
        return coupleProfileService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/couple_profile/{id}")
    public Long delete(@PathVariable Long id) {
        coupleProfileService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/couple_profile/{id}")
    public CoupleProfileResponseDto findById(@PathVariable Long id) {
        return coupleProfileService.findById(id);
    }

}
