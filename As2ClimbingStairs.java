import java.util.Scanner;

class As2ClimbingStairs {
    public static int ClimbStairs(int n) {
        if (n <=3) return n;
        int a=2;
        int b=3;
        int ans=0;
        for(int i =0; i<n-3; i++){
            ans= a+b;
            a=b;
            b=ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(ClimbStairs(n));
    }
}