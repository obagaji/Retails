package com.small.service.smallController;

import com.small.service.entity.SmallEntity;
import com.small.service.smallService.ServicesClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/small")
public class SmallController {
    @Autowired
    ServicesClass servicesClass;
    @GetMapping("/small")
    public ResponseEntity<String>getString()
    {
        return ResponseEntity.ok().body("Small Service Microservice");
    }
    @GetMapping("/item")
    public ResponseEntity<List<SmallEntity>>getAllEntity()
    {
        return ResponseEntity.ok(servicesClass.getSavedEntity());
    }

}
