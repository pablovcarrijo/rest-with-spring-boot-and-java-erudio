package br.com.controllers;

import br.com.exceptions.UnsoppotedMathOperationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.controllers.VerifyControllers.convertToDouble;
import static br.com.controllers.VerifyControllers.isNumber;

@RestController
@RequestMapping("/math")
public class MathController {

    SimpleMath math = new SimpleMath();

    @GetMapping("/sub/{a}/{b}")
    public final Double returnSubtraction(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    )throws Exception{
        if(!isNumber(a) || !isNumber(b)) throw new UnsoppotedMathOperationException("Error, digit only numbers");
        return math.sum(convertToDouble(a), convertToDouble(b));
    }

    @GetMapping("/multiplication/{a}/{b}")
    public final Double returnMultiplication(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    )throws Exception{
        if(!isNumber(a) || !isNumber(b)) throw new UnsoppotedMathOperationException("Error, digit only numbers");
        return math.mult(convertToDouble(a), convertToDouble(b));
    }

    @GetMapping("/division/{a}/{b}")
    public final Double returnDivision(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    )throws Exception{
        if(!isNumber(a) || !isNumber(b)) throw new UnsoppotedMathOperationException("Error, digit only numbers");
        return math.div(convertToDouble(a), convertToDouble(b));
    }

    @GetMapping("/mean/{a}/{b}")
    public final Double returnMean(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    )throws Exception{
        if(!isNumber(a) || !isNumber(b)) throw new UnsoppotedMathOperationException("Error, digit only numbers");
        return math.mean(convertToDouble(a), convertToDouble(b));
    }

    @GetMapping("/squareRoot/{value}")
    public final Double returnSquareRoot(
            @PathVariable("value") String valor
    )throws Exception{
        if(!isNumber(valor)) throw new UnsoppotedMathOperationException("Error, digit only numbers");
        return math.sqrtRoot(convertToDouble(valor));
    }

}
