class B extends A {
  public int x;
  public B(int p){
    y = temp + p ;
    sum = p+ temp + 1;
    temp-=1;
  }  
  public void methodA(){    
    int  y =0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    sum = x + y + methodB(x, y);
    System.out.println(x + " " + y+ " " + sum);
  }
}
