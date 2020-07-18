package com.iph.web;

import com.iph.service.posts.Plans2Service;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class Plans2ApiController {

    private final Plans2Service plans2Service;

    @PostMapping("/api/v1/plans")
    public Long save(@RequestBody Plans2SaveRequestDto requestDto) {
        return plans2Service.save(requestDto);
    }

    @PutMapping("/api/v1/plans/{id}")
    public Long update(@PathVariable Long id, @RequestBody Plans2UpdateRequestDto requestDto) {
        return plans2Service.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/plans/{id}")
    public Long delete(@PathVariable Long id) {
        plans2Service.delete(id);
        return id;
    }

    @GetMapping("/api/v1/plans/{id}")
    public Plans2ResponseDto findById(@PathVariable Long id) {
        return plans2Service.findById(id);
    }

    @GetMapping("/api/v1/plans/list")
    public List<Plans2ListResponseDto> findAll() {
        return plans2Service.findAllDesc();
    }

    @GetMapping("/api/v1/plans/today")
    public List<Plans2ListResponseDto> findToday() {
        return plans2Service.findTodayPlan();
    }
}
