package com.retail.Material.items;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatController {

    @GetMapping("/materials")
    public String returnString()
    {
        return "Large Material";
    }
}
