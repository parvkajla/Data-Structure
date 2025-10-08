import java.util.Scanner;

public class Test_35_Qns2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("Values of array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int index=0;
        System.out.println(LostSoldier(index, arr));
    }
    public static int LostSoldier(int i, int[] arr){
        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]+1==arr[i+1]){
            i++;
            return LostSoldier(i, arr);
        }
        else {
            return arr[i];
        }
    }

}
