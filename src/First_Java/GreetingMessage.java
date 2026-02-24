package First_Java;

import java.util.*;
public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String s = sc.nextLine();
        System.out.println("Good evening " + s + " !");
    }
}
