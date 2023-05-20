import java.util.*;
public class Manager{
    public static void main(String []args){
        Scanner k=new Scanner(System.in);
        StudentDatabase sd = new StudentDatabase();
        sd.records = new Student [5];
        int c=0;
        while(c<sd.records.length){
            sd.records[c] = new Student();
            System.out.print("Naam dao: ");
            sd.records[c].name=k.nextLine();
            System.out.print("ID dao: ");
            sd.records[c].id=k.nextLine();
            System.out.print("Section dao: ");
            sd.records[c].section=k.nextInt();
            System.out.print("Mark nai?: ");
            sd.records[c].mark=k.nextDouble();
            k.nextLine();
            ++c;
        }
        System.out.println();
        System.out.println("1) Sort by Name");
        System.out.println("2) Sort by ID");
        System.out.println("3) Sort by Section");
        System.out.println("4) Sort by Mark (Income)");
        int choice;
        System.out.println("Ki chao? ");
        choice=k.nextInt();
        
        if(choice==1){
            sd.sortByName();
        }else if(choice==2){
            sd.sortByID();
        }else if(choice==3){
            sd.sortBySection();
        }else if(choice==4){
            sd.sortByMark();
        }else{
            System.out.println("ki chao, valo kore bolo");
        }
        
        sd.printDatabase();
    }
}