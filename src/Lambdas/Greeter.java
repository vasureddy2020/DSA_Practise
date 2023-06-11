package Lambdas;

public class Greeter {
    public void greet(Greeting greeting){
        //System.out.println("hello vasu");
        greeting.perform();
    }


    public static void main(String[] args) {
        Greeter gf = new Greeter();
        Helloworldgreeting helloworldgreeting = new Helloworldgreeting();
//        Greeting gh=new Greeting() {
//            @Override
//            public void perform() {
//                System.out.println("rishi ggg");
//            }
//        };
       gf.greet(helloworldgreeting);


    }
}
