import java.util.*;
class UserInputValue{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter value array "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
            System.out.println("Student "+(i+1)+" : "+arr[i]);
         }
    }
}