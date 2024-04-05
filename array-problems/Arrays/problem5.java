// package java-problems-topics.array-problems.Arrays;
// rotate the arrray to 90 degree
import java.util.Arrays;
public class problem5 {
    public static void main(String[] args) {
        int[][] arr={{10,2,3},
        {1,20,3},
        {1,2,30}};
        printArr(arr);
        System.out.println("after rotation");
        rotateArr(arr);
        rotateArr(arr);

    }
    static void rotateArr(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[n-1-i][j];
                arr[n-1-i][j]=temp;
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
