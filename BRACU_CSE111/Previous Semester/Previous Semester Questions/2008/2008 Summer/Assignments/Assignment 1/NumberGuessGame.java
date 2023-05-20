import java.util.Random;

public class NumberGuessGame
{
  //////////////// fields //////////////////
  private int maxNum = 100;
  private int minNum = 1;
  private Random randomNumGen = new Random();
  private int pickedNum;
  private int numGuesses = 0;
  SimpleInput sp = new SimpleInput();
  //////////// constructors /////////////////
  
  public NumberGuessGame()
  {
    this.pickedNum = this.randomNumGen.nextInt(this.maxNum - 
                                       this.minNum + 1);
    this.pickedNum = this.pickedNum + this.minNum;
  }
  
  public NumberGuessGame(int min, int max)
  {
    this.minNum = min;
    this.maxNum = max;
    this.pickedNum = this.randomNumGen.nextInt(this.maxNum - 
                                       this.minNum + 1);
    this.pickedNum = this.pickedNum + this.minNum;
  }
  
  public String toString()
  {
    return "Picked num: " + this.pickedNum;
  }
  
  public void playGame()
  {
  }
  
  public static void main(String[] args)
  {
    NumberGuessGame game = new NumberGuessGame();
    game.playGame();
    System.out.println(game);
  }

  }