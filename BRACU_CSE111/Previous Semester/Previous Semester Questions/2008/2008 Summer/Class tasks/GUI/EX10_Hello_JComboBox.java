import java.awt.*;
import javax.swing.*;

class EX10_Hello_JComboBox {
  public static void main(String[] args){
    String[] petStrings = { "One", "Two", "Three", "Four", "Five" };
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    JComboBox jc = new JComboBox(petStrings);
    
    p.add(jc);   // add button to panel
    f.setContentPane(p);    // add panel to frame
    
    f.pack();
    f.setVisible(true);
  }
}
