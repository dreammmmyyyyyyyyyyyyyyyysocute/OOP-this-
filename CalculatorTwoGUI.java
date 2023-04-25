import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorTwoGUI implements ActionListener{
    private JFrame jf;
    private JPanel jp;
    private JButton b7, b8, b9, b4, b5, b6, b1, b2, b3, b0;
    private JButton add, sub, mul, div, equ, c;
    private JTextField text;
    private double num1, num2, total;
    private char operator;
    
    public CalculatorTwoGUI(){
        JFrame jf = new JFrame("My Calculator");
        b7 = new JButton("7"); b8 = new JButton("8"); b9 = new JButton("9"); add = new JButton("+");
        b4 = new JButton("4"); b5 = new JButton("5"); b6 = new JButton("6"); sub = new JButton("-");
        b1 = new JButton("1"); b2 = new JButton("2"); b3 = new JButton("3"); mul = new JButton("x");
        b0 = new JButton("0"); c = new JButton("c"); equ = new JButton("="); div = new JButton("/");
        
        //Add Listener
        b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); add.addActionListener(this);
        b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); sub.addActionListener(this);
        b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); mul.addActionListener(this);
        b0.addActionListener(this); c.addActionListener(this); equ.addActionListener(this); div.addActionListener(this);
        
        text = new JTextField();
        text.setHorizontalAlignment(JTextField.RIGHT); //number keep right
        JPanel jp = new JPanel();
        
        jf.setLayout(new BorderLayout());
        jf.add(text, BorderLayout.NORTH);
        
        jp.setLayout(new GridLayout(4, 4));
        jp.add(b7); jp.add(b8); jp.add(b9); jp.add(add);
        jp.add(b4); jp.add(b5); jp.add(b6); jp.add(sub);
        jp.add(b1); jp.add(b2); jp.add(b3); jp.add(mul);
        jp.add(b0); jp.add(c); jp.add(equ); jp.add(div);
        jf.add(jp);     
        
        jf.setBounds(500, 200, 280, 280);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        //set1
        if(ae.getSource().equals(b7)){
            text.setText(text.getText().concat(String.valueOf("7")));
        }
        else if(ae.getSource().equals(b8)){
            text.setText(text.getText().concat(String.valueOf("8")));
        }
        else if(ae.getSource().equals(b9)){
            text.setText(text.getText().concat(String.valueOf("9")));
        }
        else if(ae.getSource().equals(add)){
            num1 = Double.parseDouble(text.getText()); 
            operator = '+';
            text.setText("");
        }
        //set2
        else if(ae.getSource().equals(b4)){
            text.setText(text.getText().concat(String.valueOf("4")));
        }
        else if(ae.getSource().equals(b5)){
            text.setText(text.getText().concat(String.valueOf("5")));
        }
        else if(ae.getSource().equals(b6)){
            text.setText(text.getText().concat(String.valueOf("6")));
        }
        else if(ae.getSource().equals(sub)){
            num1 = Double.parseDouble(text.getText());
            operator = '-';
            text.setText("");
        }
        //set3
        else if(ae.getSource().equals(b1)){
            text.setText(text.getText().concat(String.valueOf("1")));
        }
        else if(ae.getSource().equals(b2)){
            text.setText(text.getText().concat(String.valueOf("2")));
        }
        else if(ae.getSource().equals(b3)){
            text.setText(text.getText().concat(String.valueOf("3")));
        }
        else if(ae.getSource().equals(mul)){
            num1 = Double.parseDouble(text.getText());
            operator = 'x';
            text.setText("");
        }
        //set4
        else if(ae.getSource().equals(b0)){
            text.setText(text.getText().concat(String.valueOf("0")));
        }
        else if(ae.getSource().equals(c)){
            text.setText("");
        }
        else if(ae.getSource().equals(div)){
            num1 = Double.parseDouble(text.getText());
            operator = '/';
            text.setText("");
        }
        else if(ae.getSource().equals(equ)){
            num2 = Double.parseDouble(text.getText());
            
            if(operator == '+'){
                total = num1 + num2;
            }else if(operator == '-'){
                total = num1 - num2;
            }else if(operator == 'x'){
                total = num1*num2;
            }else if(operator == '/'){
                total = num1/num2;
            }
            text.setText(total+"");
        }
    }
}
