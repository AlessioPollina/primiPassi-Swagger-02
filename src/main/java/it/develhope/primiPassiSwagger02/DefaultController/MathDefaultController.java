package it.develhope.primiPassiSwagger02.DefaultController;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MathDefaultController {

    @GetMapping(value = "")
    @Operation(summary = "Welcome Math Message", description = "This is the method that gives a welcome message")
    public String welcomeMathMessage(){
        return "Welcome Math message!";
    }
    }
