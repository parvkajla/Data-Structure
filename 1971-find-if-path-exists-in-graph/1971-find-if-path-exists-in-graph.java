class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            addEdge(adj,edges[i][0],edges[i][1]);
        }
        boolean[] visited=new boolean[n];
        return dfs(adj,source,destination,visited);
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int source, int destination, boolean[] visited) {
        if(source==destination) {
            return true;
        }
        visited[source]=true;
        for(int k : adj.get(source)) {
            if(!visited[k]) {
                if(dfs(adj,k,destination,visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    private void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}