import java.awt.*;
import javax.swing.*;
class EX03_NullLayoutExample {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();    
    JButton b1 = new JButton("One");
    b1.setBounds(new Rectangle(10,10, 100,50));
    JButton b2 = new JButton("Two");
    b2.setBounds(new Rectangle(100,60, 100,50));
    JButton b3 = new JButton("Three");
    b3.setBounds(new Rectangle(200,110, 100,50));
    JButton b4 = new JButton("Four");
    b4.setBounds(new Rectangle(300,110, 100,50));
    JButton b5 = new JButton("Five");
    b5.setBounds(new Rectangle(400,60, 100,50));
    JButton b6 = new JButton("Six");
    b6.setBounds(new Rectangle(500,10, 100,50));
    p.setPreferredSize(new Dimension(610, 300));
    p.setLayout(null);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(b4);
    p.add(b5);
    p.add(b6);
    f.setContentPane(p);    // add panel to frame
    f.pack();
    f.setVisible(true);
  }
}
