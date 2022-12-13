package rw.rca.calculatorapp.service;

import rw.rca.calculatorapp.exception.InvalidOperationException;

public interface MathService {

    double doMath(double operand1,double operand2, String operation) throws InvalidOperationException;
}
