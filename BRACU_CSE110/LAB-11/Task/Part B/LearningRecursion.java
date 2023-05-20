public class LearningRecursion {
  static int factorial(int n) {
    if (n <= 1) { 
      return 1;
    }
    return n * factorial(n-1);
  }
  static void printing(int n) {
    System.out.println(n);
    if (n > 1) {
      printing(n-1);
    }
  }
  public static void main(String[] args) { 
    System.out.println(LearningRecursion.factorial(3));
    LearningRecursion.printing(3);
  }
}
