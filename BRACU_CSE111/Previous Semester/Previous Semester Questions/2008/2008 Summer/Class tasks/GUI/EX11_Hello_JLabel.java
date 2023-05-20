import java.awt.*;
import javax.swing.*;

class EX11_Hello_JLabel {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(new JLabel("One", JLabel.CENTER),   BorderLayout.NORTH);
    p.add(new JLabel("Two", JLabel.CENTER),   BorderLayout.WEST);
    p.add(new JLabel("Three", JLabel.CENTER), BorderLayout.CENTER);
    p.add(new JLabel("Four", JLabel.CENTER),  BorderLayout.EAST);
    p.add(new JLabel("Five", JLabel.CENTER),  BorderLayout.SOUTH);
    f.setContentPane(p); 
    f.pack();
    f.setVisible(true);
  }
}
