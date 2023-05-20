import java.awt.*;
import javax.swing.*;

class EX15_Hello_JCheckBox_Event {
  public static void main(String[] args){
    JFrame f = new JFrame("title");
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(0, 1));
    
    MyItemListener mil = new MyItemListener();
   //Create the check boxes.
    JCheckBox oneButton = new JCheckBox("One");
    oneButton.setSelected(true);
    
    JCheckBox twoButton = new JCheckBox("Two");
    twoButton.setSelected(true);
    
    JCheckBox threeButton = new JCheckBox("Three");
    threeButton.setSelected(true);
    
    JCheckBox fourButton = new JCheckBox("Four");
    fourButton.setSelected(true);  
    //-----------------------------------
    oneButton.addItemListener(mil);
    twoButton.addItemListener(mil);
    threeButton.addItemListener(mil);
    fourButton.addItemListener(mil);
    //------------------------------------
    p.add(oneButton);
    p.add(twoButton);
    p.add(threeButton);
    p.add(fourButton);
    f.setContentPane(p); 
    f.pack();
    f.setVisible(true);
  }
}
