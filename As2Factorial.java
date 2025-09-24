import java.util.Scanner;

public class As2Factorial {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();

        System.out.println(Factorial(n));
    }
    static int Factorial(int n){

        if (n==0 || n==1){
            return 1;
        }


        return n*Factorial(n-1);
    }
}
