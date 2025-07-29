import java.util.*;
public class InsertIntoLastValues {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size: ");
    int n=sc.nextInt();
    int arr[]=new int[n+1];
    for(int i=0;i<n;i++){
        System.out.print("Enter the array Values: ");
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the insert last Values: ");
    arr[n]=sc.nextInt();
    for(int i=0;i<n+1;i++){
        System.out.println("show the output values: "+arr[i]);
    }
   } 
}
