package com.iph.web;

import com.iph.service.posts.MemoriesService;
import com.iph.service.posts.PlansService;
import com.iph.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PlansApiController {

    private final PlansService plansService;

    @PostMapping("/api/v1/plans")
    public Long save(@RequestBody PlansSaveRequestDto requestDto) {
        return plansService.save(requestDto);
    }

    @PutMapping("/api/v1/plans/{id}")
    public Long update(@PathVariable Long id, @RequestBody PlansUpdateRequestDto requestDto) {
        return plansService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/plans/{id}")
    public Long delete(@PathVariable Long id) {
        plansService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/plans/{id}")
    public PlansResponseDto findById(@PathVariable Long id) {
        return plansService.findById(id);
    }

    @GetMapping("/api/v1/plans/list")
    public List<PlansListResponseDto> findAll() {
        return plansService.findAllDesc();
    }
}
