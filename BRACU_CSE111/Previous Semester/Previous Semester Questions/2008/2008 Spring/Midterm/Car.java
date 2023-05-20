public class Car{
  private static int carCount;
  private int year;
  public Car(int year){
    this.year = year;
    carCount++;
  }
  public int getYear(){
    return year;
  }
  public static int getObjectCount(){
    return carCount;
  }
}