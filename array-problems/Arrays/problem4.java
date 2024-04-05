// package java-problems-topics.array-problems.Arrays;
import java.util.Arrays;
public class problem4 {
    public static void main(String[] args) {
        int[][] arr={{10,2,3},
                     {1,20,3},
                     {1,2,30}};
                     
    printArr(arr);
    System.out.println("after transpose ");
    transpose(arr);
    }

    static void transpose(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        printArr(arr);
        
    }

    static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
