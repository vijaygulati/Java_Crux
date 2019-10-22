package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
   public static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        if (m > n)
        {
            int tempp[] = arr1;
            arr1 = arr2;
            arr2 = tempp;

            int temp = m;
            m = n;
            n = temp;
        }
        Arrays.sort(arr1);

        for (int i = 0; i < n; i++)
        {
            if (binarySearch(arr1, 0, m - 1, arr2[i]) != -1)
                System.out.print(arr2[i] + " ");
        }
    }

    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l)
        {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }


        return -1;
    }


    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int []ar= new int[a];
        for(int i=0; i< a ; i++){
            ar[i]=s.nextInt();
        }
        int b=s.nextInt();
        int []ar1= new int[b];
        for(int i=0; i< b ; i++){
            ar[i]=s.nextInt();
        }
        
        int m = ar.length;
        int n = ar1.length;
        System.out.println("");
        printIntersection(ar, ar1, m, n);

    }
}
