package pl.pawtel.lambda_expressions;

import java.util.function.Function;

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

        // interface Function takes one value and with "apply" returns one modified
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append((s.charAt(i)));
                }
            }
            return returnVal.toString();
        };
        System.out.println(lambdaFunction.apply("Example text"));
    }


}
