package com.example.Swagger01;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MathController {
    @GetMapping
    @Operation (summary = "Returns a welcome message")
    public String welcomeMathMsg(){
        return "Welcome to math.";
    }

    @GetMapping("division-info")
    @Operation (summary = " returns a new ArithmeticOperation with all the details about the division")
    public ArithmeticOperation getDivisionInfo() {
        String name = "division";
        int minNumberOfOperands = 2;
        String description = "Performs division operation on two operands";
        String[] properties = {"Only works with numeric operands", "Throws an exception if the second operand is zero"};
        return new ArithmeticOperation(name, minNumberOfOperands, description, properties);
    }


    @GetMapping("multiplication")
    @Operation (summary = "takes two int parameters and returns the multiplication value")
    public int multiplication(@RequestParam int a, @RequestParam int b){
        return a * b;
    }

    @GetMapping("square/{n}")
    @Operation (summary = " returns the square of the n")
    public int getSquare(@PathVariable int n){
        return n * n;
    }

}
