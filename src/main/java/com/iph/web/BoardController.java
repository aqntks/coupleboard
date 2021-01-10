package com.iph.web;

import com.iph.domain.posts.CoupleProfile;
import com.iph.s3.S3Service;
import com.iph.service.posts.CoupleProfileService;
import com.iph.service.posts.MemoriesService;
import com.iph.service.posts.Plans2Service;
import com.iph.web.dto.CoupleProfileSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final MemoriesService memoriesService;
    private final CoupleProfileService coupleProfileService;
    private final Plans2Service plans2Service;
    private final S3Service s3Service;

    @GetMapping("/calendars")
    public String calendars(Model model) {
        return "calendars";
    }


    @GetMapping("/")
    public String home(Model model) {
        if(coupleProfileService.existsById(1L)) {  // 프로필 존재 여부
            model.addAttribute("couple_profile", coupleProfileService.findById(1L));
        }
        else {
            CoupleProfile entity = new CoupleProfile();
            entity.setUser1_name("");
            entity.setUser1_job("");
            entity.setUser1_about("");
            entity.setUser2_name("");
            entity.setUser2_job("");
            entity.setUser2_about("");
            model.addAttribute("couple_profile", entity);
        }

        model.addAttribute("today", plans2Service.findTodayPlan());
        model.addAttribute("next", plans2Service.findNextPlan());

        return "home";
    }

    @GetMapping("/plan")
    public String plan(Model model) {
        model.addAttribute("today", plans2Service.findTodayPlan());
        model.addAttribute("next", plans2Service.findNextPlan());
        return "plan";
    }

    @GetMapping("/memory")
    public String memory(Model model) {
        model.addAttribute("memories", memoriesService.findAllDesc());
        return "memory";
    }

    @GetMapping("/add/memory")
    public String addMemory(){
        return "add_memory";
    }

    @GetMapping("/memories/save")
    public String memoriesSave(){
        return "memories-save";
    }

    @GetMapping("/edit_profile")
    public String edit_profile(Model model) {
        return "edit_profile";
    }

    @PostMapping("/edit_profile") //메뉴 추가 화면
    public String edit_profile2(CoupleProfileSaveRequestDto coupleProfileSaveRequestDto, MultipartFile file) throws IOException {
        String imgPath = s3Service.upload(file);
        coupleProfileSaveRequestDto.setUser1_img_path(imgPath);

        coupleProfileService.save(coupleProfileSaveRequestDto);

        return "redirect:";
    }

}
