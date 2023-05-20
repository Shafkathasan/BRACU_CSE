import javax.swing.*;

class EX01_Hello_JButton {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    JButton b = new JButton("press me");
    
    p.add(b);   // add button to panel
    f.setContentPane(p);    // add panel to frame
    
    f.pack();
    f.setVisible(true);
  }
}
