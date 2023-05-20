public class LabQOne {
 
 public static void main(String[] args) {
//  Object o = new Object();
//  printObject(o);
//  Integer i = new Integer(20);
//  printObject(i);
//  Float f = new Float(20);
//  printObject(f);
//  Student st1 = new Student("Mark Waugh", "010101");
//  printObject(st1);
//  st1.setName("Steve Waugh");
//  st1.setId("020202");
//  printObject(st1);
  BbaStudent bbaS1= new BbaStudent("Brett Lee", "030303", "Why Study BBA?");
  printObject(bbaS1);
//  bbaS1.setName("Michael Vaughan");
//  bbaS1.setId("040404");
//  printObject(bbaS1);
  
 }
 
 public static void printObject(Object o){
  System.out.println("====================================");
  System.out.println("The Output is: "+ o );
 }
}
