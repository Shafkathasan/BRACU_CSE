import java.awt.*;
import javax.swing.*;
class EX05_BorderLayoutExamplee {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(new JButton("One"),   BorderLayout.NORTH);
    p.add(new JButton("Two"),   BorderLayout.WEST);
    p.add(new JButton("Three"), BorderLayout.CENTER);
    p.add(new JButton("Four"),  BorderLayout.EAST);
    p.add(new JButton("Five"),  BorderLayout.SOUTH);
    f.setContentPane(p);    // add panel to frame
    f.pack();
    f.setVisible(true);
  }
}
