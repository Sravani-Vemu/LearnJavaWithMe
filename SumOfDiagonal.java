package coding;

import java.util.Arrays;

/*
suppose a matrix
[5 7 8]
[1 2 3]
[0 9 8]
sum is 23
there is a documentation below of how to approach for the code.
*/
public class SumOfDiagonal {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{40,50,60,70},{70,80,90,10},{11,12,13,14}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i][i];
            sum = sum+arr[i][arr.length-(i+1)];
        }
        if(arr.length%2 == 0){
            System.out.println("sum is: "+sum);
        }
        else{
            sum = sum - arr[(arr.length-1)/2][(arr.length-1)/2];
            System.out.println("sum is:"+sum);
        }
    }
}
