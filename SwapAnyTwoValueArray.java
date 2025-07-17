import java.util.*;;
public class SwapAnyTwoValueArray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the size: ");
       int n=sc.nextInt();
       int[] arr=new int[n];
       System.out.println("enter the values of array: ");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       System.out.print("Original value: ");
       for(int arr1:arr){
        System.out.print(arr1+" ");
       }
       System.out.println();
       System.out.println("Index 1: ");
       int a=sc.nextInt();
       System.out.println("Index 2: ");
       int b=sc.nextInt();
       // Swapping the any two values change the original values
       int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
       System.out.print("Swapping Values of Array : ");
      for(int arr2:arr){
         System.out.print(arr2+" ");
      }
    }
}
