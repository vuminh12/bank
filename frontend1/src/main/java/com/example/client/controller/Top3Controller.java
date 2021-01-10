package com.example.client.controller;

import com.example.client.model.Top3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/top3")
public class Top3Controller {
    private RestTemplate rest = new RestTemplate();

    @GetMapping
    public String showForm(Model model) {
        List<Top3> top3s = Arrays
                .asList(rest.getForObject("http://localhost:8080/top3", Top3[].class));
        model.addAttribute("top3s", top3s);
        return "top3";
    }
}
