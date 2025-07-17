import java.util.*;
public class IndexOddNumberValueSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size : ");
        int n=sc.nextInt();
        System.out.print("enter the values : ");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int tol=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0) 
            tol=tol+arr[i];
        }
        System.out.println("Total sum of value odd Index Number: "+tol);
    }
}
