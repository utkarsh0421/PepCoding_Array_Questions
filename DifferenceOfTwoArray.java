/*
  >>>>>>>>>>>>>>>>>>Difference Of Two Arrays<<<<<<<<<<<<<<<<<<<<<

Question
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to find the difference of two numbers represented by two arrays and print the
arrays. a2 - a1

Assumption - number represented by a2 is greater

Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format
A number representing difference of two numbers (a2 - a1), represented by two arrays.

*/

import java.util.Scanner;
public class DifferenceOfTwoArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre size of array 1 : ");
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Entre size of array 2 : ");
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] diff = new int[num2];

        int c=0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;


        while (k >= 0) {
            int d = 0;
            int arr1val = i >=0? arr1[i] : 0; 
            if (arr2[j] + c >= arr1val) {
                d = arr2[j] + c - arr1val;
            }else{
                d = arr2[j] + c + 10 - arr1val;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0){
                idx++;
            }else{
                break;
            }
        }

        while (idx< diff[idx]) {
            System.out.println("Difference of two aray : " + diff[idx]);
            idx++;
        }
        sc.close();
    }
}
