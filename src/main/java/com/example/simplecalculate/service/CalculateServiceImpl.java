package com.example.simplecalculate.service;

import com.example.simplecalculate.exception.CalculateDivideByZero;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new CalculateDivideByZero("Делить на ноль нельзя!");
        }
        return a / b;
    }
}