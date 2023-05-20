package cse221labtask02;

import java.util.*;
import java.io.*;

public class AdjMat {

    public static void main(String[] args) {
        Scanner random = null;
        try {
            File f = new File("D:/OneDrive/Desktop/Graph 02.txt");
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
        
        System.out.print("Nora's Position = ");
        int NoPo = input.nextInt();
        System.out.println("");
        
        System.out.print("Lara's Position = ");
        int LaPo = input.nextInt();
        System.out.println("");
        
        ShortestPath t = new ShortestPath();
        int NoDi = t.dijkstra(x, NoPo, target);
        int LaDi = t.dijkstra(x, LaPo, target);
        
        if (NoDi < LaDi) {
            System.out.println("Nora can go first");
        }
        else if(LaDi < NoDi){
            System.out.println("Lara can go first");
        }
        
        else{
            System.out.println("Same Time");
        }
    }
}
