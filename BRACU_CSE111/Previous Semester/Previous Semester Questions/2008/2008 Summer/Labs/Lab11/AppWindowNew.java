import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class AppWindowNew extends JFrame implements ActionListener {
  
  Container contentPane;
  JLabel inputOne = new JLabel("First Number");
  JLabel inputTwo = new JLabel("Second Number");
  JLabel result = new JLabel("Result");
  JTextField inputOneData = new JTextField(30);
  JTextField inputTwoData = new JTextField(30);
  JTextField showData = new JTextField(30);
  JButton add = new JButton("ADD");
  JButton sub = new JButton("SUB");
  JButton mult = new JButton("MULT");
  JButton div = new JButton("DIV");
  JButton clear = new JButton("CLEAR");
  JMenuBar menuBar = new JMenuBar();
  JMenu choiceMenu = new JMenu("Choice");
  JMenuItem addChoice = new JMenuItem("ADD");
  JMenuItem subChoice = new JMenuItem("SUB");
  JMenuItem multChoice = new JMenuItem("MULT");
  JMenuItem divChoice = new JMenuItem("DIV");
  JMenuItem clearChoice = new JMenuItem("CLEAR");
  JMenuItem exitChoice = new JMenuItem("Exit");
  
  public AppWindowNew () {
    
    //setupMenuBar();
    addLayout();
    addWindowListener(new MyWindowAdapter());
    setSize(new Dimension(450,230));
    setTitle("An AWT Application");
    pack();
    setVisible(true);
  }
  
 
  public void addLayout() {
    
    contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    
    JPanel inputPane = new JPanel();
    inputPane.setLayout(new GridLayout(3, 2, 10, 10));
    
    inputPane.add(inputOne);
    inputPane.add(inputOneData);
    inputPane.add(inputTwo);
    inputPane.add(inputTwoData);
    inputPane.add(result);
    inputPane.add(showData);
    
    inputPane.setBorder(new TitledBorder("Input & Result"));
    
    contentPane.add("Center", inputPane);
    
    JPanel buttPane = new JPanel();
    buttPane.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    buttPane.add(add);
    buttPane.add(sub);
    buttPane.add(mult);
    buttPane.add(div);
    buttPane.add(clear);
    
    add.addActionListener(this);
    sub.addActionListener(this);    
    mult.addActionListener(this);    
    div.addActionListener(this);
    clear.addActionListener(this);
    
    buttPane.setBorder(new TitledBorder("Button"));
    
    contentPane.add("South", buttPane);
  }
  

  public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    
    if(str.equals("ADD")) {
      showData.setText( String.valueOf(Integer.parseInt(inputOneData.getText()) +
Integer.parseInt(inputTwoData.getText()) ));
      
    }
    else if(str.equals("SUB")) {
      showData.setText( String.valueOf(Integer.parseInt(inputOneData.getText()) -
Integer.parseInt(inputTwoData.getText()) ));
      
    }
    else if(str.equals("MULT")) {
      showData.setText( String.valueOf(Integer.parseInt(inputOneData.getText()) *
Integer.parseInt(inputTwoData.getText()) ));
      
    }
    else if(str.equals("DIV")) {
      showData.setText( String.valueOf(Double.parseDouble(inputOneData.getText()) /
Double.parseDouble(inputTwoData.getText()) ));
      
    }
    else if(str.equals("CLEAR")) {
      inputOneData.setText("");
      inputTwoData.setText("");
      showData.setText("");
      
    }
    else if(str.equals("Exit")) {
      System.exit(0);
    }
    
  }
  
  public static void main(String args[]) {
    
    AppWindowNew appWin = new AppWindowNew();
    
  }
}

class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent we) {
    
  }
}


