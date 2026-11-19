class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int or = image[sr][sc];
        if(or == color) return image;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        int m = image.length, 
            n = image[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {sr, sc});

        image[sr][sc] = color;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            for(int d=0; d<4; d++) {
                int nr = r + dr[d], 
                    nc = c + dc[d];

                if(nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                if(image[nr][nc] != or) continue;

                image[nr][nc] = color;
                
                q.offer(new int[] {nr, nc});
            }
        }
        return image;
    }
}