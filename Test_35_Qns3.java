import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Test_35_Qns3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("Values of array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.print("Enter target no: ");
        int target= in.nextInt();
        int index=0;
        System.out.println(findPotion(arr,   target));

    }

    public static int[] findPotion(int[] potions, int target) {
        Map<Integer, Integer> seenPotions = new HashMap<>();
        for (int i = 0; i < potions.length; i++) {
            int currentPotionStrength = potions[i];
            int complement = target - currentPotionStrength;

            if (seenPotions.containsKey(complement)) {
                int complementIndex = seenPotions.get(complement);
                return new int[]{complementIndex + 1, i + 1};
            }

            seenPotions.put(currentPotionStrength, i);
        }

        throw new IllegalArgumentException("No two potions add up to the target strength.");
    }

}
