package com.example.client.controller;

import com.example.client.model.SonoTondong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/sonotondong")
public class SonoTondongController {
    private RestTemplate rest = new RestTemplate();

    @GetMapping
    public String showForm(Model model) {
        List<SonoTondong> sonoTondongs = Arrays
                .asList(rest.getForObject("http://localhost:8080/sonotondong", SonoTondong[].class));
        model.addAttribute("sonotondongs", sonoTondongs);
        return "sonotondong";
    }
}
