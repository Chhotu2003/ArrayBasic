public class CountOddEvenNumber {
    public static void main(String[] args) {
        int OddNum=0,EvenNum=0;
        int[] arr={1,2,3,5,6,8,9,4,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) EvenNum++;
            else OddNum++;
        }
        System.out.println("Total Number Odd: "+OddNum+" Total Number Even: "+EvenNum);
    }
}
