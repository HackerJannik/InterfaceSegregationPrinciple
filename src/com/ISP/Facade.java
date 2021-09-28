package com.ISP;

public class Facade {

    private AddSub addSub;
    private MultDiv multDiv;
    private PowSqrt powSqrt;

    public Facade() {
        this.addSub = new AddSub();
        this.multDiv = new MultDiv();
        this.powSqrt = new PowSqrt();
    }

    public double add(double x, double y){
        return addSub.add(x,y);
    }

    public double sub(double x, double y){
        return addSub.sub(x,y);
    }

    public double mult(double x, double y){
        return multDiv.mult(x,y);
    }

    public double div(double x, double y){
        return multDiv.div(x,y);
    }

    public double pow(double x, double y){
        return powSqrt.pow(x,y);
    }

    public double sqrt(int x){
        return powSqrt.sqrt(x);
    }


}
