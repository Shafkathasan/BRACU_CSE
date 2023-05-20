package cse221labtask03;

import java.util.*;
import java.io.*;

public class AdjMat {

    public static void main(String[] args) {
        Scanner random = null;
        try {
            File f = new File("D:/OneDrive/Desktop/Graph 03.txt");
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
        System.out.println("");

        System.out.println("How many Competitors?");
        int ComNo = input.nextInt();

        int[] pos = new int[ComNo];
        int[] dis = new int[ComNo];
        

        System.out.println("Input Positions of the Competitors = ");
        ShortestPath t = new ShortestPath();
        for (int i = 0; i < ComNo; i++) {
            pos[i] = input.nextInt();
            dis[i] = t.dijkstra(x, pos[i], target);
        }
        
        Arrays.sort(dis);
        System.out.println("Minimum Distance = " + dis[0]);
    }
}
