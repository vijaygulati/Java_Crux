package Lec_4_Functions;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(0 <= n && n<= 1000000000) {
            System.out.println(rev(n));
        }
    }
    public static int rev(int n) {
        int revs=0;
        while (n != 0) {
            int rem = n % 10;
            n/=10;

            revs = revs * 10 + rem;
        }
        return revs;
    }
}
