public class UnionFind {

    private int[] parent;

    public UnionFind(int size) {

        parent = new int[size];

        for (int i = 0; i < size; i++) {

            parent[i] = i;

        }

    }

    public int find(int node) {

        if (parent[node] != node) {

            parent[node] = find(parent[node]);

        }

        return parent[node];

    }

    public void union(int node1, int node2) {

        int root1 = find(node1);

        int root2 = find(node2);

        if (root1 != root2) {

            parent[root2] = root1;

        }

    }

    public boolean isConnected(int node1, int node2) {

        return find(node1) == find(node2);

    }

    public void displayParents() {

        for (int i = 0; i < parent.length; i++) {

            System.out.println(i + " -> " + parent[i]);

        }

    }

    public static void main(String[] args) {

        UnionFind uf = new UnionFind(7);

        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(3, 4);
        uf.union(5, 6);
        uf.union(2, 6);

        System.out.println(uf.isConnected(0, 6));
        System.out.println(uf.isConnected(3, 5));

        uf.displayParents();

    }

}