import java.awt.*;
import javax.swing.*;

class EX09_Hello_JCheckBox {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(0, 1));
   //Create the check boxes.
    JCheckBox oneButton = new JCheckBox("One");
    oneButton.setSelected(true);
    
    JCheckBox twoButton = new JCheckBox("Two");
    twoButton.setSelected(true);
    
    JCheckBox threeButton = new JCheckBox("Three");
    threeButton.setSelected(true);
    
    JCheckBox fourButton = new JCheckBox("Four");
    fourButton.setSelected(true);    
    
    p.add(oneButton);
    p.add(twoButton);
    p.add(threeButton);
    p.add(fourButton);
    f.setContentPane(p); 
    f.pack();
    f.setVisible(true);
  }
}
