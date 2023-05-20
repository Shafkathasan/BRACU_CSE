import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {
  // No constructor needed here
  // Must have this method to implement ActionListener
  public void actionPerformed(ActionEvent anActionEvent) {
    System.out.println("Interface Button was clicked!");
  }
}
