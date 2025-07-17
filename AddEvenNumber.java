import java.util.*;
public class AddEvenNumber {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Size of array : ");
    int n=sc.nextInt();
    System.out.print("Enter the values of Array : ");
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int total=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0) {
        total +=arr[i];
        }
    }
    System.out.println("Total Sum Even : "+total);
   } 
}
