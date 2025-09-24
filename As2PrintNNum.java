import java.util.Scanner;

public class As2PrintNNum {
    static  int i=1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        SumNum(n);
    }
    static void SumNum(int n){

        if(i>n){
            return;
        }
        System.out.print(i+" ");
        i++;
        SumNum(n);
    }
}
