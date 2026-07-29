import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public TopologicalSort(int vertices) {

        this.vertices = vertices;

        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<Integer>());
        }

    }

    public void addEdge(int source, int destination) {

        adjList.get(source).add(destination);

    }

    public void topologicalSort() {

        int[] indegree = new int[vertices];

        for (int i = 0; i < vertices; i++) {

            for (int neighbor : adjList.get(i)) {

                indegree[neighbor]++;

            }

        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertices; i++) {

            if (indegree[i] == 0) {

                queue.offer(i);

            }

        }

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbor : adjList.get(current)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {

                    queue.offer(neighbor);

                }

            }

        }

    }

    public static void main(String[] args) {

        TopologicalSort graph = new TopologicalSort(6);

        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        graph.topologicalSort();

    }

}