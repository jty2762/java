import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingTT extends JFrame {
    public SwingTT(){

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b = new JButton("Test");

        b.setBackground(Color.YELLOW);
        b.setForeground(Color.MAGENTA);
        b.setFont(new Font("Arial", Font.ITALIC,20));

        c.add(b);
        setSize(260,200);
        setVisible(true);
   }
   public static void main(String[] args){
       new SwingTT();
   }
}
