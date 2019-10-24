package Lec_4_Functions;

import java.util.Scanner;

import static java.lang.Math.pow;

public class inverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no. of digits in a no.");
        int n=s.nextInt();
        System.out.println("enter no. please enter digits from 1 to "+n);
        int num=s.nextInt();
        System.out.println(inver(n,num));
    }
    public  static double inver(int n, int num){
        int p=1;
        int t=0;
        double inv=0;
        while(p<=n){
            t=num%10;
            inv=inv+p*pow(10,(t-1));
            num=num/10;
            p++;
        }
        return inv;
    }
}
