import java.util.*;
public class Task03{
  public static void main(String[]args){
    String kisuShongkha = "74                89          \n    45";
    Scanner k = new Scanner(kisuShongkha);
    while(k.hasNextInt()){
      System.out.println(k.nextInt());
    }
    
    
    
//        String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
//        Scanner k2=new Scanner(golpo);
//        while(k2.hasNextLine()){
//            System.out.println(k2.nextLine());
//        }
//        
    String s="23 3 8 20 32";
    int sum=0;
    Sting a[]= s.split(" ");
    for(int i=0; i<a.length; i++) {
        sum = sum + a[i];
    }
    System.out.println(sum);
   
  }
}
//Write code below that adds the above numbers and prints sum.




