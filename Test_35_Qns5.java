import java.util.Scanner;

public class Test_35_Qns5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("Values of array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int i=0;
        System.out.println(SoldierHeight(arr, i));
    }
    public static boolean SoldierHeight(int[] arr, int i){
        if(arr[i]>arr[i+1]){
            return false;
        }
        if(i<arr.length-2){
            i++;
            return SoldierHeight(arr, i);
        }
        return true;
    }
}
