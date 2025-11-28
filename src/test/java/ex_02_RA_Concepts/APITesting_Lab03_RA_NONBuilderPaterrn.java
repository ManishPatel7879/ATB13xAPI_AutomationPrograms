package ex_02_RA_Concepts;

public class APITesting_Lab03_RA_NONBuilderPaterrn {

    public void step1(){
        System.out.println("Step1");
    }

    public void step2(){
        System.out.println("Step2");
    }

    public void step3( String pramod){
        System.out.println("Step3");
    }

    // this is not builder pattern.
    public static void main(String[] args) {
        APITesting_Lab03_RA_NONBuilderPaterrn  nbp = new APITesting_Lab03_RA_NONBuilderPaterrn();
        nbp.step1();
        nbp.step2();
        nbp.step3("Pramod");

    }
}
