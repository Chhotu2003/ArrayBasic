import java.util.*;
public class SumOfarray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size: ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("enter the values of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        System.out.println("Total value of Sum: "+total);
    }
}