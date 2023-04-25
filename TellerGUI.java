import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame jf;
    private JPanel jp1, jp2, jp3;
    private JButton deposit, withdraw, exit;
    private JLabel lb1, lb2, lb3;
    private JTextField text, text1;
    private Account acct;
    public TellerGUI(){
        acct = new Account(6000, "");
        JFrame jf = new JFrame("Teller GUI");
        JPanel jp1 = new JPanel();
        JPanel jp2 =  new JPanel();
        JPanel jp3 = new JPanel();
        deposit = new JButton("Deposit"); withdraw = new JButton("Withdraw"); exit = new JButton("Exit");
        text = new JTextField();
        lb1 = new JLabel("   Balance");
        lb2 = new JLabel("   Amount");
        text1 = new JTextField();
        text1.setEditable(false); //set edit
        text1.setText(acct.getBalance()+"");
        
        //set Layout and add
        jf.setLayout(new GridLayout(4, 1));
        jp1.setLayout(new GridLayout(1, 2));
        jp2.setLayout(new GridLayout(1, 2));
        jp3.setLayout(new FlowLayout());
        jf.add(jp1);
        jf.add(jp2);
        jf.add(jp3);       
        jp1.add(lb1); jp1.add(text1);
        jp2.add(lb2); jp2.add(text);
        jp3.add(deposit); jp3.add(withdraw); jp3.add(exit);
        
        //add ActionListener
        deposit.addActionListener(this); withdraw.addActionListener(this); exit.addActionListener(this);
        
        jf.setBounds(500, 200, 280, 180);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //set
        if(e.getSource().equals(deposit)){
            text1.setText(acct.getBalance() + Double.parseDouble(text.getText())+"");
        }
        if(e.getSource().equals(withdraw)){
            if(acct.getBalance() > Double.parseDouble(text.getText())){
                text1.setText(acct.getBalance() - Double.parseDouble(text.getText())+"");
            }
        }
        if(e.getSource().equals(exit)){
            System.exit(0);
        }
    }
}
