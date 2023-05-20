public class TicTac{
  int [] board = {1,2,3,4,5,6,7,8,9};
  public void printBoard(){
    int i = 0;
    while (i < 9){
      if (board[i]  == 200){
        System.out.print("X");
      }else{
        System.out.print(board[i] );
      }
      if(((i+1) % 3) == 0){
        System.out.println();
        if (i != 8){
          System.out.println("---------");        
        }
      }else{
        System.out.print(" | ");
      }
      i++;
    }
    System.out.println();
  }
  public void getInput(){
    int input;
    SimpleInput s1 = new SimpleInput();
    input = s1.getInt("Please enter your input");
    board[input - 1] = 200;
    
  }
  
  public void getComputerInput(){
	  int i;
	  while(true){
		  
		  i=(int)(Math.random()*9);
		  if(board[i]!=200 && board[i]!=0){
			  board[i]=0;
			  break;
		  }
	  }
  }
}