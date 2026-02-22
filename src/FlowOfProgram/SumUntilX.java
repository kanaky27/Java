package FlowOfProgram;

import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String input = sc.next();

            if (input.equals("x")) {
                break;
            }
//            Integer → Wrapper class for primitive int
//            parseInt() → Static method

            int number = Integer.parseInt(input);  // Converts a String into an int
            sum += number;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
