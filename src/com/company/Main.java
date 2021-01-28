package com.company;

class Calculator  {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int  add(){
        return  a+b;
    }
    public int subN (){
        return a-b;
    }

}

public class Main {

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(24 ,12);


        System.out.println(calculator1.add());
        System.out.println(calculator1.subN());
    }
}
