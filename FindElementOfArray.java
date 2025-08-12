/*
 
 In this we need to find a particular element of an array

 */

import java.util.*;
public class FindElementOfArray {
    public static int findElementArr(int arr[], int target){
        
        for(int i=0; i<arr.length; i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre size of array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<arr.length; i++){
            System.out.print("Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Target element: ");
        int target=sc.nextInt();
        System.out.println(findElementArr(arr,target));
    }
}
