import java.util.Scanner;

public class As2PrintRevNNum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        RevSum(n);
    }
    static void RevSum(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        n--;
        RevSum(n);
    }
}
