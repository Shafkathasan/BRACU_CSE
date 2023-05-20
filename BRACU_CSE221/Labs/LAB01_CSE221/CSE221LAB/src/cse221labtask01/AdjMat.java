package cse221labtask01;

import java.util.*;
import java.io.*;

public class AdjMat {

    public static void main(String[] args) {
        Scanner random = null;
        try {
            File f = new File("D:/OneDrive/Desktop/Graph.txt");
            random = new Scanner(f);
        } catch (Exception e) {

        }

        int s = random.nextInt();
        int e = random.nextInt();
        
        int[][] x = new int[s][s];
        

        while (random.hasNext()) {

            int v1 = random.nextInt();

            int v2 = random.nextInt();

            x[v1][v2] = 1;
            //For undirected graph, add the next line too
            // x[v2][v1] = 1; 

        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Target Position = ");
        int target = input.nextInt();
        
        ShortestPath t = new ShortestPath();
        t.dijkstra(x, 0, target);
    }
}
