package FlowOfProgram;

import java.util.Scanner;

public class HCF_LCM {
    static int HCF(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
    static int LCM(int a, int b){
        return (a*b)/HCF(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("HCF : " + HCF(a,b));
        System.out.println("LCF : " + LCM(a,b));
    }
}
