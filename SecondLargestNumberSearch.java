import java.util.Arrays;

public class SecondLargestNumberSearch {
    public static void main(String[] args) {
        int []arr={5,9,3,69,89,35,98,26};
        int n=arr.length;
        Arrays.sort(arr);
        int SecondLargestNum=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i] !=arr[n-1]){
                SecondLargestNum=arr[i];
                break;
            }
        }
        System.out.println("Second Largest Number In array: "+ SecondLargestNum);
    }
}
