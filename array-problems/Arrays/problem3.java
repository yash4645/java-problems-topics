// sum of upper and lower elements of 2d array

import java.util.Arrays;

public class problem3 {
    public static void main(String[] args) {
        int[][] arr={{10,2,3},
                     {1,20,3},
                     {1,2,30}};

        int upperSum=0,lowerSum=0;

     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(i<=j){
                upperSum+=arr[i][j];
            }else{
                lowerSum+=arr[i][j];
            }
        }
     }  
     printArr(arr);

     System.out.println("Upper sum is : "+ upperSum);
     System.out.println("Lower sum is : "+lowerSum);

    }
    static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
