import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EX16_Hello_JTextPane_Event{
  private JFrame f;
  private JPanel p;    
  private JTextPane textPane;
  private JButton b;  
  private JScrollPane scrollPane;
  public class MyButtonListener implements ActionListener {
    // No constructor needed here
    // Must have this method to implement ActionListener
    public void actionPerformed(ActionEvent anActionEvent) {
      System.out.println(textPane.getText());
    }
  }
 
  public EX16_Hello_JTextPane_Event(){
    f = new JFrame("title");
    p = new JPanel();    
    textPane = new JTextPane();
    b = new JButton("Print");
    b.addActionListener(new MyButtonListener());
    textPane.setCaretPosition(0);
    textPane.setMargin(new Insets(5,5,5,5));
    scrollPane = new JScrollPane(textPane);
    scrollPane.setPreferredSize(new Dimension(200, 200));
    p.add(scrollPane);   // add button to panel
    p.add(b);
    f.setContentPane(p);    // add panel to frame    
    f.pack();
    f.setVisible(true);
  }
  public static void main(String[] args){
    EX16_Hello_JTextPane_Event test = new EX16_Hello_JTextPane_Event();
  } 
}
