import java.util.Scanner;

public class Test_35_Qns1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("Values of array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int index=0;
        int max= Integer.MIN_VALUE;
        System.out.println(MaxFoodPlate(index, max, arr));

    }
    public static int MaxFoodPlate(int index, int max, int[] arr){
        if(arr[index]<max){
            max= arr[index];
        }
        if(index<arr.length-2){
            index++;
            return MaxFoodPlate(index, max, arr);
        }
        return max;
    }
}
