import java.util.Scanner;

public class As2SumOfN {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int result= Sum(n);
        System.out.println(result);
    }
    public static int Sum(int n){
        if (n<=1) {
            return n;
        }
             return  n + Sum(n-1);

        }
    }



