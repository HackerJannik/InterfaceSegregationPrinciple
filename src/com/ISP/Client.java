package com.ISP;

public class Client{
    private Facade facade;

    public Client() {
        this.facade = new Facade();
    }

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.facade.add(23,33));
        System.out.println(client.facade.sub(23,33));
        System.out.println(client.facade.mult(23,33));
        System.out.println(client.facade.div(23,33));
        System.out.println(client.facade.pow(2,3));
        System.out.println(client.facade.sqrt(3));
    }

}
