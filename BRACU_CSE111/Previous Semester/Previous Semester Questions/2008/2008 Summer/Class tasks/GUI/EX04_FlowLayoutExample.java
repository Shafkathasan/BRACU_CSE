import java.awt.*;
import javax.swing.*;
class EX04_FlowLayoutExample {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    p.setLayout(new FlowLayout());
    p.add(new JButton("One"));
    p.add(new JButton("Two"));
    p.add(new JButton("Three"));
    p.add(new JButton("Four"));
    p.add(new JButton("Five"));
    p.add(new JButton("Six"));
    f.setContentPane(p);    // add panel to frame
    f.pack();
    f.setVisible(true);
  }
}
