import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {
    int[] arr={3,6,1,9,0,5,7,3};
    int i=0,j=arr.length-1;
    while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    System.out.println(Arrays.toString(arr));
}
}
