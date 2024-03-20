// find min and max element of array
public class problem2 {

    public static void main(String[] args) {
        int []arr={5,3,9,0,8,45,21,76,12,32};
        int max=Math.max(arr[0], arr[1]);
        int min=Math.min(arr[0], arr[1]);
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max is : "+ max+" and min is : "+min);
    }
}