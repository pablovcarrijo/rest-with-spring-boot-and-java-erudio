package br.com.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {


    // localhost:8080/math/sum/3/2
    @RequestMapping("/sum/{one}/{two}")
    public Double sum(
            @PathVariable("one")  String numberOne,
            @PathVariable("two") String numberTwo
    ){
        return Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
    }

    @RequestMapping("/sub/{one}/{two}")
    public Double sub(
            @PathVariable("one") String numberOne,
            @PathVariable("two") String numberTwo
    ){
        return Double.parseDouble(numberOne) - Double.parseDouble(numberTwo);
    }

    @RequestMapping("mult/{one}/{two}")
    public Double mult(
            @PathVariable("one") String numberOne,
            @PathVariable("two") String numberTwo
    ){
        return Double.parseDouble(numberOne) * Double.parseDouble(numberTwo);
    }

    @RequestMapping("div/{one}/{two}")
    public Double div(
            @PathVariable("one") String numberOne,
            @PathVariable("two") String numberTwo
    ){
        return Double.parseDouble(numberOne) / Double.parseDouble(numberTwo);
    }

}
