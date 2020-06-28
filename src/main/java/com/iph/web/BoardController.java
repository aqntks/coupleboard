package com.iph.web;

import com.iph.service.posts.MemoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BoardController {

    private final MemoriesService memoriesService;

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/plan")
    public String plan(Model model) {
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
}