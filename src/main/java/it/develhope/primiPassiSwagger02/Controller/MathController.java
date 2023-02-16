package it.develhope.primiPassiSwagger02.Controller;

import io.swagger.v3.oas.annotations.Operation;
import it.develhope.primiPassiSwagger02.Entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping(value = "")
    @Operation(summary = "Welcome Math Message", description = "This is the method that gives a welcome message")
    public String welcomeMathMsg(){
        return "Welcome in to Math Controller";
    }

    @GetMapping(value = "/division-info")
    @Operation(summary = "Division Information", description = "This is the method that describe the division property")
    public ArithmeticOperation divisionInfo(){
        return new ArithmeticOperation("Division", 2, "This is the Division Operation",new String[]{"identity", "zero", "Dividing a number by Itself" });
    }

    @GetMapping(value = "/moltiplcation")
    @Operation(summary = "Moltiplication Information", description = "This is the method that calculate the moltiplication of numeber")
    public Integer moltiplicationInfo(@RequestParam int a, @RequestParam int b){
        return a*b;
    }

    @GetMapping(value = "/square/{n}")
    @Operation(summary = "Square Information", description = "This is the method that calculate the square of number")
    public Double squareInfo(@PathVariable Double n){
        return n*n;

    }
}
