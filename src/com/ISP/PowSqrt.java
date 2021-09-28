package com.ISP;

public class PowSqrt implements Operation3{
    @Override
    public double pow(double x, double y) {
        return Math.pow(x,y);
    }

    @Override
    public double sqrt(int x) {
        return Math.sqrt(x);
    }
}
