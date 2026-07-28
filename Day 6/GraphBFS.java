import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public GraphBFS(int vertices) {

        this.vertices = vertices;
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int source, int destination) {

        adjList.get(source).add(destination);
        adjList.get(destination).add(source);

    }

    public void bfs(int start) {

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;

        queue.offer(start);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbor : adjList.get(current)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.offer(neighbor);

                }

            }

        }

    }

    public static void main(String[] args) {

        GraphBFS graph = new GraphBFS(7);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(4,6);

        graph.bfs(0);

    }

}