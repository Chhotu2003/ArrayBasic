import java.util.*;
public class countNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the index values: "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        int neg=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]<0)
          neg++;
        }
        System.out.println("Total Number Negative Values: "+neg);
    }
}
