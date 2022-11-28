package com.karol.math;

public class Series {

    public long nSum(int n) {
        return ((long) n * (n + 1)) / 2;
    }

    public long factorial(int n){
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    public long fibonacci(int n){
        return (n ==1 || n == 0) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
