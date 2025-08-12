/*
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   Bar Chart Question <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 * Output Format
A bar chart of asteriks representing value of array a

Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 10

Sample Input
5 sze of array
3 elements of array
1 elements of array
0 elements of array
7 elements of array
5 elements of array

Sample Output
                        *
                        *
                        *       *
                        *       *
*                       *       *
*                       *       *
*       *               *       *
 
*/



import java.util.Scanner;
public class BarChartQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int floor=max; floor>=1; floor--){
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
