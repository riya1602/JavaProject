package desktop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 24/7/18.
 */
public class Calculator implements ActionListener {
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JButton b1;
    JButton b2;

    Calculator(){
        JFrame f=new JFrame("CALCULATOR");
        f.setLayout(null);
        f.setSize(500,500);
        text1 =new JTextField();
        text2 =new JTextField();
        text3 =new JTextField();
        b1=new JButton("+");
        b2=new JButton("-");
        f.add(text1);
        f.add(text2);
        f.add(text3);
        f.add(b1);
        f.add(b2);
        text1.setBounds(100,100,75,50);
        text2.setBounds(100,200,75,50);
        text3.setBounds(100,300,75,50);
        b1.setBounds(100,400,75,50);
        b2.setBounds(300,400,75,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=text1.getText();
        String s2=text2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
                c=a+b;

        }
        if(e.getSource()==b2){
            c=a-b;

        }
        String s3=Integer.toString(c);
        text3.setText(s3);
    }
}
