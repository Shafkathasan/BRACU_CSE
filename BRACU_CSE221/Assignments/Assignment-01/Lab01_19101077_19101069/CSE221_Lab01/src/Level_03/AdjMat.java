package Level_03;

import java.util.*;
import java.io.*;

public class AdjMat {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            File f = new File("D:\\Projects\\Note\\NetBeansProjects\\CSE221_Lab01\\Graph 03.txt");
            sc = new Scanner(f);
        } catch (Exception e) {

        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[][] x = new int[a][b];

        while (sc.hasNext()) {

            int v1 = sc.nextInt();

            int v2 = sc.nextInt();

            x[v1][v2] = 1; //For undirected graph, add the next line

        }

        Scanner input = new Scanner(System.in);
        System.out.print("Lina’s Position = ");
        int target = input.nextInt();
        System.out.println("");

        System.out.println("Number of Participants:");
        int ComNo = input.nextInt();

        int[] pos = new int[ComNo];
        int[] dis = new int[ComNo];
        

        System.out.println("Input Positions of the Participants:");
        ShortestPath t = new ShortestPath();
        for (int i = 0; i < ComNo; i++) {
            pos[i] = input.nextInt();
            dis[i] = t.dijkstra(x, pos[i], target);
        }
        
        Arrays.sort(dis);
        System.out.println("Minimum Distance = " + dis[0]);
    }
}
