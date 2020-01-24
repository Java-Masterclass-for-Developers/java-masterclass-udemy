package pl.pawtel.lambda_expressions;

public class Main {

    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for(String part : parts) {
//                    System.out.println(part);
//                }
//            }
//        };

        //anonymous replaced by lambda
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        runnable.run();
    }
}
