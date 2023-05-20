package cse221labtask04;

import java.io.*;
import java.util.*;

class Graph {

    private int V;

    private ArrayList<ArrayList<Integer>> adj;

    Graph(int v) {
        V = v;
        adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; ++i) {
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    void topologicalSortUtil(
            int v, boolean visited[],
            Stack<Integer> stack) {
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        stack.push(new Integer(v));
    }

    void topologicalSort() {
        Stack<Integer> stack = new Stack<Integer>();

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        System.out.println(stack.pop());
    }

    public static void main(String args[]) {

        Scanner random = null;
        try {
            File f = new File("D:/OneDrive/Desktop/Graph 04.txt");
            random = new Scanner(f);
        } catch (Exception e) {

        }
        int p = random.nextInt();
        int e = random.nextInt();

        Graph g = new Graph(p);

        while (random.hasNext()) {

            int v1 = random.nextInt();

            int v2 = random.nextInt();

            g.addEdge(v1, v2);

        }

        g.topologicalSort();
    }
}
