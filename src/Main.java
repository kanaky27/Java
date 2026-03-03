import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();
        s = s.trim().toLowerCase();
        int n = s.length();
        boolean p = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt(n-i-1)){
                p = true;
            }
            else {
                p = false;
            }
        }
        if(p){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}