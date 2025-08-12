/*
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Sum Of Two Arrays   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<
Question 
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays

Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output Format
A number representing sum of two numbers, represented by two arrays.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10

Sample Input
5
3
1
0
7
5
6
1
1
1
1
1
1

Sample Output
1
4
2
1
8
6

 */

import java.util.Scanner;
public class SumofTwoArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre size of array 1: ");
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        System.out.print("Entre " + num1 + " elements of array 1: ");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();    
        }


        System.out.print("Entre size of array 2: ");
        int num2 = sc.nextInt();

        int[] arr2 = new int[num2];
        System.out.print("Entre " + num2 + " elements of array 2: ");
        for(int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int[] sum = new int[num1 > num2 ? num1: num2];

        int c=0;

        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;

        while(k>=0){
            int d=c;

            if(i>=0){
                d += arr1[i];
            }
            if(j>=0){
                d += arr2[j];
            }

            c=d/10;
            d=d%10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        System.out.println("Sum of Array of two Elements are : ");
        if(c !=0){
            System.out.println(c +" ");
        }
        for(int val:sum){
            System.out.println(val +" ");
        }
    }
}
