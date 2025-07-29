import java.util.Scanner;
public class ReverseNumWithoutSecondArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the Values: ");
            arr[i]=sc.nextInt();
        }
        int a=0;
        int b=n-1;
        while(a<b){
            arr[a]=arr[a]+arr[b];
            arr[b]=arr[a]-arr[b];
            arr[a]=arr[a]-arr[b];
            a++;
            b--;
        }
        for(int arr1:arr){
            System.out.println("Reverse All Values: "+arr1);
        }
    }
}
