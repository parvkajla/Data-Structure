import java.util.Scanner;

public class Test_35_Qns4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("Values of array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int ni= arr.length-1;
        Decode(arr);

    }
    public static int[] Decode(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}
