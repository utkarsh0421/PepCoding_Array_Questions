//span of an array 
//span is defined as the difference detween the maximum and minimum values

import java.util.*;
public class SpanOfArray {
    public static int spanOfArray(int arr[]){
        int largest=arr[0];
        int smallest=arr[0];

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return largest-smallest;
    }
    public static void main(String[] args){
        int[] arr = {6,15,30,40,4,11,9};
        System.out.println(spanOfArray(arr));
    }
}
