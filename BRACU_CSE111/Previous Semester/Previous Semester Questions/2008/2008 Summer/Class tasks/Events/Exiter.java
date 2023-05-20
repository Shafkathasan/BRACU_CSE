import java.awt.event.*;

class Exiter extends WindowAdapter {
  public void windowClosing(WindowEvent e) {
    System.out.println("Exiting.");
  }
}

