public class Test_35_Qns6 {
    public static int MaxTreasureRow(int[][] arr){
        int maxRow=0;
        for(int row=0; row<arr.length; row++){
            int max= Integer.MIN_VALUE;
            int sum=0;
            for(int i=0; i<arr[row].length; i++){
                sum+=arr[row][i];
            }
            if(max<sum) maxRow=row;
        }
        return maxRow;
    }
}
