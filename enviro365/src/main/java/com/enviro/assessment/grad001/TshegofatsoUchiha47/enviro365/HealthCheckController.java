package com.enviro.assessment.grad001.TshegofatsoUchiha47.enviro365;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Application is up and running!";
    }
}
