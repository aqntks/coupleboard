package com.iph.web;

import com.iph.domain.posts.CoupleProfile;
import com.iph.service.posts.CoupleProfileService;
import com.iph.service.posts.MemoriesService;
import com.iph.web.dto.CoupleProfileResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final MemoriesService memoriesService;
    private final CoupleProfileService coupleProfileService;

    @GetMapping("/calendars")
    public String calendars(Model model) {
        return "calendars";
    }


    @GetMapping("/")
    public String home(Model model) {
        //프로필 등록 되기 전에 홈화면 에러 안뜨게 코드 작성해야해 if id(1) 이 없으면 아래가 아니라 다른화면!
        if(coupleProfileService.existsById(1L)) {
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
        return "home";
    }

    @GetMapping("/plan")
    public String plan(Model model) {
        model.addAttribute("couple_profile", coupleProfileService.findById(1L));
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
}
