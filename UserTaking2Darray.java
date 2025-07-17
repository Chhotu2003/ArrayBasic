import java.util.*;
public class UserTaking2Darray {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][]arr=new int[5][3];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print("enter the array values "+(i+1)+" : ");
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print("Student marks "+(i+1)+" : ");
        for(int j=0;j<arr[i].length;j++){
         System.out.print(arr[i][j]+" ");
        }
      System.out.println();
    }
   } 
}
