public class minAndMaxNumberChecking {
    public static void main(String[] args) {
        int []arr={5,6,9,8,10,9,49,31,85};
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(max<arr[i]){ max=arr[i];}
            else if(min > arr[i]){ min=arr[i];}
        }
        System.out.println("Maximum Number of Values: "+max+" And Minimum Number of Values: "+min);
    }
}
