import java.util.*;;
public class CopyArray {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[]arr=new int[5];
    int[]arr1=new int[5];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr1.length;i++){
        arr1[i]=arr[i];
    }
    System.out.print("Original values: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.print("Copied values : ");
     for(int i=0;i<arr.length;i++){
        System.out.print(arr1[i]+" ");
    }
    System.out.println();
   } 
}
