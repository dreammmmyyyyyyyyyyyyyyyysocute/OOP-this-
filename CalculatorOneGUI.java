import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorOneGUI implements ActionListener{
    private JFrame jf;
    private JPanel jp;
    private JButton jbt1, jbt2, jbt3, jbt4;
    private JTextField f1, f2, f3;
    
    public CalculatorOneGUI(){
        JFrame jf = new JFrame("Caculator");
        JPanel jp = new JPanel();
        jbt1 = new JButton("+");
        jbt2 = new JButton("-");
        jbt3 = new JButton("x");
        jbt4 = new JButton("/");
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        jp = new JPanel();
        
        //Add Listener
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        jbt3.addActionListener(this);
        jbt4.addActionListener(this);
        
        //Set Layout and Add
        jf.setLayout(new GridLayout(4, 1));
        jf.add(f1);
        jf.add(f2);
        jf.add(jp);
        jf.add(f3);
        jp.add(jbt1);
        jp.add(jbt2);
        jp.add(jbt3);
        jp.add(jbt4);
        
        jf.setBounds(500, 200, 280, 180);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(jbt1)){
            double num1 = (double)((Double.parseDouble(f1.getText())));
            double num2 = (double)((Double.parseDouble(f2.getText())));
            double total = num1 + num2;
            f3.setText(total+"");
        }else if(ae.getSource().equals(jbt2)){
            double num1 = (double)((Double.parseDouble(f1.getText())));
            double num2 = (double)((Double.parseDouble(f2.getText())));
            double total = num1 - num2;
            f3.setText(total+"");
        }else if(ae.getSource().equals(jbt3)){
            double num1 = (double)((Double.parseDouble(f1.getText())));
            double num2 = (double)((Double.parseDouble(f2.getText())));
            double total = num1 * num2;
            f3.setText(total+"");
        }else if(ae.getSource().equals(jbt4)){
            double num1 = (double)((Double.parseDouble(f1.getText())));
            double num2 = (double)((Double.parseDouble(f2.getText())));
            double total = num1 / num2;
            f3.setText(total+"");
        }
    }
}
