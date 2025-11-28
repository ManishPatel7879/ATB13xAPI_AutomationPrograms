package ex_02_RA_Concepts;

//builder pattern
public class APITesting_Lab04_RA_BuilderPattern {
    // inplace of void return own or self
        public APITesting_Lab04_RA_BuilderPattern step1(){
            System.out.println("Step1");
            return this;
        }

        public APITesting_Lab04_RA_BuilderPattern step2(){
            System.out.println("Step2");
        return this;
        }

        public APITesting_Lab04_RA_BuilderPattern step3( String pramod){
            System.out.println("Step3");
        return this;
        }

        // this is  builder pattern.
        public static void main(String[] args) {
            APITesting_Lab04_RA_BuilderPattern nbp = new APITesting_Lab04_RA_BuilderPattern();
            nbp.step1().step2().step3("Pramod");


    }

}
