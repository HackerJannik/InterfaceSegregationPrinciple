package com.ISP;

public class MultDiv implements Operation2{
    @Override
    public double mult(double x, double y) {
        return x*y;
    }

    @Override
    public double div(double x, double y) {
        if(y==0)
            return -1;
        return x/y;
    }
}
