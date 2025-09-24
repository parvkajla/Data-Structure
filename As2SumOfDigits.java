import java.util.Scanner;

public class As2SumOfDigits {
    static int j=0;
    static int count=0;
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println(Sum(n, arr));

    }
    static int Sum(int n, int[] arr){
        if(n<0){
            return count;
        }
        count += arr[j];
        j++;
        return count + Sum(n, arr);
    }
}
