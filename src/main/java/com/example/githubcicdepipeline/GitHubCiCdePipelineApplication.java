package com.example.githubcicdepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCiCdePipelineApplication {

    @GetMapping("welcome")
    private String greeting(){
        return "Hello, This Api were built by Humeid Jocordasse, by the sake of Allah";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitHubCiCdePipelineApplication.class, args);
    }

}
