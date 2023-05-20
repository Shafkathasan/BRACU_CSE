import javax.swing.*;

class EX14_Hello_JButton_Event {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    f.addWindowListener(new Exiter()); 
    JPanel p = new JPanel();
    JButton b = new JButton("press me");
    MyButtonListener bl = new MyButtonListener();
    b.addActionListener(bl); 
    p.add(b);   // add button to panel
    f.setContentPane(p);    // add panel to frame
    
    f.pack();
    f.setVisible(true);
    System.out.println("The end of main().");
  }
}
