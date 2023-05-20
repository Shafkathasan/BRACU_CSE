import java.awt.*;
import javax.swing.*;

class EX12_Hello_JTextPane {
  public static void main(String[] args){
    String[] petStrings = { "One", "Two", "Three", "Four", "Five" };
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    JTextPane textPane = new JTextPane();
    textPane.setCaretPosition(0);
    textPane.setMargin(new Insets(5,5,5,5));
    JScrollPane scrollPane = new JScrollPane(textPane);
    scrollPane.setPreferredSize(new Dimension(200, 200));
    p.add(scrollPane);   // add button to panel
    f.setContentPane(p);    // add panel to frame
    
    f.pack();
    f.setVisible(true);
  }
}
