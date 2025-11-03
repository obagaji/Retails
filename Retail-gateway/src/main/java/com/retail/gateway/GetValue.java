package com.retail.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetValue {


    @GetMapping("/gate")
    public String getValues()
    {
        return "utnmas kjsdfsfsdfdsfs";
    }
}
