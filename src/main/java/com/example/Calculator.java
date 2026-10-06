package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor must not be zero");
        }
        return a / b;
    }
<<<<<<< HEAD
}
=======
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    
}
>>>>>>> 75601b3 (Add multiply method and test.)
