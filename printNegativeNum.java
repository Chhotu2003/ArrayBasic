public class printNegativeNum {
    public static void main(String[] args) {
        int[] arr={1,-5,-3,8,-2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) 
            System.out.println("Negative Value: "+arr[i]);
        }
    }
}
