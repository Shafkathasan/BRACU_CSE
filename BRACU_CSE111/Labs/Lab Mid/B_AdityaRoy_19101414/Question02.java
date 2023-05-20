import java.util.*;
public class Question02{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[sc.nextInt()];
    for(int i = 0 ; i < a.length ; i++){
      a[i] = sc.nextInt();
    }
    int search = sc.nextInt();
    int count = 0;
    for(int i = 0; i < a.length ; i++){
      if(a[i] == search){
        count++;
      }
    }
    int[] b = new int[count];
    int j = 0;
    for(int i = 0 ; i < a.length ; i++){
      if(a[i] == search) {
        b[j++] = a[i];
      }
    }
    for(int i = 0 ; i < b.length ; i++){
      System.out.print(b[i]+", ");
    }
    System.out.println();
    System.out.println("Array size: "+b.length);
  }
}