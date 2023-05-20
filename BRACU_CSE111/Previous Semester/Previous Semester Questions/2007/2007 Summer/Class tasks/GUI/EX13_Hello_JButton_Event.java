import javax.swing.*;

class EX13_Hello_Event {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    JButton b = new JButton("press me");
    MyButtonListener bl = new MyButtonListener();
    b.addActionListener(bl);
    p.add(b);   // add button to panel
    f.setContentPane(p);    // add panel to frame
    
    f.pack();
    f.setVisible(true);
  }
}
