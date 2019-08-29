package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        int n1 = ap.nextInt("What's your first number?");
        int n2 = ap.nextInt("What's your second number?");

        double averageOftwo = ((n1 + n2)/2.0);

        System.out.println(averageOftwo);


    }
}
