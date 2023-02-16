package it.develhope.primiPassiSwagger02.Entities;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class ArithmeticOperation {

    @Schema(name = "Name", description = "This is the name of aritmetic operation")
    public String name;
    @Schema(name = "Minimun Number of Operands", description = "This is the number of operands of aritmetic operation")
    public Integer minNumberOfOperands;
    @Schema(name = "Description", description = "This is the description of aritmentic operation")
    public String description;
    @Schema(name = "Properties", description = "This is the properties of aritmetic operation")
    public String [] properties;
}
