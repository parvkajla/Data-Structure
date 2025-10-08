public class Test_35_Qns10 {
        public int countPonds(int[][] villageMap) {
            if (villageMap == null || villageMap.length == 0) {
                return 0;
            }

            int rows = villageMap.length;
            int cols = villageMap[0].length;
            int pondCount = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (villageMap[i][j] == 1) {
                        pondCount++;
                        exploreAndMarkPond(villageMap, i, j);
                    }
                }
            }
            return pondCount;
        }

        private void exploreAndMarkPond(int[][] map, int row, int col) {
            int rows = map.length;
            int cols = map[0].length;

            if (row < 0 || row >= rows || col < 0 || col >= cols || map[row][col] == 0) {
                return;
            }

            map[row][col] = 0;

            exploreAndMarkPond(map, row + 1, col);
            exploreAndMarkPond(map, row - 1, col);
            exploreAndMarkPond(map, row, col + 1);
            exploreAndMarkPond(map, row, col - 1);
        }
}
