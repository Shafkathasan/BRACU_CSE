package Level_02;

import java.util.Scanner;
import java.io.*;

public class AdjMat {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            File f = new File("D:\\Projects\\Note\\NetBeansProjects\\CSE221_Lab01\\Graph 02.txt");
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
