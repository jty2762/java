import javax.swing.*;
import java.awt.*;
public class GUITest1234 extends JFrame {
 public GUITest1234() {
  setTitle("Example");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container contentPane = getContentPane();
  contentPane.setLayout(new BorderLayout(30,20));
  JPanel panel1 = new JPanel();
  JPanel panel2 = new JPanel();
  
  panel1.add(new JTextField("                  "));
  
  panel2.setLayout(new GridLayout(2,2));
  panel2.add(new JButton("1"));
  panel2.add(new JButton("2"));
  panel2.add(new JButton("3"));
  panel2.add(new JButton("4"));
  
  contentPane.add(panel1,BorderLayout.NORTH);
  contentPane.add(panel2,BorderLayout.CENTER); 
  
  setSize(300, 150);
  setVisible(true);
 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  GUITest1234 frame = new GUITest1234();
 }
}
