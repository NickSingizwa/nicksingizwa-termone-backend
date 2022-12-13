package rw.rca.calculatorapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rw.rca.calculatorapp.dto.DoMathRequest;
import rw.rca.calculatorapp.exception.InvalidOperationException;
import rw.rca.calculatorapp.calcpayload.MathResponse;
import rw.rca.calculatorapp.service.MathService;

@RestController
@RequestMapping("/api/v1/math")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @PostMapping
    public ResponseEntity<MathResponse> doMath(@RequestBody DoMathRequest dto){
        return ResponseEntity.ok(MathResponse.success(mathService.doMath(dto.getOperand1(),dto.getOperand2(),dto.getOperation())));
    }
}
