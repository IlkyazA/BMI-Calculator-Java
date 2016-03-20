package Trials;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
public class GuiCalculator implements ActionListener{
     JButton artiButton = new JButton("+");
     JButton eksiButton = new JButton("-");
     JButton carpiButton = new JButton("x");
     JButton boluButton = new JButton("/");
     JButton esittirButton=new JButton("=");
       JTextField resultButton = new JTextField();
     public GuiCalculator()
     {
         JFrame frame = new JFrame("Calculator");
         GridLayout gl = new GridLayout(5,2,3,4);
         JPanel panel = new JPanel();
          TitledBorder tb = new TitledBorder("Enter the numbers");
        panel.setLayout(gl);
        panel.setBorder(tb);
        
        
        artiButton.addActionListener(this);
        eksiButton.addActionListener(this);
        carpiButton.addActionListener(this);
        boluButton.addActionListener(this);
        esittirButton.addActionListener(this);
        resultButton.addActionListener(this);
        panel.add(artiButton);
        panel.add(eksiButton);
        panel.add(carpiButton);
        panel.add(boluButton);
        panel.add(esittirButton);
        panel.add(resultButton);
        
         frame.add(panel);
        
           frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     }
      public static void main(String[] args) {
        GuiCalculator gui=new GuiCalculator();
    }
     @Override
      public void actionPerformed(ActionEvent e)
      {if (e.getActionCommand().equals("="))
      {}//devamý gelecek...eger sayýlar toplanýosa fonksionlarý cagýr buraya
      else if(e.getActionCommand().equals("+"))
      {System.out.println("+");}
     else if(e.getActionCommand().equals("-"))
     {System.out.println("-");}
         else if(e.getActionCommand().equals("*"))
         {System.out.println("*");}
             else if(e.getActionCommand().equals("/"))
              {System.out.println("/");}
      }
}

