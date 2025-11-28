package com.ansibytecode.Sample;

public class APITesting_Lab03_NonBuilderPattern {

    public void step1(){
        System.out.println("Step 1");
    }
    public void step2(){
        System.out.println("Step 2");
    }
    public void step3(String param1){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        // creating intanse for non builder pattern NPB
     APITesting_Lab03_NonBuilderPattern nbp = new APITesting_Lab03_NonBuilderPattern();
     nbp.step1();
     nbp.step2();
     nbp.step3("Pramod");
     // this is non builder pattern
     // here object reference calling three time means three statement
        // but on builder pattern all these three statement written in single line with .



    }

}
