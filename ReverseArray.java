import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // original the array in place
        System.out.print("Original value : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // Reverse the array in-place
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n -1 - i];
            arr[n - 1 - i] = temp;
        }

        // Output reversed array
        System.out.print("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
