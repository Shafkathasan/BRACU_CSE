import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MyItemListener implements ItemListener {
  // No constructor needed here
  // Must have this method to implement ActionListener
  public void itemStateChanged(ItemEvent e) {
    JCheckBox source = (JCheckBox)e.getItemSelectable();
    System.out.println("Item was changed :"+source.getText()+" "+source.isSelected());
  }
}
