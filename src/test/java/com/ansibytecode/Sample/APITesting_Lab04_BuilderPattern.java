package com.ansibytecode.Sample;

//this is builder pattern : in this ... pattern have but on Non builder pattern need to write in statement form

public class APITesting_Lab04_BuilderPattern {

    public APITesting_Lab04_BuilderPattern step1(){
        System.out.println("Step 1");
        return this;
    }
    public APITesting_Lab04_BuilderPattern step2(){
        System.out.println("Step 2");
        return this;
    }
    public APITesting_Lab04_BuilderPattern step3(String param1){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab04_BuilderPattern BP = new APITesting_Lab04_BuilderPattern();
        BP.step1().step2().step3("ram");
    }

}
