package com.example.Swagger01;

import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArithmeticOperation {
    private String name;
    private int minNumberOfOperands;
    private String description;
    private String[] properties;
}
