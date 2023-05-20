import java.io.*;
class EX06_MyClass implements Serializable {
 String s;
 transient int i;
 double d; 
 public EX06_MyClass(String s, int i, double d){
  this.s = s;
  this.i = i;
  this.d = d;
 }
 public String toString() {
  return "s=" + s + "; i=" + i + "; d=" + d;
 }
} 
