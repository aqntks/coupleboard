package com.iph.web;

import com.iph.domain.posts.CoupleProfile;
import com.iph.s3.S3Service;
import com.iph.service.posts.CoupleProfileService;
import com.iph.service.posts.MemoriesService;
import com.iph.service.posts.Plans2Service;
import com.iph.web.dto.CoupleProfileSaveRequestDto;
import com.iph.web.dto.MemoriesSaveRequestDto;
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

    //홈
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

    //계획 보드
    @GetMapping("/plan")
    public String plan(Model model) {
        model.addAttribute("today", plans2Service.findTodayPlan());
        model.addAttribute("next", plans2Service.findNextPlan());
        return "plan";
    }

    //추억 보드
    @GetMapping("/memory")
    public String memory(Model model) {
        model.addAttribute("memories", memoriesService.findAllDesc());
        return "memory";
    }

    //추억 등록
    @GetMapping("/add_memory")
    public String addMemory(){
        return "add_memory";
    }

    @PostMapping("/add_memory") //프로필 등록 post
    public String add_memory_post(MemoriesSaveRequestDto memoriesSaveRequestDto, MultipartFile file) throws IOException {
        String imgPath = s3Service.upload(file);
        memoriesSaveRequestDto.setImg_path(imgPath);

        memoriesService.save(memoriesSaveRequestDto);

        return "redirect:memory";
    }

    @GetMapping("/memories/save")
    public String memoriesSave(){
        return "memories-save";
    }

    @GetMapping("/add_couple")
    public String add_couple(Model model){
        return "add_couple";
    }

    @GetMapping("/add_couple_new")
    public String add_couple_new(Model model){
        return "add_couple_new";
    }

    @GetMapping("/add_profile_select")
    public String add_profile_select(Model model) {
        return "add_profile_select";
    }

    @GetMapping("/add_profile_one")
    public String add_profile_one(Model model) {
        return "add_profile_one";
    }

    @PostMapping("/add_profile_one") //프로필 등록 post
    public String add_profile_one_post(CoupleProfileSaveRequestDto coupleProfileSaveRequestDto, MultipartFile file) throws IOException {
        String imgPath = s3Service.upload(file);
        coupleProfileSaveRequestDto.setUser1_img_path(imgPath);

        coupleProfileService.save(coupleProfileSaveRequestDto);

        return "redirect:add_profile_select";
    }

    @GetMapping("/add_profile_two")
    public String add_profile_two(Model model) {
        return "add_profile_two";
    }

    @PostMapping("/add_profile_two") //프로필 등록 post
    public String add_profile_two_post(CoupleProfileSaveRequestDto coupleProfileSaveRequestDto, MultipartFile file) throws IOException {
        String imgPath = s3Service.upload(file);
        coupleProfileSaveRequestDto.setUser2_img_path(imgPath);

        coupleProfileService.save(coupleProfileSaveRequestDto);

        return "redirect:add_profile_select";
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
