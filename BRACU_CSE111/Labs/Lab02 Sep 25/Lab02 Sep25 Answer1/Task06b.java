import java.util.Scanner;
public class Task06b {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[15];
        int[] b = new int[15];
        int i;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
            if(a[i]==0){
                b[0]++;
            }
            else if(a[i]==1){
                b[1]++;
            }
            else if(a[i]==2){
                b[2]++;
            }else if(a[i]==3){
                b[3]++;
            }else if(a[i]==4){
                b[4]++;
            }else if(a[i]==5){
                b[5]+=1;
            }else if(a[i]==6){
                b[6]++;
            }else if(a[i]==7){
                b[7]+=1;
            }else if(a[i]==8){
                b[8]++;
            }else if(a[i]==9){
                b[9]++;
            }
        }
        for(i=0; i<=b.length-1; ++i) {
            System.out.println(i+" was found "+b[i]+" times");
        }
    }
}
