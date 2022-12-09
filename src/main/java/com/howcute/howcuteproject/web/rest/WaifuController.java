package com.howcute.howcuteproject.web.rest;

import com.howcute.howcuteproject.service.WaifuService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WaifuController {

    private WaifuService waifuService;

    public WaifuController(WaifuService waifuService) {
        this.waifuService = waifuService;
    }



    @GetMapping("/waifus")
    public String findById(ModelMap model) {
        Pageable wholePage = Pageable.unpaged();
        model.addAttribute("waifus", this.waifuService.findAll(wholePage));
        return "waifus";
    }
}