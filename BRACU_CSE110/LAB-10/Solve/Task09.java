import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[15];
        int zero=0, one=0, two=0, three=0, four=0, five=0,
            six=0, seven=0, eight=0, nine=0;
        int i;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            if(i>=0 && i<=9){
                a[i]=sc.nextInt();
                if(a[i]==0) {
                    ++zero;
                } else if(a[i]==1) {
                    ++one;
                } else if(a[i]==2) {
                    ++two;
                } else if(a[i]==3) {
                    ++three;
                } else if(a[i]==4) {
                    ++four;
                } else if(a[i]==5) {
                    ++five;
                } else if(a[i]==6) {
                    ++six;
                } else if(a[i]==7) {
                    ++seven;
                } else if(a[i]==8) {
                    ++eight;
                } else if(a[i]==9) {
                    ++nine;
                }
            }
        }
        System.out.println("Number-0: "+zero+"time");
        System.out.println("Number-1: "+one+"time");
        System.out.println("Number-2: "+two+"time");
        System.out.println("Number-3: "+three+"time");
        System.out.println("Number-4: "+four+"time");
        System.out.println("Number-5: "+five+"time");
        System.out.println("Number-6: "+six+"time");
        System.out.println("Number-7: "+seven+"time");
        System.out.println("Number-8: "+eight+"time");
        System.out.println("Number-9: "+nine+"time");
    }
}
