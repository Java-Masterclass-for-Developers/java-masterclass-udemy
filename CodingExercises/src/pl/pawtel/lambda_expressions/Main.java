package pl.pawtel.lambda_expressions;

import java.util.function.Function;
import java.util.function.Supplier;

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

        //lambda that maps to Supplier interface
//        Supplier<String> stringSupplier = () -> "I love Java";
        Supplier<String> stringSupplier = () -> {return "I love Java";};
        String iLoveJava = stringSupplier.get();
        System.out.println(iLoveJava);

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

        System.out.println(lambdaFunction.apply("0123456789"));

        String testEverySecondCharacter = "1234567890";

        System.out.println(everySecondCharacter(lambdaFunction, testEverySecondCharacter));
    }

    // method that can take lamda as an argument
    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
