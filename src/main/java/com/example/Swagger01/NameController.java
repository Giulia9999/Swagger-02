package com.example.Swagger01;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NameController {
    @Operation(summary = "returns the name")
    @GetMapping("/getName")
    public String getName(){
        return "Giulia";
    }

    @GetMapping
    public String welcome(){
        return "I, for one, welcome our new insect overloards.";
    }

}
