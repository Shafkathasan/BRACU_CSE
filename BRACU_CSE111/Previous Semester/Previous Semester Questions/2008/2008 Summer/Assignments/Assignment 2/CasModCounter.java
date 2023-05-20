public class CasModCounter{
  /**
   * CaseModCounter is a cyclic counter within given limit. It 
   * can also form a chain of counters. When a limit for its count is
   * reached, it cycles back to 0 and informs the next counter in chain
   * to increment. Similarly, decrement is propogated as well.
   */ 

  private int m_limit = 0;
  private int m_value = 0;
  private CasModCounter m_next = null;
  
  /**
   * Constructor which sets the limit
   */ 
  public CasModCounter(int limit)
  {
   //TODO
  }  
    
  /**
   * Prints the count value in sequence starting from the left most counter.
   * @param void
   */
  public void print()
  {
  //TODO
  }
  
  /**
   * Allows you to attach a counter to left. If a counter is already 
   * attached, passes the given counter to it to attach.
   */ 

  public void attach(CasModCounter next)
  {
   //TODO
  }  

  /**
   * Increases the value of count. If value of count reaches limit,
   * the count rolls down to zero and the next Mod counter, if any, is
   * incremented. 
   */ 
 
  public void increment()
  {
  // TODO 	
  }  

  /**
   * Decreases the value of count. If value of count reaches -1,
   * the count rolls to the limit - 1 and the next Mod counter, if any, is
   * decremented.
   */ 
  public void decrement()
  {
  // TODO 
  }
}